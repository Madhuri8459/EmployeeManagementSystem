package employeeServiceImpl;

import java.sql.SQLException;
import java.util.List;

import employeeRepo.EmpSelfServiceRepoInterface;
import employeeRepo.empSelfServiceRepo;
import employeeService.SelfServiceInterface;
import model.EmployeeSelfService;

public class SelfServiceInterfaceImpl implements SelfServiceInterface {
   private	EmpSelfServiceRepoInterface empSelfServiceInterface;
   public SelfServiceInterfaceImpl(){
	 this.empSelfServiceInterface = new empSelfServiceRepo();  
   }
	@Override
	public EmployeeSelfService registerEmployeeSelfService(EmployeeSelfService empSelfService) throws SQLException {
		// TODO Auto-generated method stub
		if(empSelfService.getPassword().length()<8)
		{
		System.out.println("pass shld be minimum 8 character");
		return null;
		}
		if(empSelfService.getPassword().equals(empSelfService.getConfPassword()))
		{
		try {
			return empSelfServiceInterface.registerEmployeeSelfService(empSelfService);
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
	public EmployeeSelfService loginEmployeeSelfService(EmployeeSelfService empSelfService) throws SQLException {
		// TODO Auto-generated method stub
		try {
			return empSelfServiceInterface.loginEmployeeSelfService(empSelfService);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return null;
		}
	}

//	@Override
//	public EmployeeSelfService viewPersonalInformation(int empId) throws SQLException {
//		// TODO Auto-generated method stub
//		try {
//			return empSelfServiceInterface.viewPersonalInformation(empId);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}

	@Override
	public EmployeeSelfService viewPayStubs(EmployeeSelfService empSelfService) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeSelfService applyForLeave(EmployeeSelfService empSelfService) throws SQLException {
		// TODO Auto-generated method stub
//		if(empSelfService.getPassword().length()<8)
//		{
//		System.out.println("pass shld be minimum 8 character");
//		return null;
//		}
//		if(empSelfService.getPassword().equals(empSelfService.getConfPassword()))
//		{
		try {
			return empSelfServiceInterface.applyForLeave(empSelfService);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return null;
		}
//		}else
//		{
//		System.out.println("password and confpass doesn't match");
		
		
}

	
	public EmployeeSelfService viewPersonalInformation(EmployeeSelfService empSelfService)
			throws SQLException {
		// TODO Auto-generated method stub
		try {
			return empSelfServiceInterface.viewPersonalInformation(empSelfService);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	

}
