package test;

import java.util.Arrays;
import java.util.Random;

public class JuZhenCheng implements Runnable{
	static Random ran = new Random();
	@Override
	public void run() {
		long startTime=System.currentTimeMillis() ; 
		int len = ran.nextInt(5000);
		int a[][]=new int[len][len] ;
		int b[][]=new int[len][len] ;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				a[i][j]=ran.nextInt(5);
			}
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				b[i][j]=ran.nextInt(5);
			}
		}
		int num[]= {0};
		int sum=0;
		int i=0,j=0,k=0;
		int lie[]=Arrays.copyOf(num, a.length+1);
		int hang[]=Arrays.copyOf(num, a.length+1);
		for(i=0;i<a.length;i++) {
			for(j=0;j<b[1].length;j++) {
				lie[j+1]=0;
				for(k=0;k<b.length;k++) {
					 lie[j+1]+=a[i][k]*b[k][j];
				}
				System.out.print(" "+lie[j+1]);
			}
			System.out.println();
		}
		long endTime=System.currentTimeMillis(); 
		System.out.println((endTime-startTime)/1000+"s"); 
	}
	public static void main(String[] args) {
		Runnable a = new JuZhenCheng();
		Thread t = new Thread(a);
		t.start();
	}
}