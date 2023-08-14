package employeeRepo;

import java.sql.SQLException;
import java.util.List;
import model.Employee;
import model.EmployeeSelfService;

public interface EmployeeRepoInterface {
	public Employee registerEmployee(Employee employee) throws SQLException;
	public Employee loginEmployee(Employee employee) throws SQLException;
	public Employee updateEmployee(int empId,Employee employee) throws SQLException;
	public Employee deleteEmployee(int empId) throws SQLException;
	public List<Employee> getAllEmployee(Employee employee) throws SQLException;
}
