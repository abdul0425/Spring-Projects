package edu.jspider.association_repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.jspider.entity.Passenger;

public class Repository {

	@SuppressWarnings("deprecation")
	public void savePassengerDetails(Passenger passenger)
	{
		try {
			Session session = new Configuration().configure().buildSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.save(passenger);
			transaction.commit();
			session.close();
			
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
}
