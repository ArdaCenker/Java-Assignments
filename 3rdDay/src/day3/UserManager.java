package day3;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullan�c� eklendi: " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi. Yeni bilgiler: " 
				+ user.getFirstName() + " " + user.getLastName() 
				+ user.getEmail() + " " + user.getPassword());
	}
	
	public void delete(User user) {
		System.out.println("Kullan�c� silindi: " + user.getFirstName() + " " + user.getLastName());
	}
}
