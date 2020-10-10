package Student;

import java.util.Arrays;

public class Student {
	String name, sex;
	int num;
	int grade1,grade2,grade3;
	double score1,score2,score3;
	
	public Student(String name,int num,String sex,int grade1,
	int grade2,int grade3,double score1,double score2,double score3) {
		this.name=name;
		this.num=num;
		this.sex=sex;
		this.grade1=grade1;
		this.grade2=grade2;
		this.grade3=grade3;
		this.score1=score1;
		this.score2=score2;
		this.score3=score3;
	}
	public Student() {
		
	}
	public static void main(String[] args) {
		double sum[]= {};
		sum=Arrays.copyOf(sum, 7);
		Student m[]= {};
		m=Arrays.copyOf(m, 6);
		m[0]=new Student("lilei",001,"男",90,89,78,
				4.0,3.9,2.8);
		m[1]=new Student("lijie",002,"女",100,99,68,
				5.0,4.9,1.8);
		m[2]=new Student("huhai",003,"男",82,89,90,
				3.2,3.9,4.0);
		m[3]=new Student("wenhai",004,"女",79,99,88,
				2.9,4.9,3.8);
		m[4]=new Student("meihong",005,"男",90,80,79,
				4.0,3.0,2.9);
		m[5]=new Student("hubei",006,"男",65,67,68,
				1.5,1.7,1.8);
		for(int i=0,j=1;i<6;i++,j++) {
			sum[j]=(m[i].score1*m[i].score2*m[i].score3);
		}
		Student stu =new Student();
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
