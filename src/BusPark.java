import java.util.ArrayList;
import java.util.List;

public class BusPark {
	List <Bus>buses=new ArrayList<Bus>();
	List <Person>persons=new ArrayList<Person>();
	List <Route>routes=new ArrayList<Route>();
	public BusPark(){
		persons.add(new Controller("Gadya", 120));
		persons.add(new Driver ("Ivan", "D"));
		routes.add(new Route ());
		routes.get(0).addBusStop(new BusStop("C"));
		buses.add(new CityBus(routes.get(0),(Controller) persons.get(0), (Driver)persons.get(1), 111));
	}
	@Override
	public String toString() {
		return "BusPark [buses=" + buses + ", persons=" + persons + ", routes=" + routes + "]";
	}
}
