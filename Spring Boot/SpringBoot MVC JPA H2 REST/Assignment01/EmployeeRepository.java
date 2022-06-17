package com.wipro.repository;

import org.springframework.data.repository.CrudRepository;
import Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
