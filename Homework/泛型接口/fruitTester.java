package 泛型接口;

public class fruitTester {
	public static void main(String[] args) {
		fruitGenerator fruit = new fruitGenerator<String>();
		fruitGenerator number = new fruitGenerator<Integer>();
		for(int i=0;i<8;i++)
			System.out.println(fruit.next());
		for(int i=0;i<8;i++)
			System.out.println(number.nextNumber());
	}
}
