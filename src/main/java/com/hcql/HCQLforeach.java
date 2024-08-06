package com.hcql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.kl.Employee;

public class HCQLforeach {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        
        Transaction t = s.beginTransaction();
        
        Criteria cr =s.createCriteria(Employee.class);
        List<Employee> l = cr.list();
        
        for (Employee x : l) {
            System.out.println(x.getEname());
        }
        
        t.commit();
        s.close();
        sf.close();
    }
}