
public class CityBus extends Bus{

	public CityBus(Route route, Controller controller, Driver driver, int number) {
		super(route, controller, driver, number);
		// TODO Auto-generated constructor stub
	}
void run(){
}
@Override
public String toString() {
	return "CityBus [route=" + route + ", controller=" + controller + ", driver=" + driver + ", Number=" + Number + "]";
}
}

