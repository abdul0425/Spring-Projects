package edu.mehmed.customer.constant;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class MySessionFactory {

	private static SessionFactory factory;

	public static SessionFactory sessionFactoryReference() {
		if (factory == null)
			return new Configuration().configure().buildSessionFactory();
		return factory;
	}

}
