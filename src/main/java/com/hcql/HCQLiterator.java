package com.hcql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kl.Employee;

	public class HCQLiterator {

		public static void main(String[] args) 
		{
			Configuration cfg= new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory sf = cfg.buildSessionFactory();
			Session s = sf.openSession();
			
			Transaction t= s.beginTransaction();

			 
	        Criteria cr =s.createCriteria(Employee.class);
	        List<Employee> l = cr.list();
			Iterator<Employee> i = l.iterator();
			    
			    while(i.hasNext()) {
				Employee e = i.next();
				System.out.println(e.getEname());
				System.out.println(e.getEsal());
			    }
				
				 
			    t.commit();
			    s.close();
			    sf.close();
				
			}
		}
	
				

		   
		   
			
		






