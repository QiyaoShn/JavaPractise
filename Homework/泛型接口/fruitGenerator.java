package 泛型接口;

import java.util.Random;

public class fruitGenerator<T> implements Generator <T> {
	private String fruits[] = new String[] {"Banana","Apple","Pear"};
	private Integer numbers[] = new Integer[] {1,2,3};
	@Override
	
	public T next() {
		Random rm = new Random();
		return (T)fruits[rm.nextInt(fruits.length)];
	}
	public T nextNumber() {
		Random rx = new Random();
		return (T)numbers[rx.nextInt(numbers.length)];
	}
}
