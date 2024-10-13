package classes.web_3_new;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0 && Double.compare(r, point.r) == 0 && hit == point.hit && Objects.equals(raw_x, point.raw_x) && Objects.equals(raw_y, point.raw_y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, r, raw_x, raw_y, hit);
    }
}
