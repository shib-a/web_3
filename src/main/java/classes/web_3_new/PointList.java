package classes.web_3_new;

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

    @Inject
    private Instance<Point> pointBean;
    public void handle(){
        var point = pointBean.get();
        var np = new Point();
        np.setX(point.getX());
        np.setY(point.getY());
        np.setR(point.getR());
        np.setHit(point.getHit());
        pointList.add(np);
        for(var el: getPointList()){
            System.out.println(el.toString());
        }
    }
}
