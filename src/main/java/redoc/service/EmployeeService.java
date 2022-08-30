package redoc.service;

import redoc.entity.Employee;

public interface EmployeeService {

	void save(Employee employee);

	Object findAll();

}
