package learningComaparbleOrCustomSorting;

import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		Student s1 = new Student("E",20);
		Student s2 = new Student("D",21);
		Student s3 = new Student("C",22);
		Student s4 = new Student("B",23);
		Student s5 = new Student("A",25);
		
		
		TreeSet<Student > t = new TreeSet<Student>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(s5);
		
		System.out.println("________________");
		System.out.println("Name\tAge");
		System.out.println("________________");
		for(Student s : t) {
			System.out.println(s);
		}
		System.out.println("________________");
	}
}
