package course;

class Course {
	String name;
	String teacherName;
	String roomNumber;
	void getname(String name) {
		this.name=name;
	}
	String setname() {
		return name;
	}
	void getteacherName(String teacherName) {
		this.teacherName=teacherName;
	}
	String setteacherName() {
		return teacherName;
	}
	void getroomNumber(String roomNumber) {
		this.roomNumber=roomNumber;
	}
	String setroomNumber() {
		return roomNumber;
	}
	public static void main(String[] args) {
		Course room1=new Course();
		Course room2=new Course();
		room1.getname("马哲");
		room1.getroomNumber("122");
		room1.getteacherName("Jack");
		room2.getname("毛概");
		room2.getroomNumber("130");
		room2.getteacherName("Jason");
		System.out.println(room1.name); 
		System.out.println(room1.roomNumber); 
		System.out.println(room1.teacherName); 
		System.out.println(room2.name); 
		System.out.println(room2.roomNumber); 
		System.out.println(room2.teacherName); 
	}
}
