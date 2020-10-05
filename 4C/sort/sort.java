package sort;

import java.util.Arrays;

public class sort {
	public static void main(String[] args) {
		sort num1=new sort();
		int i;
		int[] num= {0};
		num=Arrays.copyOf(num, 101);
		for(i=1;i<100;i++) {
			num[i]=(int)(Math.random()*500+1);
		}
		for(i=1;i<num1.sorted(num).length;i++) {
		System.out.println(num1.sorted(num)[i]);}
	}
	public int[] sorted(int num[]) {
		int i,t,j,x;
		int[] len=num;
		int z=len.length;
		for(i=1;i<z-1;i++) {
			t=i;
			for(j=i+1;j<z;j++) {
				if(len[j]<len[t]) {
					t=j;
					if(i!=t) {
					x=len[t];
					len[t]=len[i];
					len[i]=x;}
				}
			}
		}
		return len;
	}
}
