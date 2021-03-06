

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullanıcı eklendi: " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi. Yeni bilgiler: " 
				+ user.getFirstName() + " " + user.getLastName() 
				+ user.getEmail() + " " + user.getPassword());
	}
	
	public void delete(User user) {
		System.out.println("Kullanıcı silindi: " + user.getFirstName() + " " + user.getLastName());
	}
}
