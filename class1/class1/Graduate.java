package class1;

import java.util.Scanner;

public class Graduate extends Student {
	private String subject;
	private String adviser;
	public Graduate() {
		super();
		subject="未定专业";
		adviser="未定导师";
	}
	public Graduate(String sub,String adv) {
		super();
		subject=sub;
		adviser=adv;
	}
	public Graduate(int Id,int Birth,String Name,String Sex,
			String sub,String adv) {
		super(Id,Birth,Name,Sex);
		subject=sub;
		adviser=adv;
	}
	public String toString() {
		return super.toString()+"专业："+subject+","+"导师："+adviser;
	}
	public Graduate(String subject,String adviser,int num,int birthday,
			String name,String sex) {
		this.adviser=adviser;
		this.subject=subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAdviser() {
		return adviser;
	}
	public void setAdviser(String adviser) {
		this.adviser = adviser;
	}
}
