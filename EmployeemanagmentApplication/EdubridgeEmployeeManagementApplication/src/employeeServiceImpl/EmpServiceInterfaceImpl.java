package employeeServiceImpl;

import java.sql.SQLException;
import java.util.List;

import employeeRepo.EmpReposiratory;
import employeeRepo.EmployeeRepoInterface;
import employeeService.EmpServiceInterface;
import model.Employee;

public  class EmpServiceInterfaceImpl implements EmpServiceInterface {
	private EmployeeRepoInterface employeeRepoInterface;
	public EmpServiceInterfaceImpl() {
		this.employeeRepoInterface = new EmpReposiratory(); 
	}

	@Override
	public Employee registerEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if(employee.getPassword().length()<8)
		{
		System.out.println("pass shld be minimum 8 character");
		return null;
		}
		if(employee.getPassword().equals(employee.getConfPassword()))
		{
		try {
			return employeeRepoInterface.registerEmployee(employee);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return null;
		}
		}else
		{
		System.out.println("password and confpass doesn't match");
		return null;
		}
	}


   @Override
	public Employee loginEmployee(Employee employee) {
		// TODO Auto-generated method stub
	   try {
			return employeeRepoInterface.loginEmployee(employee);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public Employee updateEmployee(int empId, Employee employee) {
		// TODO Auto-generated method stub
		try {
			return employeeRepoInterface.updateEmployee(empId, employee);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public Employee deleteEmployee(int empId,Employee employee) {
		// TODO Auto-generated method stub
		try {
			return employeeRepoInterface.deleteEmployee(empId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployee(Employee employee2) throws SQLException {
		try {
			return employeeRepoInterface.getAllEmployee(employee2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}