package PrototypeAndFlyweight;

import java.util.Random;

public class Client {
	public static void main(String[] args) {
		Random rm = new Random();
		FruitFactory pFactory = new FruitFactory();
		for(int i=0;i<19;i++) {
			Fruit p;
			if(rm.nextInt()%2==0)
				p = pFactory.GetFruit("Apple");
			else
				p = pFactory.GetFruit("Banana");
			p.Display();
		}
		System.out.println(pFactory.GetFuirtCount());
	}
}
