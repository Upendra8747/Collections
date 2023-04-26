package learingComparator;

public class Movie {
	String name;
	int rating;
	double timing;
	
	Movie(String name,int rating, double timing){
		this.name=name;
		this.rating=rating;
		this.timing=timing;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + ", timing=" + timing + "]";
	}
	
}
