
public abstract class Bus {
	Route route;
	Controller controller;
	Driver driver;
	protected int Number;

	public Bus(Route route, Controller controller, Driver driver, int number) {
		super();
		this.route = route;
		this.controller = controller;
		this.driver = driver;
		Number = number;
	}
	void run(){
		
	}
	@Override
	public String toString() {
		return "Bus [route=" + route + ", controller=" + controller + ", driver=" + driver + ", Number=" + Number + "]";
	}
}
