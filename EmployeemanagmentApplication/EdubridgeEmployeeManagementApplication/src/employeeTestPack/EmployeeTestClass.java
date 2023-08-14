package employeeTestPack;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import employeeService.EmpServiceInterface;
import employeeService.SelfServiceInterface;
import employeeServiceImpl.EmpServiceInterfaceImpl;
import employeeServiceImpl.SelfServiceInterfaceImpl;
import model.Employee;
import model.EmployeeSelfService;

public class EmployeeTestClass {
	public static void main(String[] args) throws SQLException 
	{
		EmpServiceInterface userInterface=new EmpServiceInterfaceImpl();
		SelfServiceInterface selfUserInterface = new SelfServiceInterfaceImpl();
	
		int choice,ch1,ch2,ch3;
	    final String ADMIN_PASSWORD = "admin123";
		Scanner scanner = new Scanner(System.in);
		
		 while (true){
				System.out.println("***********Welcome To Employee Management Project************\n \n");
	            System.out.println("1. Admin");
	            System.out.println("2. User");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            
	            switch (choice){
                case 1:
                    System.out.print("Enter the admin password: ");
                    String password = scanner.next();
                    if (password.equals(ADMIN_PASSWORD)){
                        
                    }else{
                        System.out.println("Incorrect password. Access denied.");
                        System.out.println();
                    }
                    
                    System.out.println("===== Administrator Menu =====");
                    do {Employee employee = new Employee();
//            		EmployeeSelfService empSelfService= new EmployeeSelfService(); 
            		
                       System.out.println("1. Employee Registration");
                       System.out.println("2.Employee Login");
                       System.out.println("3.Update Employee");
                       System.out.println("4. Delete Employee");
                       System.out.println("5. Show Employees");
   
                       System.out.print("Enter your choice: ");
                       ch1 = scanner.nextInt();
                       switch(ch1) {
                   	case 1:
                   		System.out.println("Enter The Employee Details");
        				System.out.println("Enter The Employee Id");

        				employee.setEmpId(scanner.nextInt());
        				System.out.println("EmployeeName");
        				employee.setEmpName(scanner.next());
        				System.out.println("Password");
        				employee.setPassword(scanner.next());
        				System.out.println("Confirm Password");
                        employee.setConfPassword(scanner.next());
                        System.out.println("Firstname");
        				employee.setFirstName(scanner.next());
                        System.out.println("Lastname");

        				employee.setLastName(scanner.next());
        				System.out.println("Mobile Number");
        				employee.setMobileNo(scanner.next());
        				System.out.println("Gender");

        				employee.setGender(scanner.next());
        				System.out.println("Age");

        				employee.setAge(scanner.next());
        				System.out.println("City");

        				employee.setCity(scanner.next());
        				System.out.println("State");

        				employee.setState(scanner.next());
        				System.out.println("EmployeeDesignation");
        				employee.setEmpDesignation(scanner.next());

        				Employee employee1=userInterface.registerEmployee(employee);
        				if(employee1!=null)
        				{
        					System.out.println("Registered Successfully");
        				}
        				else
        					System.out.println("Registration Failed");
        				break;
                   	case 2:
        				System.out.println("Enter Username And Password:\n");
        				Employee loginUser=new Employee();
        				loginUser.setEmpName(scanner.next());
        				loginUser.setPassword(scanner.next());
        				Employee loggedInuser=userInterface.loginEmployee(loginUser);
        					if(loggedInuser!=null)
        					{
        						System.out.println("Login Is Success");
        					}else
        					{
        						System.out.println("Login Failed,Check The Credentials:");
        					}
        					break;
        					
        					
        			case 3:
        				Employee employeeToUpdate = new Employee();
        				System.out.print("Enter EmployeeID to update Details: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter new Username: ");
                        employeeToUpdate.setEmpName(scanner.next());
        				System.out.print("Enter new Password: ");
        				employeeToUpdate.setPassword(scanner.next());
        				System.out.print("Enter new First Name: ");
        				employeeToUpdate.setFirstName(scanner.next());
        				System.out.print("Enter new Last Name: ");
        				employeeToUpdate.setLastName(scanner.next());
        				System.out.print("Enter new Mobile Number: ");
        				employeeToUpdate.setMobileNo(scanner.next());
        				userInterface.updateEmployee(id, employeeToUpdate);
                       break;
        			case 4:
        				 System.out.print("Enter User ID to Delete:\n  ");
        				 Employee employeeToDelete = new Employee();
                         employeeToDelete.setEmpId(scanner.nextInt());
                         Employee deletedEmployee = userInterface.deleteEmployee(employeeToDelete.getEmpId(),employeeToDelete);
                         break;
        			case 5:
        				Employee employee4=new Employee();
        				System.out.println("Users Are:");
        				 List<Employee> userList = userInterface.getAllEmployee(employee4);
                         for (Employee u : userList) 
                         {
                             System.out.println(u);
                         }
                         break;
        			default:
                		System.out.println("Invalid option.");
                        break;
                		
                	}
                	System.out.println("Do you want to continue");
                	
                	ch2 = scanner.next().charAt(0);
                	} while (ch2 == 'Y' || ch2== 'y');	
             break;
                
             
      case 2:
      System.out.println("===== User Menu =====");
      do{            		EmployeeSelfService empSelfService= new EmployeeSelfService(); 
	
          System.out.println("1.Register");
          System.out.println("2. Login");
          System.out.println("3. ViewPersonalInformation");
//          System.out.println("4. ViewPayStub"); 
          System.out.println("5.ApplyForLeave");
          System.out.print("Enter the option:");
          ch3 = scanner.nextInt();
          switch (ch3) {
          case 1:System.out.println("Enter The Employee Details to register");
			System.out.println("Enter The employee Id");
             empSelfService.setEmpId(scanner.nextInt());
             
 			System.out.println("Enter The Employee Email");
 			empSelfService.setEmpEmail(scanner.next());
 			
 			System.out.println("Enter The Employee Password");
 			empSelfService.setPassword(scanner.next());
 			
 			System.out.println("Enter The Employee Conf Password");
 			empSelfService.setConfPassword(scanner.next());
 			
 			System.out.println("Enter The Employee First Name");
 			empSelfService.setFirstName(scanner.next());
 			
 			System.out.println("Enter The Employee Last Name");
 			empSelfService.setLastName(scanner.next());
 			
 			System.out.println("Enter The Employee Mobile No");
 			empSelfService.setMobileNo(scanner.next());
 			
 			
 			
 			
 			
 			
 			EmployeeSelfService empSelfService1=selfUserInterface.registerEmployeeSelfService(empSelfService);
			if(empSelfService1!=null)
			{
				System.out.println("Registered Successfully");
			}
			else
				System.out.println("Registration Failed");
			break;
			
			
          case 2:
				System.out.println("Enter EmpEmail And Password:\n");
				EmployeeSelfService loginEmployee=new EmployeeSelfService();
				loginEmployee.setEmpEmail(scanner.next());
				loginEmployee.setPassword(scanner.next());
				EmployeeSelfService loggedInuser=selfUserInterface.loginEmployeeSelfService(loginEmployee);
					if(loggedInuser!=null)
					{
						System.out.println("Login Is Success ");
					}else
					{
						System.out.println("Login Failed,Check The Credentials:(");
					}
					break;
					
          case 3:
				 System.out.print("Enter User ID to ViewPersonalDetails:\n  ");
				 EmployeeSelfService employeeToView = new EmployeeSelfService();
              employeeToView.setEmpId(scanner.nextInt());
              EmployeeSelfService deletedselfEmployee = selfUserInterface.viewPersonalInformation( empSelfService);
            		  
              if(deletedselfEmployee!=null)
              {
            	  System.out.println("Show the data :)");
				}
             else
				{
					System.out.println("Login Failed,Check The Credentials:(");
				
				
            	  
              }
              break;
           
          case 5:
				 System.out.print("Enter the Reason for Leave: ");
				 System.out.println("Enter UserId");
				 empSelfService.setUserId(scanner.nextInt());
//				 System.out.println("Enter The Employee pass");
//		 			empSelfService.setPassword(scanner.next());
//		 			System.out.println("Enter The Employee confpass");
//		 			empSelfService.setConfPassword(scanner.next());

		 			System.out.println("Enter The Employee Leavetype");
		 			empSelfService.setLeaveType(scanner.next());
		 			System.out.println("Enter The Employee start date");
		 			empSelfService.setStartDate(scanner.next());
		 			System.out.println("Enter The Employee end date");
		 			empSelfService.setEndDate(scanner.next());
		 			
		 			System.out.println("Enter The Employee Reason for leave");
		 			empSelfService.setReason(scanner.next());
		 			
		 			
		 			EmployeeSelfService empSelfService2=selfUserInterface.applyForLeave(empSelfService);
					if(empSelfService2!=null)
					{
						System.out.println("Submitted the Leave Application");
					}
					else
						System.out.println("Leave Application Failed");
					break;

          
          default:
              System.out.println("Invalid option.");
              break;
          }
          System.out.println("Do you want to continue");
      	ch2 = scanner.next().charAt(0);
      	} while (ch2 == 'Y' || ch2== 'y');	
   break;
   
      case 3:
          System.out.println("Exiting the system... ");
          break;

      default:
          System.out.println("Invalid option.");
          break;
      }
	            
      
	            }
	}
}
	            



        	  
                     
	            
//		System.out.println("***********Welcome To Employee Management Project************\n \n");
//		EmpServiceInterface userInterface=new EmpServiceInterfaceImpl();
//		char ch=' ';
//		do {Employee employee = new Employee();
//		EmployeeSelfService empSelfService= new EmployeeSelfService(); 
//		
//		System.out.println("1 Employee Registration\n2 Employee Login\n3 Update Employee\n4 Delete Employee\n5 Show Employees");
//			System.out.println("Enter The Option:");
//			int option;
//			option=scanner.nextInt();
//			switch(option)
//			{
//			case 1:
//				System.out.println("Enter The Employee Details");
//				System.out.println("Enter The Employee Id");
//
//				employee.setEmpId(scanner.nextInt());
//				System.out.println("EmployeeName");
//				employee.setEmpName(scanner.next());
//				System.out.println("Password");
//				employee.setPassword(scanner.next());
//				System.out.println("Confirm Password");
//                employee.setConfPassword(scanner.next());
//                System.out.println("Firstname");
//				employee.setFirstName(scanner.next());
//                System.out.println("Lastname");
//
//				employee.setLastName(scanner.next());
//				System.out.println("Mobile Number");
//				employee.setMobileNo(scanner.next());
//				System.out.println("Gender");
//
//				employee.setGender(scanner.next());
//				System.out.println("Age");
//
//				employee.setAge(scanner.next());
//				System.out.println("City");
//
//				employee.setCity(scanner.next());
//				System.out.println("State");
//
//				employee.setState(scanner.next());
//				System.out.println("EmployeeDesignation");
//
//				employee.setEmpDesignation(scanner.next());
//				Employee employee1=userInterface.registerEmployee(employee);
//				if(employee1!=null)
//				{
//					System.out.println("Registered Successfully");
//				}
//				else
//					System.out.println("Registration Failed");
//				break;
//			case 2:
//				System.out.println("Enter Username And Password:\n");
//				Employee loginUser=new Employee();
//				loginUser.setEmpName(scanner.next());
//				loginUser.setPassword(scanner.next());
//				Employee loggedInuser=userInterface.loginEmployee(loginUser);
//					if(loggedInuser!=null)
//					{
//						System.out.println("Login Is Success :)");
//					}else
//					{
//						System.out.println("Login Failed,Check The Credentials:(");
//					}
//					break;
//			case 3:
//				Employee employeeToUpdate = new Employee();
//				System.out.print("Enter User ID to update: ");
//                int id = scanner.nextInt();
//                System.out.print("Enter new Username: ");
//                employeeToUpdate.setEmpName(scanner.next());
//				System.out.print("Enter new Password: ");
//				employeeToUpdate.setPassword(scanner.next());
//				System.out.print("Enter new First Name: ");
//				employeeToUpdate.setFirstName(scanner.next());
//				System.out.print("Enter new Last Name: ");
//				employeeToUpdate.setLastName(scanner.next());
//				System.out.print("Enter new Mobile Number: ");
//				employeeToUpdate.setMobileNo(scanner.next());
//				userInterface.updateEmployee(id, employeeToUpdate);
//               break;
//			case 4:
//				 System.out.print("Enter User ID to Delete:\n  ");
//				 Employee employeeToDelete = new Employee();
//                 employeeToDelete.setEmpId(scanner.nextInt());
//                 Employee deletedEmployee = userInterface.deleteEmployee(employeeToDelete.getEmpId(),employeeToDelete);
//                 break;
//			case 5:
//				Employee employee4=new Employee();
//				System.out.println("Users Are:");
//				 List<Employee> userList = userInterface.getAllEmployee(employee4);
//                 for (Employee u : userList) 
//                 {
//                     System.out.println(u);
//                 }
//                 break;
//			default:
//				break;
//			}
//			System.out.println("Do You Want To Continue?\n");
//			ch=scanner.next().charAt(0);
//		}while(ch=='y'|| ch=='Y');
//	}
	

//	            }
//		 }
//	}
//		}



//https://tomcat.apache.org/download-80.cgi
