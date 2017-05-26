package com.uofoegbu.model;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DatabaseUtil {

    private static SessionFactory sessionFactory = getSessionFactory();

    public static void main(String[] args){
        System.out.println("Done");
    }

    private static SessionFactory getSessionFactory() {
        SessionFactory sessionFactoryObject = null;
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
                configuration.addAnnotatedClass(com.uofoegbu.model.Task.class);
                ServiceRegistry registry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties())
                        .build();
                sessionFactoryObject = configuration.buildSessionFactory(registry);
            } catch (HibernateException e) {
                System.err.println("Problem Creating sessionFactory");
                e.printStackTrace();
            }
        }
        return sessionFactoryObject;
    }

    private static Session createSession(){
        Session session = null;
        try {
            session = sessionFactory.openSession();

        } catch (HibernateException e) {
            System.err.println("Session Not created");
            e.printStackTrace();
        }
        return session;
    }

    public static void saveTask(Task task){
        Session session = createSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(task);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        }
    }

    public static void saveUser(){

    }
}
