package com.wipro.repository;

import org.springframework.data.repository.CrudRepository;
import com.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
