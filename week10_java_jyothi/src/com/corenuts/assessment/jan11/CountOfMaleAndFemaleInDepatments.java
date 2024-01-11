package com.corenuts.assessment.jan11;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfMaleAndFemaleInDepatments {
	
	public static void main(String[] args) {
		
		EmployeeList employees = new EmployeeList();
		List<Employee> list = employees.listOfEmployees();
		
		Map<String, Long> collect = list.stream()
									.filter(a->a.getDepartment().equals("Sales") || a.getDepartment().equals("Marketing"))
									.collect(Collectors.groupingBy(Employee::getGender , Collectors.counting()));
		
		System.out.println(collect);
		
		collect.entrySet().stream().forEach(a->{
			System.out.println(a.getKey() +" = " +a.getValue());
		});
	}

}
