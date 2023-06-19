package edu.mehmed.employeerecords.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.mehmed.employeerecords.entity.Employee;

public class Repository {

	public void saveEmployeeDetails(Employee employee) {
		try {
			Session session = new Configuration().configure().buildSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.save(employee);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
