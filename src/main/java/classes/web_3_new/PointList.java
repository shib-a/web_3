package classes.web_3_new;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

@Named("pointListBean")
//@ManagedBean
@ApplicationScoped
public class PointList implements Serializable {
    @PostConstruct
    public void init(){
        try{
            var ds = new DatabaseService();
            setPointList(ds.getAllPoints());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private ArrayList<Point> pointList = new ArrayList<>();
//    private PointList(){
//        pointList = new ArrayList<>();
//    }
    public void add(Point p){
        pointList.add(p);
    }
    public ArrayList<Point> getPointList(){
        return pointList;
    }

    public void setPointList(ArrayList<Point> pointList) {
        this.pointList = pointList;
    }
    public void clean(){
        var ds = new DatabaseService();
        ds.cleanPoints();
        this.pointList = new ArrayList<>();
    }
    @Inject
    private Instance<Point> pointBean;
    public void handle(){
        var point = pointBean.get();
        point.setHit(validateHit(point.getX(),point.getY(),point.getR()));
        var np = new Point();
        np.setX(point.getX());
        np.setY(point.getY());
        np.setR(point.getR());
        np.setHit(point.getHit());
        pointList.add(np);
        try{
            var ds = new DatabaseService();
            ds.addPoint(np.getX(),np.getY(),np.getR(),np.getHit());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public Boolean validateHit(double x, double y, double r){
        return checkCircle(x,y,r) || checkRect(x,y,r) || checkTriangle(x,y,r);
    }
    public Boolean checkTriangle(double x, double y, double r){
        return (x>=0 && y>=0 && x<=r && y<=r/2 && x+y-r<=0);
    }
    public Boolean checkRect(double x, double y, double r){
        return (x>=-r/2 && y<=r && x<=0 && y>=0);
    }
    public Boolean checkCircle(double x, double y, double r){
        return ((Math.pow(x,2) + Math.pow(y,2) <= Math.pow(r,2)) && x<=0 && y<=0);
    }
//    public PointList(){
//        var ds = new DatabaseService();
//        this.pointList=ds.getAllPoints();
//    }
}
