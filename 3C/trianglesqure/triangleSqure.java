package trianglesqure;

import java.util.Scanner;
public class triangleSqure {
	public static void main(String[] args) {
		float a,b,c,s;
		Scanner x = new Scanner(System.in);
		a=x.nextFloat();
		b=x.nextFloat();
		c=x.nextFloat();
		x.close();
		triangleSqure san = new triangleSqure();
		if(san.isprime(a,b,c)) {
			s=(a+b+c)/2;
		System.out.println(san.squre(a, b, c, s));
		}
		else System.out.println("输入的三边长度无法构成三角形");
	}
	boolean isprime(float x,float y,float z) {
		boolean b=false;
		if(x>0&&y>0&&z>0) {
		if(((x+y)>z)&&((x+z)>y)&&((z+y)>x)) {
			b=true;
			}
		else b=false;
		}
		return b;
	}
	double squre(float a,float b,float c,float s){
		return (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}
}
