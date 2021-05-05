

public class StudentManager extends UserManager {
	
	@Override
	public void add(User user) {
		System.out.println("Öðrenci eklendi: " + user.getFirstName() + " " + user.getLastName());
	}
	
	@Override
	public void update(User user) {
		System.out.println("Öðrenci güncellendi. Yeni bilgiler: " 
				+ user.getFirstName() + " " + user.getLastName() 
				+ user.getEmail() + " " + user.getPassword());
	}
	
	@Override
	public void delete(User user) {
		System.out.println("Öðrenci silindi: " + user.getFirstName() + " " + user.getLastName());
	}
}
