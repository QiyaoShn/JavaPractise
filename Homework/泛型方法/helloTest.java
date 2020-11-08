package 泛型方法;

public class helloTest {
	public static <T,K> void DisplayArray(T[] anArray,K[] twoArray){
		for(T t:anArray) {
			System.out.println(t); //默认使用了toString
			System.out.println("----");
		}
		for(K k:twoArray) {
			System.out.println(k);
			System.out.println("----");
		}
	}
	public static void main(String[] args) {
		String[] strArray={"ABC","CBD","DEF"};
		
		Integer[] inArray= {1,2,3,4,5};
		
		Car[] carArray=new Car[2];
		carArray[0]=new Car("奔驰",3,4);
		carArray[1]=new Car("宝马",3,4);
		DisplayArray(carArray,strArray);
	}
}
