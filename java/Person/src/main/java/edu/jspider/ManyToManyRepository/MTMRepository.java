package edu.jspider.ManyToManyRepository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.jspider.Customer.Customer;
import edu.jspider.Zomato.Zomato;

public class MTMRepository {

	public static void saveCustomerDetails(Customer customer)
	{
		try {
			Session session = new Configuration().configure().buildSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.save(customer);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void saveZomatoDetails(Zomato zomato)
	{
		try {
			Session session = new Configuration().configure().buildSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.save(zomato);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
