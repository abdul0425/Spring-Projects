package edu.jspider.AssociationRepository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.jspider.MobileEntity.Mobile;

public class Repository {

	public void saveMobileDetails(Mobile mobile)
	{
		try {
			Session session = new Configuration().configure().buildSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.save(mobile);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
