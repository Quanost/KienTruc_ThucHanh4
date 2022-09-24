package com.example.Demo_SpringBoot_JPA.dao;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;


import com.example.Demo_SpringBoot_JPA.entity.Employee;
import com.example.Demo_SpringBoot_JPA.entity.EmployeeRepository;

@Repository
public class EmployeeDAO {
	
	private EmployeeRepository employeeRepository;
	private void insertFourEmployees(EmployeeRepository repository) {
		Employee employee=new Employee("Quan","Long","abc@hmail");
		repository.save(employee);
	}
	
	
	@Bean
	public CommandLineRunner run(EmployeeRepository repository) {
		return (args->{
			insertFourEmployees(repository);
			System.out.println(repository.findAll());
		});
		
	}
	
	
	public void findAllEmployees() {
		List<Employee> employee=(List<Employee>) employeeRepository.findAll();
		System.out.println(employee);
	} 
}
