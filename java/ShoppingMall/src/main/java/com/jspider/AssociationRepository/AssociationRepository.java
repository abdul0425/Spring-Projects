package com.jspider.AssociationRepository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspider.PersonEntity.Person;

public class AssociationRepository {

	public void savePersonDetails(Person person) {
		try {
			Session session = new Configuration().configure().buildSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.save(person);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
