package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {

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
			//create the objects
//			Instructor temp1 = new Instructor("Jeethu","Bhaiya","Kotafactory@gmail.com");
//			InstructorDetail temp2 = new InstructorDetail("http://www.luv2code.com/youtube",
//					"Motivation");
			
			Instructor temp1 = new Instructor("Ashok1","Reddy","pulihara@gmail.com");
			InstructorDetail temp2 = new InstructorDetail("http://www.pulihara.com/youtube",
					"Flirting in Instragram");
			
			//associate the objects
			temp1.setInstructionDetail(temp2);
			
			//use the session object to save Java object
			
			
			
			//start a transaction
			session.beginTransaction();
			
			//save the instructor object
			session.save(temp1);
			
			//commit transaction
			session.getTransaction().commit();
		}
		finally
		{
			factory.close();
		}
		
		
		
		
		
		
		

	}

}
