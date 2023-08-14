package employeeService;

import java.sql.SQLException;

import model.EmployeeSelfService;

public interface SelfServiceInterface {
	public EmployeeSelfService registerEmployeeSelfService(EmployeeSelfService empSelfService) throws SQLException;
	public EmployeeSelfService loginEmployeeSelfService(EmployeeSelfService empSelfService) throws SQLException;

    public EmployeeSelfService viewPersonalInformation(EmployeeSelfService empSelfService) throws SQLException;  
    public EmployeeSelfService viewPayStubs(EmployeeSelfService empSelfService);
    public EmployeeSelfService applyForLeave(EmployeeSelfService empSelfService) throws SQLException;
   
}
