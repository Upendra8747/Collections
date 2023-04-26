package learningComaparbleOrCustomSorting;

import java.util.TreeSet;

public class SortCar {
	public static void main(String[] args) {
		Car c1 = new Car("Honda", 200);
		Car c2 = new Car("kia", 300);
		Car c3 = new Car("Shift", 100);
		Car c4 = new Car("Ferari", 600);
		Car c5 = new Car("Inova", 400);
		
		
		TreeSet<Car> t = new TreeSet<Car>();
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(c4);
		t.add(c5);
		System.out.println("----------------");
		System.out.println("Name\tCost");
		System.out.println("----------------");

		for(Car c: t) {
			System.out.println(c);
		}
		System.out.println("----------------");
		
	}
}
