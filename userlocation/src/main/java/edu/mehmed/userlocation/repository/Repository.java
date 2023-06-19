package edu.mehmed.userlocation.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.mehmed.userlocation.entity.CountryEntity;
import edu.mehmed.userlocation.entity.StateEntity;
@Component
public class Repository {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveStateDetails(StateEntity stateEntity) {
		Session session = sessionFactory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			session.merge(stateEntity);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public void saveCountryDetails(CountryEntity countryEntity) {
		Session session = sessionFactory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			session.merge(countryEntity);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
