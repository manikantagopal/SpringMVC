package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create session factory
		SessionFactory factory = new Configuration()
				                .configure("hibernate.cfg.xml")
				                .addAnnotatedClass(Instructor.class)
				                .addAnnotatedClass(InstructorDetail.class)
				                .buildSessionFactory();
		//create session
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
			
			//use the session object to save Java object
			
			
			
			//start a transaction
			session.beginTransaction();
			
			int theId = 2;
			System.out.println("id"+theId);
			Instructor temp = session.get(Instructor.class,theId);
			System.out.println("found id"+temp);
			
			//delete the instructor
			if (temp != null) {
				System.out.println("in try");
				session.delete(temp);
			}
			
			//commit transaction
			session.getTransaction().commit();
		}
		finally
		{
			factory.close();
		}
		
		
		
		
		
		
		

	}

}
