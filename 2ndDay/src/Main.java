

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Ahmet", "Uçan");
		User user2 = new User(2, "Okan", "Korkmaz");
		
		User[] users = {user1, user2};
		
		for (User user : users) {
			System.out.println(user.firstName+" "+user.lastName);
		}
		
		UserManager userManager = new UserManager();
		userManager.getInfos(user1);
		userManager.getInfos(user2);
		
		Course course1 = new Course(1, "C# + Angular", 2);
		Course course2 = new Course(2, "Java + React", 5);
		
		CourseManager courseManager = new CourseManager();
		courseManager.getDetails(course1);
		courseManager.getDetails(course2);
	}

}
