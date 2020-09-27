package _class;

public class doctor extends school {
	public doctor(int num,String name,String department) {
		this.num=num;
		this.name=name;
		this.department=department;
	}
	public static void main(String[] args) {
		doctor m=new doctor(101,"张杰","骨科");
		m.showName();
		m.showDepartment();
		m.showNum();
	}
}
