package com.sda.planer.service;


import com.sda.planer.model.Employee;
import com.sda.planer.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class EmployeeService {


EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAll(){
        return (List<Employee>) employeeRepository.findAll();
    }

    public Employee getEmployee(int id){
        return  employeeRepository.findById(id);
    }

    public Employee addEmployee(Employee employee){

        return employeeRepository.save(employee);
    }

}
