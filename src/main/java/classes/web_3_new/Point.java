package classes.web_3_new;

import jakarta.inject.Named;

//import javax.faces.bean.RequestScoped;
import jakarta.enterprise.context.RequestScoped;
import java.util.Objects;


@Named("pointBean")
//@ManagedBean
@RequestScoped
public class Point {
    private double x;
    private double y;
    private double r;
    private Double raw_x;
    private Double raw_y;
    private boolean hit;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    public Point(double x, double y, double r, boolean hit, Double raw_x, Double raw_y){
//        this.r = r;
//        this.x = x;
//        this.y = y;
//        this.raw_x=raw_x;
//        this.raw_y = raw_y;
//        this.hit = hit;
//    }
//    public Point(){}
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

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setRaw_x(Double raw_x) {
        this.raw_x = raw_x;
    }

    public void setRaw_y(Double raw_y) {
        this.raw_y = raw_y;
    }

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
    public Point getBean(){
        return this;
    }
}
