package edu.jspider.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Arshad Alam", 101, 55000.00);
		Employee employee2 = new Employee("Rivu Naskar", 301, 85000.00);
		Employee employee3 = new Employee("Akhil Pandu", 201, 50000.00);
		Employee employee4 = new Employee("Sashti Mondal", 501, 45000.00);
		Employee employee5 = new Employee("Allu Arjun", 401, 95000.00);
		List<Employee> list = new ArrayList<>();
		list.add(employee5);
		list.add(employee4);
		list.add(employee3);
		list.add(employee2);
		list.add(employee1);
		
		Collections.sort(list);
		for(Employee e : list)
			System.out.println(e);
		//Sorting based on id :
		Comparator<Employee> comp=(o1,o2)->o1.getEmpId()-o2.getEmpId();
		Collections.sort(list, comp);
		for(Employee e : list)
			System.out.println(e);
		
		// Sorting based on salary :
		comp=(o1,o2)->(int)(o1.getEmpSalary()-o2.getEmpSalary());
		Collections.sort(list, comp);
		for(Employee e : list)
			System.out.println(e);
	}
}
