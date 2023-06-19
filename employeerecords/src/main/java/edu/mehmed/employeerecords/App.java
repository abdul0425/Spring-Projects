package edu.mehmed.employeerecords;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.mehmed.employeerecords.entity.Employee;
import edu.mehmed.employeerecords.repository.Repository;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void saveEmployee(Employee employee) {
		
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(employee);
			
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
    public static void main( String[] args )
    {
        Employee employee = new Employee();
        employee.setEmployeeId(201L);
        employee.setEmployeeName("Python");
        employee.setEmployeeSalary(40000.00);
        employee.setAddress("Karnataka");
        
        
        App.saveEmployee(employee);
        
        
    }
}
