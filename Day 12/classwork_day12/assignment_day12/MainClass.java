package com.coforge.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Course;
import com.coforge.model.Student;

public class MainClass {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Student Gundu = session.get(Student.class, 1);

		
		  Student Siddu = session.get(Student.class, 2);
		  
		  Student Enkates = session.get(Student.class, 3);
		 
		  Course Java = session.get(Course.class, 51);
		  
		  Course SpringBoot = session.get(Course.class, 52);
		  
		  Course Hibernate = session.get(Course.class, 53);
		  
		  Course Angular = session.get(Course.class, 54);
		  
		  List<Course> list = new ArrayList<>(); 
		  list.add(Java); 
		  list.add(SpringBoot);
		 list.add(Hibernate);
		
		 Gundu.setCourses(list);
		
		transaction.commit();
		session.close();
		factory.close();

	}

}
