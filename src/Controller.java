
public class Controller extends Person {
 int weitgh;
	public Controller(String name, int weitgh) {
	super(name);
	this.weitgh = weitgh;
}

	public Controller(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Controller [weitgh=" + weitgh + "]";
	}

}
