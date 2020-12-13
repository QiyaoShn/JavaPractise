package _class;

public class builder extends school {
	private String location;
	public builder(String Department, String Location) {
		super(Department);
		this.location = Location;
	}
	@Override
	public String toString() {
		return "builder [location=" + location + ", department=" + department + "]";
	}
	public static void main(String[] args) {
		builder place = new builder("行政楼","4-A-120");
		place.showDepartment();
		System.out.println(place.getLocation());
		System.out.println(place);
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
