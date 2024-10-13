package classes.web_3_new;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;

@Named("pointBean")
@ManagedBean
@SessionScoped
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
}
