package classes.web_3_new;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
import java.util.ArrayList;

@Named("pointListBean")
//@ManagedBean
@ApplicationScoped
public class PointList {
    private ArrayList<Point> pointList;

    private PointList(){
        pointList = new ArrayList<>();
    }
    public void add(Point p){
        pointList.add(p);
    }
    public ArrayList<Point> getPointList(){
        return pointList;
    }
    @Inject
    private Instance<Point> pointBean;
    public void handle(){
        var point = pointBean.get();
        pointList.add(point);
        System.out.println(point.toString());
    }
}
