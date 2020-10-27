package Student;

import java.util.Arrays;
import java.util.Vector;

import _class.student;

public class vectorStudent {
	private String name, sex;
	private int num;
	private int grade1,grade2,grade3;
	private double score1,score2,score3;
	public vectorStudent(){
		name="";
		num=000;
		sex="";
		grade1=0;
		grade2=0;
		grade3=0;
		score1=0;
		score2=0;
		score3=0;
	}
	public vectorStudent(String Name,int Num,String Sex,int Grade1,
	int Grade2,int Grade3,double Score1,double Score2,double Score3) {
		name=Name;
		num=Num;
		sex=Sex;
		grade1=Grade1;
		grade2=Grade2;
		grade3=Grade3;
		score1=Score1;
		score2=Score2;
		score3=Score3;
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getGrade1() {
		return grade1;
	}
	public void setGrade1(int grade1) {
		this.grade1 = grade1;
	}
	public int getGrade2() {
		return grade2;
	}
	public void setGrade2(int grade2) {
		this.grade2 = grade2;
	}
	public int getGrade3() {
		return grade3;
	}
	public void setGrade3(int grade3) {
		this.grade3 = grade3;
	}
	public double getScore1() {
		return score1;
	}
	public void setScore1(double score1) {
		this.score1 = score1;
	}
	public double getScore2() {
		return score2;
	}
	public void setScore2(double score2) {
		this.score2 = score2;
	}
	public double getScore3() {
		return score3;
	}
	public void setScore3(double score3) {
		this.score3 = score3;
	}
	public String toString() {
		return name+","+sex+","+grade1+","+grade2+","+grade3+","+score1+","+score2+","+score3;
	}
	public static void main(String[] args) {
		double sum[]= {};
		sum=Arrays.copyOf(sum, 7);
		vectorStudent stu1 = new vectorStudent("lilei",001,"男",90,89,78,
				4.0,3.9,2.8);
		vectorStudent stu2 = new vectorStudent("lijie",002,"女",100,99,68,
				5.0,4.9,1.8);
		vectorStudent stu3 = new vectorStudent("huhai",003,"男",82,89,90,
				3.2,3.9,4.0);
		vectorStudent stu4 = new vectorStudent("wenhai",004,"女",79,99,88,
				2.9,4.9,3.8);
		vectorStudent stu5 = new vectorStudent("meihong",005,"男",90,80,79,
				4.0,3.0,2.9);
		vectorStudent stu6 = new vectorStudent("hubei",006,"男",65,67,68,
				1.5,1.7,1.8);
		
		Vector <vectorStudent> student = new Vector<vectorStudent>();
		student.add(stu1);
		student.add(stu2);
		student.add(stu3);
		student.add(stu4);
		student.add(stu5);
		student.add(stu6);
		for(vectorStudent stu:student) {
			System.out.println(stu.toString());
		}
		for(int i=0,j=1;i<6;i++,j++) {
			sum[j]=(student.elementAt(i).score1*student.elementAt(i).score2*student.elementAt(i).score3);
		}
		vectorStudent stu =new vectorStudent();
		stu.sorted(sum);
		for(int i=1;i<7;i++) {
			System.out.println(sum[i]);
		}
	}
public void sorted(double m[]) {
	int i,j,t;
	double k;
	for(i=1;i<7;i++) {
		for(j=1;j<7-i;j++) {
			if(m[j]>m[j+1]) {
				k=m[j];
				m[j]=m[j+1];
				m[j+1]=k;
			}
				
		}
	}
}
}