package _class;

public class student extends school {
	private String name="12";
	public student(String name,String sex,int num) {
		super();
		this.name=name;
		this.sex=sex;
		this.num=num;
	}
	public void hello() {
		System.out.println(name);
	}
}
