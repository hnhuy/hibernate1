package com.kolido.App;

import java.io.IOException;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kolido.model.Student;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static Configuration config;
	
	//init sessionfactory
	static {
		config = new Configuration();
		Properties properties = new Properties();
		try {
			properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("hibernate.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("error load " + e);
		}
		config.addAnnotatedClass(Student.class);
		
	}
	
	public static SessionFactory getSessionFactory(){
		sessionFactory = config.buildSessionFactory();
		return sessionFactory;
	}
}
