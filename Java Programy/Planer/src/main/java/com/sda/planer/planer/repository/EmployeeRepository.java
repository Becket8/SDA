package com.sda.planer.planer.repository;

import com.sda.planer.planer.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Employee findById(long id);
}
