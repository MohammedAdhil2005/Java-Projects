package runnable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import Template.student;

public class mainnn {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(student.class).buildSessionFactory();
		
		Session openSession = sf.openSession();
		
		Transaction beginTransaction = openSession.beginTransaction();

		
		
		/* FOR GETTING DETAILS FROM FILTERING NAME
		
		String hql="FROM student WHERE name LIKE 'a%'";
		Query query = openSession.createQuery(hql);
		
		List l1=query.list();
		
		for(Object a:l1) {
			System.out.println(a);
		}
		
		*/
		
		
		/* FOR GETTING THE RECORD SPECIFIC ID
		 
		student s = openSession.get(student.class, 101);
		System.out.println(s);
		
		*/
		
		/*FOR INSERTING DATA TO THE TABLE
		
		student s=new student(101,"Adhil","adhil@gmail.com");
		Serializable save = openSession.save(s);		
		beginTransaction.commit();
		
		*/

	}

}
