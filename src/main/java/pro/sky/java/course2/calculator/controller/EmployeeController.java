package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.model.Employee;
import pro.sky.java.course2.calculator.record.EmployeeRecord;
import pro.sky.java.course2.calculator.service.EmployeeService;

import java.util.Collection;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public Collection<Employee> showEmployees(){
        return employeeService.showEmployees();
    }

    @PostMapping("/employee/add")
    public Employee createEmployee(@RequestBody EmployeeRecord employeeRecord){
        return this.employeeService.addEmployee(employeeRecord);
    }
}
