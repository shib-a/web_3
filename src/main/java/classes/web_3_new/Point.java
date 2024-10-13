package classes.web_3_new;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="point")
@SessionScoped
public class Point {
    double x;
    double y;
    double r;
    Double raw_x;
    Double raw_y;
    boolean hit;
    public Point(double x, double y, double r, boolean hit, Double raw_x, Double raw_y){
        this.r = r;
        this.x = x;
        this.y = y;
        this.raw_x=raw_x;
        this.raw_y = raw_y;
        this.hit = hit;
    }

    public double getR() {
        return r;
    }

    public Double getRaw_x() {
        return raw_x;
    }

    public Double getRaw_y() {
        return raw_y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
    public boolean getHit(){
        return hit;
    }
//    public HashMap<String, Double> toDumbAssCoords(Double curr_rad){
//        var svgX = (x*(140/curr_rad));
//        var svgY = -(y)*(140/curr_rad);
//        var hm = new HashMap<String, Double>();
//        hm.put("x", svgX);
//        hm.put("y",svgY);
//        System.out.println(hm.get("x")+" "+ hm.get("y"));
//        return hm;
//    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                ", raw_x=" + raw_x +
                ", raw_y=" + raw_y +
                ", hit=" + hit +
                '}';
    }
}
