package PrototypeAndFlyweight;

import java.util.HashMap;

public class FruitFactory{
	private HashMap FruitPool = new HashMap();
	public Fruit GetFruit(String key) {
		if(!FruitPool.containsKey(key)) {
			Fruit fru1 = new Apple("Apple");
			Fruit p = (Apple)fru1.clone();
			FruitPool.put(key, p);
			return p;
		}
		return (Fruit)FruitPool.get(key);
	}
	public int GetFuirtCount() {
		return FruitPool.size();
	}
}
