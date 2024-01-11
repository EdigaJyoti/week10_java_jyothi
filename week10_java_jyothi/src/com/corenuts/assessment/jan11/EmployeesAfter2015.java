package com.corenuts.assessment.jan11;

import java.util.List;

public class EmployeesAfter2015 {
	
	public static void main(String[] args) {
		
		EmployeeList employees = new EmployeeList();
		List<Employee> list = employees.listOfEmployees();
		
		list.stream()
			.filter(a->a.getYearOfJoining()>2015)
				.map(b->b.getName())
					.forEach(System.out::println);
		
	}

}
