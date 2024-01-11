package com.corenuts.assessment.jan11;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ExistenceOfEmployee {
	
	public static void main(String[] args) {
		
		EmployeeList employees = new EmployeeList();
		List<Employee> list = employees.listOfEmployees();
		
		list.stream().filter(a->a.getName().isEmpty());
		
		Map<Boolean, List<Employee>> collect = list.stream()
												.collect(Collectors.partitioningBy(a->a.getName().equalsIgnoreCase("akhila")));
	
		Set<Entry<Boolean, List<Employee>>> entrySet = collect.entrySet();
		for(Entry<Boolean, List<Employee>> entrySets : entrySet)
		{
			if(entrySet.isEmpty()) {
				System.out.println(entrySets.getKey()+ "are not present");
			}
			else {
				System.out.println("employees are present");
				entrySets.getValue().forEach(System.out::println);
			}
			
		}

	}
	
}
