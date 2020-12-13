package _class;

public class teacher extends school {
		public teacher(String Professional,int Birthday) {
			super(Professional,Birthday);
		}
		public static void main(String[] args) {
			teacher m=new teacher("副教授",19890305);
			m.showProfessional();
			m.showBirthday();
			m.birthday = 2000312;
			m.showBirthday();
		}
	}
