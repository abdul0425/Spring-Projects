package edu.jspider.Java8Features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee("Arshad Alam", 101, 55000);
		Employee e2=new Employee("Rivu Naskar", 201, 53000);
		Employee e3=new Employee("Akhil Pandu", 301, 50000);
		Employee e4=new Employee("Keerthi Suresh", 401, 72000);
		Employee e5=new Employee("Sai Pallavi", 501, 75000);
		Employee e6=new Employee("Allu Arjun", 601, 142000);
		Employee e7=new Employee("Ram Charan", 701, 135000);
		Employee e8=new Employee("Jr NTR", 801, 138000);
		Employee e9=new Employee("Ravi Teja", 901, 84000);
		Employee e10=new Employee("Nayantara", 1001, 135000);

		List<Employee> l = new ArrayList<>();
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		l.add(e7);
		l.add(e8);
		l.add(e9);
		l.add(e10);
		
		/*
		 * Comparator<Employee> comp=new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) { return
		 * (int)(o1.empSalary-o2.empSalary); } };
		 */
		
//		Optional<Employee> emp1=l.stream().max(Comparator.comparing(Employee::getEmpSalary));
//		System.out.println(emp1);
//		//Optional<Employee> emp1=l.stream().max(Comparator.comparing(Employee::getEmpSalary));
		
//		Employee emp=l.stream().max((x1,x2)-> (int) (x1.getEmpSalary()-x2.getEmpSalary())).get();
//		System.out.println(emp.getEmpName());
		
		Employee employeeWithMaxSalary = l.stream().max((emp1,emp2)->(int)(emp1.getEmpSalary()-emp2.getEmpSalary())).get();
		System.out.println("Employee Having Highest Salary : "+employeeWithMaxSalary);
		
		Employee employeeWithLowestSalary = l.stream().min((emp1,emp2)->(int)(emp1.getEmpSalary()-emp2.getEmpSalary())).get();
		System.out.println("Employee Having Lowest Salary : "+employeeWithLowestSalary);
		
		l.stream().sorted((emp1,emp2)->(int)(emp1.getEmpSalary()-emp2.getEmpSalary())).forEach(x->System.out.println(x));
	}
}
