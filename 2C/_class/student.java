package _class;

public class student extends school {
	
	public student(String name,String sex,int num) {
		this.name=name;
		this.sex=sex;
		this.num=num;
	}
	public static void main(String[] args) {
		student n=new student("lilei","女",1223);
		n.showName();
		n.showNum();
		n.showSex();
	}
}
