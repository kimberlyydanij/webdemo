package servletdemo.part04;

public class EmployeesDTO {
	private int employee_id;
	private String first_name;
	private int Salary;
	
	public EmployeesDTO() {
		
	}

	public EmployeesDTO(int employee_id, String first_name, int salary) {
		this.employee_id = employee_id;
		this.first_name = first_name;
		Salary = salary;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	
	
	
}
