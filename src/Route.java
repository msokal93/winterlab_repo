import java.util.ArrayList;
import java.util.List;

public class Route {
	List<BusStop> route = new ArrayList<BusStop>();

	@Override
	public String toString() {
		return "Route [route=" + route + "]";
	}

	void addBusStop(BusStop B) {
		route.add(B);

	}

	void addBusStop(BusStop[] b) {
		for (int i = 0; i < b.length; i++)
			route.add(b[i]);
	}
}
