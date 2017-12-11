package com.github.virovinrom;

import com.github.virovinrom.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataBase {
    EntityManager entityManager;
    EntityManagerFactory entityManagerFactory;

    public DataBase() {
        entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        entityManager = entityManagerFactory.createEntityManager();

    }

    public void addToDatabase(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
    }

    public User returnFromDatabase() {
        entityManager.getTransaction().begin();
        return entityManager.find(User.class, 1);
    }
    public void exitFromTransaction() {
        entityManager.getTransaction().commit();
    }
    public void exitFromDatabase() {
        entityManager.close();
        entityManagerFactory.close();
    }
}
