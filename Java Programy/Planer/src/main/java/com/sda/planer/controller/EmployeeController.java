package com.sda.planer.controller;

import com.sda.planer.model.Employee;
import com.sda.planer.repository.EmployeeRepository;
import com.sda.planer.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employees")
public class EmployeeController {


    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ModelAndView allEmployees() {

        ModelAndView modelAndView = new ModelAndView("employee");
        modelAndView.addObject("employee", employeeService.getAll());
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView getEmployee(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView("employee");
        Employee employee = employeeService.getEmployee(id);
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }

    @PostMapping
    public String saveEmployee(@ModelAttribute Employee employee) {
        employeeService.addEmployee(employee);
        return "redirect:/employees";

    }


}
