package PrototypeAndFlyweight;

public abstract class Fruit implements Cloneable{
	protected String kind;
	public Fruit(String kind) {
		this.kind = kind;
	}
	public abstract void Display();
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
