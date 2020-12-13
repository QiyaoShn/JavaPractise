package _class;

public class student extends school {
	
	public student(String name,String sex,int num) {
		super(name,sex,num);
	}
	public static void main(String[] args) {
		student n=new student("leilo","女",123);
		n.showName();
		n.showNum();
		n.showSex();
	}
}
