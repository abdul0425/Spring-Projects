package com.jspider.Utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Resource {

	public static SessionFactory sessionFactoryObject()
	{
		return new Configuration().configure().buildSessionFactory();
	}
}
