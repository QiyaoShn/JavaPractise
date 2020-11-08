package 泛型方法;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(2, "add");
		map.put(4, "adfa");
		System.out.println(map.get(2));
		System.out.println(map.get(4));
		
		Map<String,Car> carmap = new HashMap<String,Car>();
		carmap.put("奔驰", new Car("奔驰",3,4));
		carmap.put("宝马", new Car("宝马",1,4));
		System.out.println(carmap.get("奔驰"));
	}
}
