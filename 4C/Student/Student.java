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
	public static void main(String[] args) {
		double sum[]= {};
		sum=Arrays.copyOf(sum, 6);
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
		for(int i=0;i<6;i++) {
			sum[i]=m[i].scoreplus(m[i].score1,m[i].score2,m[i].score3);
		}
	}
	double scoreplus(double x,double y,double z) {
		return x*y*z;
	}
	double[] sorted(double m[]) {
		int i,j,t;
		double k;
		for(i=0;i<5;i++) {
			t=i;
			for(j=i+1;j<6;j++) {
				if(m[t]>m[j]) 
					t=j;
				if(t!=i) {
					k=m[t];
					m[t]=m[i];
					m[i]=m[t];
				}
			}
		}
		return m;
	}
}
