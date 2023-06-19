package edu.jspider.Zomato;

import java.util.ArrayList;
import java.util.List;

import edu.jspider.Customer.Customer;
import edu.jspider.ManyToManyRepository.MTMRepository;

public class ZomatoDriver {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setCustomerName("Jr NTR");
		customer1.setContactNumber("1234554321");
		customer1.setAddress("Bengaluru");

		Customer customer2 = new Customer();
		customer2.setCustomerName("Allu Arjun");
		customer2.setContactNumber("9876556789");
		customer2.setAddress("Chennai");

		Customer customer3 = new Customer();
		customer3.setCustomerName("Allu Arjun");
		customer3.setContactNumber("9876512345");
		customer3.setAddress("Hydrabad");

		Zomato zomato1 = new Zomato();
		zomato1.setBranchName("Marathahalli");
		zomato1.setManager("Rivu Rascal");
		zomato1.setAddress("Bengaluru 700301");

		Zomato zomato2 = new Zomato();
		zomato2.setBranchName("BTM Layout");
		zomato2.setManager("Akhil Pandu");
		zomato2.setAddress("Bengaluru 700305");

		Zomato zomato3 = new Zomato();
		zomato3.setBranchName("Phoneix Mall");
		zomato3.setManager("Rolex Sir");
		zomato3.setAddress("Bengaluru 700001");

		List<Customer> customerList = new ArrayList<>();
		List<Zomato> zomatoList = new ArrayList<>();

		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);

		zomatoList.add(zomato1);
		zomatoList.add(zomato2);
		zomatoList.add(zomato3);

		customer1.setZomatoList(zomatoList);
		customer2.setZomatoList(zomatoList);
		customer3.setZomatoList(zomatoList);

		zomato1.setCustomerList(customerList);
		zomato2.setCustomerList(customerList);
		zomato3.setCustomerList(customerList);

		MTMRepository.saveCustomerDetails(customer1);
		MTMRepository.saveCustomerDetails(customer2);
		MTMRepository.saveCustomerDetails(customer3);

		MTMRepository.saveZomatoDetails(zomato1);
		MTMRepository.saveZomatoDetails(zomato2);
		MTMRepository.saveZomatoDetails(zomato3);
	}
}
