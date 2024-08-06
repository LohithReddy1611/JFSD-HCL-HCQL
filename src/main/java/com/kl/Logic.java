package com.kl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) 
	{
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t= s.beginTransaction();

		Query  q=s.createQuery("from Employee");
		List<Employee> l = q.list();

	    for (Employee X:l) {
	    System.out.println(X.getEname());
	    System.out.println(X.getEsal());
	    }
	    t.commit();
	    s.close();
	    sf.close();
		
		


}
}




