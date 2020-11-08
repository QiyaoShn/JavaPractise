package 泛型方法;

public class helloTest {
	public static <T> void DisplayArray(T[] anArray){
		for(T t:anArray) {
			System.out.println(t);
			System.out.println("----");
		}
	}
	public static void main(String[] args) {
		String[] strArray={"ABC","CBD","DEF"};
		DisplayArray(strArray);
		Integer[] inArray= {1,2,3,4,5};
		DisplayArray(inArray);
		
		Car[] carArray=new Car[2];
		carArray[0]=new Car("奔驰",3,4);
		carArray[1]=new Car("宝马",3,4);
		DisplayArray(carArray);
	}
}
