package day3;

public class StudentManager extends UserManager {
	
	@Override
	public void add(User user) {
		System.out.println("��renci eklendi: " + user.getFirstName() + " " + user.getLastName());
	}
	
	@Override
	public void update(User user) {
		System.out.println("��renci g�ncellendi. Yeni bilgiler: " 
				+ user.getFirstName() + " " + user.getLastName() 
				+ user.getEmail() + " " + user.getPassword());
	}
	
	@Override
	public void delete(User user) {
		System.out.println("��renci silindi: " + user.getFirstName() + " " + user.getLastName());
	}
}
