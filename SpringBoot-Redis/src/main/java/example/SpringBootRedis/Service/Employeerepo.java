package example.SpringBootRedis.Service;

import example.SpringBootRedis.domain.Employee;

import java.util.Map;

public interface Employeerepo {
    // Save a new employee.
    void save(Employee employee);

    // Find employee by id.
    Employee findById(String id);

    // Final all employees.
    Map<String, Employee> findAll();

    // Delete a employee.
    void delete(String id);
}
