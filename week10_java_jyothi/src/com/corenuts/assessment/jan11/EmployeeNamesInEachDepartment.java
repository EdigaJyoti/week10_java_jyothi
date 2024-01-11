package com.corenuts.assessment.jan11;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeNamesInEachDepartment {
	
	public static void main(String[] args) {
		
		EmployeeList employees = new EmployeeList();
		List<Employee> list = employees.listOfEmployees();
		
		Map<String, List<Employee>> collect = list.stream()
												.collect(Collectors.groupingBy(Employee::getDepartment));
		
		collect.entrySet().stream().forEach(a->{
			System.out.println("Employess in "+a.getKey()+" Department");
			a.getValue().stream().forEach(b->{
				System.out.println(b.getName());
			});
			System.out.println("-----------------------");
		});
		
	}

}
