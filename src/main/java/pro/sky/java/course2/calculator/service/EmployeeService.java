package pro.sky.java.course2.calculator.service;

import pro.sky.java.course2.calculator.model.Employee;
import pro.sky.java.course2.calculator.record.EmployeeRecord;

import java.util.Collection;

public interface EmployeeService {
    Collection<Employee> showEmployees();

    Employee addEmployee(EmployeeRecord employeeRecord);
}
