package com.nucleus;

import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;


public class App 
{
	public static void main(String[]args)
	{
		Configuration con=new Configuration().configure("com/nucleus/hibernate.cfg.xml").addAnnotatedClass(Department.class);
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		 Transaction tx=session.beginTransaction();
	
		Query q= session.createQuery("from Department");
		
		List<Department>departments=q.list();
		int newamt=0;
		int newroi=0;
		int newyear=0;
		for(Department d:departments)
		{
			newamt=d.getAmount();
			 newroi=d.getRoi();
			newyear=d.getYear();
			
		}
	
		
		session.getTransaction();
	
	
	
	  
	  tx.commit();
	 
	
		
	}

}
