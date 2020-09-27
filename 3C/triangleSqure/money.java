package triangleSqure;

import java.util.Scanner;

public class money {
	double Money;
	public static void main(String[] args) {
		double money;
		Scanner n=new Scanner(System.in);
		double Money=n.nextDouble();
		n.close();
		money m=new money();
		m.bestZheng(Money);
		money=Money*100%100;
		m.bestLing((int)money);
		}
	public void bestZheng(double Money) {
		if(Money>100)
			System.out.println("100元 "+(int)Money/100);
			if((int)Money%100>50)
			System.out.println("50元 "+(int)Money%100/50);
			System.out.println("10元 "+(int)Money%100%50/10);
			System.out.println("5元   "+(int)Money%100%50%10/5);
			System.out.println("1元   "+(int)Money%100%50%10%5);
	}
	public void bestLing(int money) {
		if(money>50)
			System.out.println("5角   "+money/50);
			if(money%50>10)
			System.out.println("1角   "+money%50/10);
			System.out.println("5分   "+money%50%10/5);
			System.out.println("1分   "+money%50%10%5);
	}
}
