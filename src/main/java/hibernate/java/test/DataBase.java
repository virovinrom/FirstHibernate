package hibernate.java.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataBase {
    EntityManager entityManager;
    EntityManagerFactory entityManagerFactory;

    public DataBase() {
        entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    public void addToDatabase(Object object) {
        entityManager.persist(object);
    }

    public User returnFromDatabase() {
        return entityManager.find(User.class, 1);
    }

    public void exitFromDatabase() {
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
