package wordrate;

import java.util.Arrays;

public class wordrate {
	public static void main(String[] args) {
		int i;
		int[] num= {};
		wordrate num1=new wordrate();
		num=Arrays.copyOf(num, 1000);
		for(i=0;i<1000;i++) {
			num[i]=(int)(Math.random()*100+1);
		}
		for(i=1;i<101;i++)
			System.out.println(num1.compare(num)[i]);
	}
	int[] compare(int num[]) {
		int num1[]= {};
		num1=Arrays.copyOf(num1, 101);
		for(int i=0;i<1000;i++) {
			for(int j=1;j<101;j++) {
				if(num[i]==j) {
					num1[j]++;
				}
			}
		}
		return num1;
	}
}
