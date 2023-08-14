package employeeRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Employee;
import model.EmployeeSelfService;
//import model.UserClass;

public class empSelfServiceRepo implements EmpSelfServiceRepoInterface {
         
	Connection connection =null;
	PreparedStatement preparedStatement=null;
	
	public empSelfServiceRepo() {
		connection=dbconfig.DatabaseConfiguration.getMyConnection();
	}
	public EmployeeSelfService viewPersonalInformation(EmployeeSelfService empSelfService) throws SQLException {
		// TODO Auto-generated method stub
		
        String query="SELECT * FROM emp_service where empId = ?";
		preparedStatement=connection.prepareStatement(query);
		preparedStatement.setInt(1,empId);
		  ResultSet resultSet = preparedStatement.executeQuery(); 
		  if(resultSet.next()) {
//			  EmployeeSelfService empSelfService=new EmployeeSelfService();
//			  empSelfService.setEmpEmail(resultSet.getString("empEmail"));
//			  empSelfService.setPassword(resultSet.getString("password"));
//			  empSelfService.setConfPassword(resultSet.getString("confPassword"));
//			  empSelfService.setFirstName(resultSet.getString("firstName"));
//			  empSelfService.setLastName(resultSet.getString("LastName"));
//			  empSelfService.setMobileNo(resultSet.getString("mobileNo"));
			  int empId= resultSet.getInt("empId");
			  String empEmail = resultSet.getString("empEmail");
              String password = resultSet.getString("password");
              String confPassword = resultSet.getString("confPassword");
              String firstName = resultSet.getString("firstName");
              String LastName = resultSet.getString("LastName");
              String mobileNo = resultSet.getString("mobileNo");


              // Use the fetched data as needed
//              System.out.println("empEmail: " + empEmail);
//              System.out.println("password: " + password);
//              System.out.println("confPassword: " + confPassword);
//              System.out.println("firstName: " + firstName);
//              System.out.println("LastName: " + LastName);
//              System.out.println("mobileNo: " + mobileNo);

        	System.out.println("Show the EmployeeDetails ");
        }else {
        	System.out.println(" OOPS! Provide correct EmployeeId ");

        }
		return empSelfService;

		
	}

	@Override
	public EmployeeSelfService viewPayStubs(EmployeeSelfService empSelfService) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeSelfService applyForLeave(EmployeeSelfService empSelfService) throws SQLException {
		// TODO Auto-generated method stub
		preparedStatement=connection.prepareStatement("insert into table1 values(?,?,?,?,?)");
		preparedStatement.setInt(1, empSelfService.getUserId());
//		preparedStatement.setString(2, empSelfService.getPassword());
//		preparedStatement.setString(3, empSelfService.getConfPassword());

		preparedStatement.setString(2,empSelfService.getLeaveType());
		preparedStatement.setString(3, empSelfService.getStartDate());
		preparedStatement.setString(4, empSelfService.getEndDate());
		preparedStatement.setString(5, empSelfService.getReason());
		int result=preparedStatement.executeUpdate();
        if(result==1)
			return empSelfService;
		else return null;
		
	}
	@Override
	public EmployeeSelfService registerEmployeeSelfService(EmployeeSelfService empSelfService) throws SQLException {
		// TODO Auto-generated method stub
		preparedStatement=connection.prepareStatement("insert into emp_service values(?,?,?,?,?,?,?)");
		preparedStatement.setInt(1,empSelfService.getEmpId());
		preparedStatement.setString(2, empSelfService.getEmpEmail());
		preparedStatement.setString(3, empSelfService.getPassword());
		preparedStatement.setString(4, empSelfService.getConfPassword());
		preparedStatement.setString(5, empSelfService.getFirstName());
		preparedStatement.setString(6, empSelfService.getLastName());
		preparedStatement.setString(7, empSelfService.getMobileNo());
		
		
		int res=preparedStatement.executeUpdate();
        if(res==1)
			return empSelfService;
		else return null;
		
	}
	@Override
	public EmployeeSelfService loginEmployeeSelfService(EmployeeSelfService empSelfService) throws SQLException {
		// TODO Auto-generated method stub
		preparedStatement=connection.prepareStatement("select * from emp_service where empEmail=? and password=?");
		preparedStatement.setString(1, empSelfService.getEmpEmail());
		preparedStatement.setString(2, empSelfService.getPassword());
		ResultSet rs=preparedStatement.executeQuery();
		if(rs.next()) {return empSelfService;}
		return null;
		
	}
//	public EmployeeSelfService viewPersonalInformation(int empId, EmployeeSelfService empSelfService)
//			throws SQLException {
//		// TODO Auto-generated method stub
//		preparedStatement=connection.prepareStatement("SELECT *FROM edubridge.emp_service where empid=?");
//		preparedStatement.setInt(1,empId );
//        int res=preparedStatement.executeUpdate();
//        if(res==1) {
//        	System.out.println("Show the EmployeeDetails ");
//        }else {
//        	System.out.println(" OOPS! Provide correct EmployeeId ");
//
//        }
//
//		return null;
//	}
//	@Override
//	public UserClass applyForLeave(UserClass userClass) throws SQLException {
//		// TODO Auto-generated method stub
//		preparedStatement=connection.prepareStatement("insert into table1 values(?,?,?,?,?,?,?)");
//		preparedStatement.setInt(1, userClass.getEmpId());
//		preparedStatement.setString(2, userClass.getPassword());
//		preparedStatement.setString(3, userClass.getConfPassword());
//
//		preparedStatement.setString(4,userClass.getLeaveType());
//		preparedStatement.setString(5, userClass.getStartDate());
//		preparedStatement.setString(6, userClass.getEndDate());
//		preparedStatement.setString(7, userClass.getReason());
//		int result=preparedStatement.executeUpdate();
//        if(result==1)
//			return userClass;
//		else return null;
//		
//	}
	
}


