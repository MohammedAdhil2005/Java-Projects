package Hibernate_Projects;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class worker_main {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(worker.class).addAnnotatedClass(worker_details.class).buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		
		
		
		//  FOR ENTERING DETAILS INTO TABLE
		 
		/*
		worker w=new worker(401,"Adhil");	
		worker_details wd=new worker_details(1,"adhil@gmail.com","UDT",8610555);
		w.setWorker_details(wd);
		
		Serializable save = openSession.save(w);
		
		beginTransaction.commit();
		*/
		
		
		
		// FOR GETTING SPECIFIC DATA NY USING ID
		 
		/*
		worker worker = openSession.get(worker.class, 401);
		System.out.println(worker);
		*/
		
		
		
		//  FOR GETTING COMPLETE DETAILS BY SELECTING THE WORKER ID 
		
		/*
		worker worker = openSession.get(worker.class, 401);
		worker_details  worker_details= worker.getWorker_details();
		
		System.out.println(worker);
		System.out.println(worker_details);
		*/
		
		
		
		// FOR UPDATE PHONENO 
		
		/*
		worker worker = openSession.get(worker.class, 401);
		worker.getWorker_details().setPhoneno(1234567);
		beginTransaction.commit();
		
		*/
		
		
		
		// FOR DELETE THE RECORD 
		 
		/*
		worker worker = openSession.get(worker.class, 401);
		openSession.delete(worker);
		System.out.println("Deleted successfully");
		beginTransaction.commit();
		
		*/
		
		
		
		//BY DIRECTION 
		

		
		
	}

}
