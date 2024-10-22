package classes.web_3_new;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Named("pointBean")
//@ManagedBean
@ViewScoped
@Entity
@Table(name="points")
public class Point implements Serializable {
    @Id
    @GeneratedValue
//    @GeneratedValue
//    @Column(name = "POINT_ID")
    protected long id;
    private double x;
    private double y;
    private double r;
    private boolean hit;
    public double getR() {
        return r;
    }
//    public Point(double x, double y, double r){
//        this.x=x;
//        this.y=y;
//        this.r=r;
//    }


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
        System.out.println(x);
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }

    public void setR(double r) {
        this.r = r;
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                ", hit=" + hit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0 && Double.compare(r, point.r) == 0 && hit == point.hit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, r, hit);
    }
    public Point getBean(){
        return this;
    }

}
