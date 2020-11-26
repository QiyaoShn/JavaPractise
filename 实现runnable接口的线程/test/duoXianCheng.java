package test;

import java.util.Arrays;
import java.util.Random;
/*A矩阵的每一行和B矩阵的每一列的相乘和加和，
 * 都可以交给一个线程来计算，最终得到cij这个元素*/
public class duoXianCheng{
	static Random ran = new Random();
	public static void main(String[] args) {
		int len = ran.nextInt(10000);
		int a[][]=new int[len][len] ;
		int b[][]=new int[len][len] ;
		int num[]= {0};
		int sum=0;
		int lie[]=Arrays.copyOf(num, a.length+1);
		int hang[]=Arrays.copyOf(num, a.length+1);
		
		Runnable task1=()->{
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[0].length;j++) {
					a[i][j]=ran.nextInt(5);
				}
			}
		};
		Runnable task2=()->{
			for(int i=0;i<b.length;i++) {
				for(int j=0;j<b[0].length;j++) {
					b[i][j]=ran.nextInt(5);
				}
			}
		};
		Runnable task3=()->{
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<b[1].length;j++) {
					lie[j+1]=0;
					for(int k=0;k<b.length;k++) {
						 lie[j+1]+=a[i][k]*b[k][j];
					}
					System.out.print(" "+lie[j+1]);
				}
				System.out.println();
			}
		};
		new Thread(task1).start();
		new Thread(task2).start();
		new Thread(task3).start();
		//尝试实现多线程计算，但未实现多线程计算矩阵乘法，待更新...
	}
}