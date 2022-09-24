package com.example.Demo_SpringBoot_JPA.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	List<Employee> findEmployeeByLastNameContaining(String str);

}
