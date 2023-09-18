package kr.co.himedia.staticzone04;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String department;
	public static int seriaNum = 1000; //static 변수는 약간 기울어지게 표시됨
	
	public Employee() {
		Employee.seriaNum++;
		employeeId = seriaNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
