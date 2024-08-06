package com.kl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLRet {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        
        Transaction t = s.beginTransaction();
        String hql="from Employee";
        Query<Employee> q = s.createQuery(hql, Employee.class);
        List<Employee> l = q.list();
        
        for (Employee x : l) {
            System.out.println(x.getEname());	
        }
        
        t.commit();
        s.close();
        sf.close();
    }
}