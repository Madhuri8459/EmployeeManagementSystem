package model;

public class EmployeeSelfService {
	private int empId;
	private String empEmail;
	private String password;
	private String confPassword;
	private String firstName;
	private String LastName;
	private String mobileNo;
	private int userId;
    private String leaveType;
    private String startDate;
    private String endDate;
    private String reason;
    



    
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfPassword() {
		return confPassword;
	}

	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "EmployeeSelfService [empId=" + empId + ", empEmail=" + empEmail + ", password=" + password
				+ ", confPassword=" + confPassword + ", firstName=" + firstName + ", LastName=" + LastName
				+ ", mobileNo=" + mobileNo + ", userId=" + userId + ", leaveType=" + leaveType + ", startDate="
				+ startDate + ", endDate=" + endDate + ", reason=" + reason + "]";
	}


	
	
}

//	// Sample employee data
//    private static String employeeName = "John Doe";
//    private static String address = "123 Main St, City";
//    private static String contactNumber = "123-456-7890";
////    private static double salary = 5000.0;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            showMenu();
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume the newline character
//
//            switch (choice) {
//                case 1:
//                    viewPersonalInformation();
//                    break;
//                case 2:
//                    viewPayStubs();
//                    break;
//                case 3:
//                    applyForLeave(scanner);
//                    break;
//                case 4:
//                    System.out.println("Thank you for using Employee Self-Service. Goodbye!");
//                    scanner.close();
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }
//
//    private static void showMenu() {
//        System.out.println("\nEmployee Self-Service Menu");
//        System.out.println("1. View Personal Information");
//        System.out.println("2. View Pay Stubs");
//        System.out.println("3. Apply for Leave");
//        System.out.println("4. Exit");
//        System.out.print("Enter your choice: ");
//    }
//
//    private static void viewPersonalInformation() {
//        System.out.println("\nPersonal Information");
//        System.out.println("Name: " + employeeName);
//        System.out.println("Address: " + address);
//        System.out.println("Contact Number: " + contactNumber);
//    }
//
//    private static void viewPayStubs() {
//        System.out.println("\nPay Stubs");
//        // In a real application, you would fetch pay stub data from a database
//        System.out.println("Salary: $" + salary);
//        // Add more details like deductions, taxes, net pay, etc.
//    }
//
//    private static void applyForLeave(Scanner scanner) {
//        System.out.println("\nApply for Leave");
//        System.out.print("Leave Type: ");
//        String leaveType = scanner.nextLine();
//        System.out.print("Start Date: ");
//        String startDate = scanner.nextLine();
//        System.out.print("End Date: ");
//        String endDate = scanner.nextLine();
//        System.out.print("Reason for Leave: ");
//        String reason = scanner.nextLine();
//
//        // In a real application, you would save the leave request to a database for HR processing
//        System.out.println("Leave request submitted successfully.");
//    }
//}
//
