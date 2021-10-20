package lab19;

public class MilesClient {
	public double distance(double mph, double hours){
		
		MtoKAdapter adapter = new MtoKAdapter(mph, hours);
		double miles = adapter.distance();
		return miles;
	}

}
