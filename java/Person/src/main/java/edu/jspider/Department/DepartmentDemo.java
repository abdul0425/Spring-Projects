package edu.jspider.Department;

import java.util.ArrayList;
import java.util.List;

import edu.jspider.AssociationRepository.AssociationRepository;
import edu.jspider.Employee.Employee;

public class DepartmentDemo {

	public static void main(String[] args) {

		Department dept1 = new Department();
		dept1.setDeptName("Software Engineer");
		Department dept2 = new Department();
		dept2.setDeptName("Manager");
		
		Employee emp4 = new Employee();
		emp4.setEmpName("Ram Charan");
		emp4.setContactNumber("9876534638");
		emp4.setDept(dept2);
		Employee emp5 = new Employee();
		emp5.setEmpName("Prabhas");
		emp5.setContactNumber("1234545678");
		emp5.setDept(dept2);
		Employee emp6 = new Employee();
		emp6.setEmpName("Rolex");
		emp6.setContactNumber("9999999999");
		emp6.setDept(dept2);
		List<Employee> list = new ArrayList<>();
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		
		
		
		
		AssociationRepository repository = new AssociationRepository();
		repository.saveEmployeeDetails(emp4);
		repository.saveEmployeeDetails(emp5);
		repository.saveEmployeeDetails(emp6);
		
	}

}
