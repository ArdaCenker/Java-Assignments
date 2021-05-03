package day3;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullanýcý eklendi: " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi. Yeni bilgiler: " 
				+ user.getFirstName() + " " + user.getLastName() 
				+ user.getEmail() + " " + user.getPassword());
	}
	
	public void delete(User user) {
		System.out.println("Kullanýcý silindi: " + user.getFirstName() + " " + user.getLastName());
	}
}
