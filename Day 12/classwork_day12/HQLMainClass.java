package com.coforge.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.coforge.model.Employee;



public class HQLMainClass {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		/*Query query = session.createQuery("from Employee");
		List<Employee> list = query.list();
		System.out.println(list);   HQL SELECT*/ 
		
		//HQL static SELECT
		/*Query query = session.createQuery("from Employee where eid = 201");
		List<Employee> list = query.list();
		System.out.println(list);*/

		//HQL Dynamic SELECT
		/*Query query = session.createQuery("from Employee where eid =: id");
		query.setParameter("id", 102);
		List<Employee> list = query.list();
		System.out.println(list);*/
		
		//HQL Specific Column SELECT
		/*Query query = session.createQuery("select ename from Employee");
		List<Employee> list = query.list();
		System.out.println(list);*/
		
		//HQL UPDATE
		Query query = session.createQuery("update Employee set ename = :name where eid = :id");
		query.setParameter("name", "abc");
		query.setParameter("id", 103);
		int n = query.executeUpdate();
		if(n==1) System.out.println("Employee Object is updated");
		else System.out.println("Employee Object isnt updated");
		
	
		transaction.commit();
		session.close();
		factory.close();
		
		System.out.println("Employee Object Updated");

	}

}
