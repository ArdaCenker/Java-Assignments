

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Arda Cenker", "Karag�z", "arda@arda.com", "1234567", "Bursa");
		Student student2 = new Student(2, "Ozan", "Kuru", "ozan@ozan.com", "54321", "�zmir");
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiro�", "engin@engin.com", "1234", "Programming");
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		studentManager.add(student1);
		studentManager.add(student2);
		
		instructorManager.update(instructor1);
		
		instructorManager.delete(instructor1);
	}

}
