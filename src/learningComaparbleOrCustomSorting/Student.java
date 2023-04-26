package learningComaparbleOrCustomSorting;

public class Student implements Comparable<Student> {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String toString() {
		return "Name: " + name + " Age: " + age;
	}
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}
}
