package learningComaparbleOrCustomSorting;

public class Car implements Comparable<Car>{
	String name;
	int cost;
	public Car(String name,int cost){
		this.name=name;
		this.cost=cost;
	}
	public String toString()
	{
		return "Name: "+name+"Cost: "+cost;
	}
	public int compareTo(Car c) {
		return this .cost-c.cost;
	}
}
