package edu.jspider.AssociationRepository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.jspider.Employee.Employee;
import edu.jspider.Mobile.Mobile;
import edu.jspider.PersonEntity.Person;

public class AssociationRepository {

	public void savePersonDetails(Person person) {
		try {
			Session session = new Configuration().configure().buildSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.save(person);
			transaction.commit();
		} catch (Exception e) {

		}
	}

	public void saveMobileDetails(Mobile mobile) {
		try {
			Session session = new Configuration().configure().buildSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.save(mobile);
			transaction.commit();
		} catch (Exception e) {

		}
	}
	
	public void saveEmployeeDetails(Employee emp) {
		try {
			Session session = new Configuration().configure().buildSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.save(emp);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
