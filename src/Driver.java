
public class Driver extends Person {
String Category;
	@Override
public String toString() {
	return "Driver [Category=" + Category + "]";
}

	public Driver(String name, String category) {
	super(name);
	Category = category;
}

	public Driver(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}

}
