package learingComparator;

import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		Movie m1 = new Movie("Interstelar",1,2.00);
		Movie m2 = new Movie("martin",2,2.30);
		Movie m3 = new Movie("The great wall",3,3.00);
		Movie m4 = new Movie("Gladiator",4,2.45);
		Movie m5 = new Movie("300 rise",5,2.00);
		
		SortByRating time = new SortByRating();
		TreeSet<Movie> m = new TreeSet<Movie>(time);
		m.add(m5);
		m.add(m4);
		m.add(m3);
		m.add(m2);
		m.add(m1);
		
		
		for(Movie mov: m) {
			System.out.println(mov);
		}
		
		
	}
}
