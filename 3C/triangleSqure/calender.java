package triangleSqure;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class calender {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入月份：");
		int month1=sc.nextInt();
		int year1=2020;
		Calendar c=Calendar.getInstance();
		c.set(year1, month1-1,1);
		int week1=c.get(Calendar.DAY_OF_WEEK);
		String days=" ";
		switch (week1) {
			case 1:days="日";
				   break;
			case 2:days="一";
			   break;
			case 3:days="二";
			   break;
			case 4:days="三";
			   break;
			case 5:days="四";
			   break;
			case 6:days="五";
			   break;
			case 7:days="六";
			   break;
		}
		int max1=c.getActualMaximum(Calendar.DATE);
		System.out.println(year1+"年"+month1+"月"+"的日历：");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int j=1;j<week1;j++) {
			System.out.print(" ");
			System.out.print("\t");
		}
		int tag=week1;
		for(int i=1;i<=max1;i++) {
			System.out.print(i);
			System.out.print("\t");
			if(tag%7==0) {
				System.out.print("\n");}
			tag++;
		}
		System.out.println("\n");
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		System.out.println("请输入日份：");
		int day = sc.nextInt();
		Calendar m = Calendar.getInstance();
		m.set(year, month-1,day);
		int week = m.get(Calendar.DAY_OF_WEEK);
		switch (week) {
			case 1:days="日";
				   break;
			case 2:days="一";
			   break;
			case 3:days="二";
			   break;
			case 4:days="三";
			   break;
			case 5:days="四";
			   break;
			case 6:days="五";
			   break;
			case 7:days="六";
			   break;
		}
		int max=m.getActualMaximum(Calendar.DATE);
		System.out.println(year+"年"+month+"月"+day+"日"+"是星期"+days);
		System.out.println(year+"年"+month+"月有"+max+"天");
		System.out.println("请输入第一个日期的年月日，并以空格分开：");
		LocalDate date1=LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("请输入第二个日期的年月日，并以空格分开：");
		LocalDate date2=LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
		long Day=Math.abs(date1.toEpochDay()-date2.toEpochDay());
		System.out.printf("这两个日期相差了%d天",Day);
		sc.close();
	}
}
