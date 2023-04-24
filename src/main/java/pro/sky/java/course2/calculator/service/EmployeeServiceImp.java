package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.model.Employee;
import pro.sky.java.course2.calculator.record.EmployeeRecord;

import java.util.Collection;
import java.util.HashMap;

@Service
public class EmployeeServiceImp implements EmployeeService {
    private final HashMap<Integer, Employee> employees = new HashMap<>();

    @Override
    public Collection<Employee> showEmployees() {
        return this.employees.values();
    }

    @Override
    public Employee addEmployee(EmployeeRecord employeeRecord) {
        if (employeeRecord == null
                || employeeRecord.getFirstName() == null
                || employeeRecord.getLastName() == null)
            throw new IllegalArgumentException("Без имени");

        Employee employee = new Employee(employeeRecord.getFirstName(),
                employeeRecord.getLastName(),
                employeeRecord.getDepartment(),
                employeeRecord.getSalary());

        this.employees.put(employee.getId(), employee);

        return employee;
    }
}
