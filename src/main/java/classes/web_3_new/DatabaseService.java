package classes.web_3_new;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class DatabaseService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("classes.web_3_new");

    public ArrayList<Point> getAllPoints(){
        EntityManager em = emf.createEntityManager();
        List<Point> points = em.createQuery("SELECT point FROM Point", Point.class ).getResultList();
        return new ArrayList<>(points);
    }
    public void addPoint(double x, double y, double r, boolean hit){
        EntityManager em = emf.createEntityManager();
        var newPoint = new Point();
        newPoint.setX(x);
        newPoint.setY(y);
        newPoint.setR(r);
        newPoint.setHit(hit);
        em.getTransaction().begin();
        em.persist(newPoint);
        em.getTransaction().commit();
        em.close();
    }
    public void cleanPoints(){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("delete from Point", Point.class).executeUpdate();
        em.getTransaction().commit();
    }
}
