package com.kl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		
		Transaction t= s.beginTransaction();
		Query q = s.createSQLQuery("insert into Emp(tid,tname,tsal) values (50, 'Russel Crew', 15959)");
		q.executeUpdate();
	}

}