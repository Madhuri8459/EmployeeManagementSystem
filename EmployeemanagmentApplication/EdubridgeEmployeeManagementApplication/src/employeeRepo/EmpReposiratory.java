package employeeRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbconfig.DatabaseConfiguration;
import model.Employee;
import model.EmployeeSelfService;

public class EmpReposiratory implements EmployeeRepoInterface{

	Connection connection =null;
	PreparedStatement preparedStatement=null;
	
	public EmpReposiratory() {
		connection=dbconfig.DatabaseConfiguration.getMyConnection();

	}
	@Override
	public Employee registerEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		preparedStatement=connection.prepareStatement("insert into emp_table values(?,?,?,?,?,?,?,?,?,?,?,?)");
		preparedStatement.setInt(1,employee.getEmpId());
		preparedStatement.setString(2,employee.getEmpName());
		preparedStatement.setString(3,employee.getPassword());
		preparedStatement.setString(4, employee.getConfPassword());
		preparedStatement.setString(5,employee.getFirstName());
		preparedStatement.setString(6,employee.getLastName());
        preparedStatement.setString(7,employee.getMobileNo());

		preparedStatement.setString(8,employee.getGender());
		preparedStatement.setString(9,employee.getAge());
		preparedStatement.setString(10,employee.getCity());
		preparedStatement.setString(11,employee.getState());
        preparedStatement.setString(12,employee.getEmpDesignation());
        
        int res=preparedStatement.executeUpdate();
        if(res==1)
			return employee;
		else return null;
	}



@Override
	public Employee loginEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
	preparedStatement=connection.prepareStatement("select * from emp_table where empName=? and password=?");
	preparedStatement.setString(1,employee.getEmpName());
	preparedStatement.setString(2, employee.getPassword());
	
	ResultSet rs=preparedStatement.executeQuery();
	if(rs.next()) {return employee;}
	return null;
}
		

	@Override
	public Employee updateEmployee(int empId, Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		preparedStatement=connection.prepareStatement("Update emp_table SET empName=?, password=? WHERE empId=?");
		preparedStatement.setString(1,employee.getEmpName());
		preparedStatement.setString(2, employee.getPassword());
		preparedStatement.setInt(3, empId);
		int rowsUpdated = preparedStatement.executeUpdate();
		if(rowsUpdated==1) {
			System.out.println("Employee Updated Succesfully!");
		}else {
			System.out.println("OOPS! Employee updated fail");
		}
		return null;
	}

	@Override
	public Employee deleteEmployee(int empId) throws SQLException {
		// TODO Auto-generated method stub
		preparedStatement=connection.prepareStatement("DELETE FROM emp_table WHERE empId=?;");
		preparedStatement.setInt(1, empId);
        int res=preparedStatement.executeUpdate();
        if(res==1) {
        	System.out.println("EmployeeDetails Deleted SuccesFully");
        }else {
        	System.out.println(" OOPS! Provide correct EmployeeId ");

        }

		return null;
	}
//	@Override
//	public Employee deleteEmployee(int empId) throws SQLException {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public List<Employee> getAllEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		List<Employee> userList = new ArrayList<>();
		preparedStatement = connection.prepareStatement("SELECT * FROM emp_table;");
	ResultSet rs = preparedStatement.executeQuery();
		while (rs.next()) {
			Employee employee1 = new Employee();
			employee1.setEmpId(rs.getInt("empId"));
			employee1.setEmpName(rs.getString("empName"));
			employee1.setPassword(rs.getString("password"));
			employee1.setConfPassword(rs.getString("confPassword"));
			employee1.setFirstName(rs.getString("firstname"));
			employee1.setLastName(rs.getString("lastname"));
			employee1.setMobileNo(rs.getString("mobile"));
			employee1.setGender(rs.getString("gender"));

			employee1.setAge(rs.getString("age"));
			employee1.setCity(rs.getString("city"));
			employee1.setState(rs.getString("state"));
			employee1.setEmpDesignation(rs.getString("empDesignation"));
			userList.add(employee1);
		}
		return userList;
	}
//    public EmployeeSelfService viewPersonalInformation(EmployeeSelfService empSelfService) {
//    List<EmployeeSelfService> empServiceList = new ArrayList<>();
//	preparedStatement = connection.prepareStatement("SELECT * FROM emp_table;");
//	ResultSet rs = preparedStatement.executeQuery();
//
//    }

}
