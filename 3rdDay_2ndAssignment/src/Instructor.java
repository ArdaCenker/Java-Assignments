

public class Instructor extends User {
	
	private String department;
	
	public Instructor(int id, String firstName, String lastName, String email, String password,
			String department) {
		super(id, firstName, lastName, email, password);
		this.setDepartment(department);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
