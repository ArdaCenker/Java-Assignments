

public class InstructorManager extends UserManager {
	
	@Override
	public void add(User user) {
		System.out.println("Eðitmen eklendi: " + user.getFirstName() + " " + user.getLastName());
	}
	
	@Override
	public void update(User user) {
		System.out.println("Eðitmen güncellendi. Yeni bilgiler: " + user.getFirstName() + " " + user.getLastName() 
				+ " " + user.getEmail() + " " + user.getPassword());
	}
	
	@Override
	public void delete(User user) {
		System.out.println("Eðitmen silindi: " + user.getFirstName() + " " + user.getLastName());
	}
}
