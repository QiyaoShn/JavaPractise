package PrototypeAndFlyweight;

public class Banana extends Fruit{
	public Banana(String kind) {
		super(kind);
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("水果："+kind);
	}
}
