package class1;

import java.util.Scanner;

public class Student {
	private int id;
	private int birthday;
	protected String name;
	private String sex;
	public Student() {
		id=0;
		birthday=00000000;
		name=" ";
		sex=" ";
	}
	public Student(int Id,int Birth,String Name,String Sex) {
		id=Id;
		birthday=Birth;
		name=Name;
		sex=Sex;
	}
	public String toString() {
		return name+","+sex+","+birthday+","+id;
	}
	public static void main(String[] args) {
		Student stu=new Graduate("太极拳","张三丰");
		Student stu2= new Graduate(101, 20020104, "lili", "boy",
				"太极拳","张三丰");
		System.out.println(stu2);
		System.out.println(stu);
		stu.modify(stu2.name);
		System.out.println(stu);
		System.out.println(stu2);
	}
	public void modify(String name) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请修改姓名");
		this.name=sc.nextLine();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}