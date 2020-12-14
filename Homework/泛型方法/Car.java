package 泛型方法;

public class Car {
	String name;
	double tank;
	double oilConsumption;
	public Car() {
		
	}
	public String toString() {
		return "Car [name=" + name + ", tank=" + tank + ", oilConsumption=" + oilConsumption + "]";
	}
	public Car(String name,double tank,double oilConsumption) {
		this.name=name;
		this.tank=tank;
		this.oilConsumption=oilConsumption;
	}
	public void gas(double gasl) {
		tank=tank+gasl;
	}
}
