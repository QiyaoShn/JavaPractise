package PrototypeAndFlyweight;

public class Apple extends Fruit{
	public Apple(String kind) {
		super(kind);
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("水果："+kind);
	}
}
