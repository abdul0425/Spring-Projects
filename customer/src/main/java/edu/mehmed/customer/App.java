package edu.mehmed.customer;

import edu.mehmed.customer.model.Customer;
import edu.mehmed.customer.repository.CustomerRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        CustomerRepository repository = new CustomerRepository();
        
        Customer customer1 = new Customer();
        customer1.setName("Sampu The Legend");
        customer1.setAge("33");
        customer1.setContact("888687434");
        customer1.setAddress("Belanduru, Bangalore");
        
        repository.saveCustomer(customer1);
    }
}
