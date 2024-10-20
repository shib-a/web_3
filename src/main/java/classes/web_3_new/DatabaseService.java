package classes.web_3_new;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class DatabaseService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("web_3");
    public ArrayList<Point> getAllPoints(){
        EntityManager em = emf.createEntityManager();
        List<Double> points = em.createQuery("select x from Point").getResultList();
        return null;
    }
}
