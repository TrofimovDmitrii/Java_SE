package Lesson9;

public class Student {
	String name;
	int course;
	double grade;

	Student(String name, int course, double grade) {
		this.name = name;
		this.course = course;
		this.grade = grade;
	}

	public static void swap(Student s1, Student s2) {
		Student s3 = s1;
		s1 = s2;
		s2 = s3;
		System.out.println(s1.name);
		System.out.println(s2.name);
	}

	public static void changeName(Student s1) {
		s1.name = "Vasiliy";
	}

	public static void main(String[] args) {
		Student student = new Student("Ivan", 3, 9.5);
		Student student2 = new Student("Petr", 1, 5.3);
		swap(student, student2);
		System.out.println(student.name);
		System.out.println(student2.name);

		changeName(student2);
		System.out.println(student2.name);
	}
}
