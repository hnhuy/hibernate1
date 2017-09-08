package com.kolido.App;

import org.hibernate.Session;

import com.kolido.model.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		
		// do sth
		Student s = new Student();
		s.setFirstName("moc");
		s.setLastName("tram");
		s.setSection("chemistry");
		
		session.save(s);
		
		session.getTransaction().commit();
		session.close();
	}
}
