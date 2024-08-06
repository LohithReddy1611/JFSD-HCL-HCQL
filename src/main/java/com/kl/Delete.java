package com.kl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		
		Transaction t= s.beginTransaction();
		
		Query q = s.createQuery("delete from Employee where id = 49");
		q.executeUpdate();
		
	}

}