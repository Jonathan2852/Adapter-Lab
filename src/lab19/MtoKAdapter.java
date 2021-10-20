package lab19;

public class MtoKAdapter extends KilometersAdaptee {
	private double mph;
	private double hours;
	public MtoKAdapter(double m, double h) {
		mph = m;
		hours = h;
    }
	public double distance() {
		double k = mph * 1.60934;
		double d = distancek(k, hours);
		double mi = d / 1.60934;
		return mi;
	}

}
