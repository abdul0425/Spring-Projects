package edu.mehmed.customer.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import edu.mehmed.customer.constant.MySessionFactory;
import edu.mehmed.customer.model.Customer;

public class CustomerRepository {

	SessionFactory sessionFactory = MySessionFactory.sessionFactoryReference();

	public void saveCustomer(Customer customer) {
		try {
			Session session = sessionFactory.openSession();
			session.save(customer);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void updateCustomer(Customer customer, Long id) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Customer updatedCustomer = session.get(Customer.class, id);
			updatedCustomer.setName(customer.getName());
			updatedCustomer.setContact(customer.getContact());
			updatedCustomer.setAge(customer.getAge());
			updatedCustomer.setAddress(customer.getAddress());

			session.update(updatedCustomer);
			transaction.commit();
			session.close();
			System.out.println("Customer Update Successfully !");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void deleteCustomer(Long id) {
		try {
				Session session = sessionFactory.openSession();
				Customer customer = session.get(Customer.class, id);
				Transaction transaction = session.beginTransaction();
				session.delete(customer);
				transaction.commit();
				session.close();
				System.out.println("Customer Deleted Successfully with id : "+id);
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void readCustomer(Long id) {

		try {
			Session session = sessionFactory.openSession();
			Customer customer = session.get(Customer.class, id);
			System.out.println(customer);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void getAllCustomer() {
		String query = "from Customer";
		Session session = sessionFactory.openSession();
		Query createQuery = session.createQuery(query);
		List<Customer> list = createQuery.list();
		for (Customer customer : list) {
			System.out.println(customer);
		}
	}
}
