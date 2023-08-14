package employeeService;

import java.sql.SQLException;
import java.util.List;

import model.Employee;


public interface EmpServiceInterface {
	public Employee registerEmployee(Employee employee);
	public Employee loginEmployee(Employee employee);
	public Employee updateEmployee(int empId,Employee employee);
	public Employee deleteEmployee(int empId,Employee employee);
	public List<Employee> getAllEmployee(Employee employee) throws SQLException;
	}

