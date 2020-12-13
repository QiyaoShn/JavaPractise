package _class;

public class school {
	public String name;
	public String sex;
	public String department;
	public String professional;
	public int birthday;
	public int num;
	public school() {
		name="";
		sex="";
		department="";
		professional="";
		birthday=000;
	}
	public school (String name,String sex,int num) {
		this.name=name;
		this.num = num;
		this.sex = sex;
	}
	public school(String Professional, int Birthday) {
		this.professional=Professional;
		this.birthday=Birthday;
	}
	public school(String Department) {
		this.department = Department;
	}
	
	@Override
	public String toString() {
		return "school [professional=" + professional + ", birthday=" + birthday + "]";
	}
	public static void main(String[] args) {
		builder s = new builder("14教","14-A-404");
		System.out.println(s.getLocation());
		school s2 = new school("教授",20020403);
		school s1 = new builder("13教","13-B-101");
		s1.showDepartment();
		System.out.println(s2);
		System.out.println(s);
	}
	
	public void showName() {
		System.out.println(name);
	}
	public void showSex() {
		System.out.println(sex);
	}
	public void showDepartment(){
		System.out.println(department);
	}
	public void showProfessional() {
		System.out.println( professional);
	}
	public void showBirthday() {
		System.out.println(birthday);
	}
	public void showNum() {
		System.out.println(num);
	}
}
