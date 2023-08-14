package employeeRepo;

import java.sql.SQLException;
import java.util.List;

import model.EmployeeSelfService;
//import model.UserClass;

public interface EmpSelfServiceRepoInterface {
	public EmployeeSelfService registerEmployeeSelfService(EmployeeSelfService empSelfService) throws SQLException;
	public EmployeeSelfService loginEmployeeSelfService(EmployeeSelfService empSelfService) throws SQLException;

    public EmployeeSelfService viewPersonalInformation(EmployeeSelfService empSelfService) throws SQLException;  
    public EmployeeSelfService viewPayStubs(EmployeeSelfService empSelfService);
    public EmployeeSelfService applyForLeave(EmployeeSelfService empSelfService) throws SQLException;
//    public UserClass applyForLeave(UserClass userClass) throws SQLException;
}
