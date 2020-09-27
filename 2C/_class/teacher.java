package _class;

public class teacher extends school {
		public teacher(String name,String department,String
				professional) {
			this.name=name;
			this.department=department;
			this.professional=professional;
		}
		public static void main(String[] args) {
			teacher m=new teacher("胡英","教研办","副教授");
			m.showName();
			m.showDepartment();
			m.showProfessional();
		}
	}
