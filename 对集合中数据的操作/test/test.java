package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class test {
	public static void main(String[] args) {
		Vector<String> book1 = new Vector<>();
		//Vector是线程安全的，性能较差
		book1.addElement("基地三部曲");
		book1.addElement("数学真重要");
		System.out.println(book1.get(1));
		
		ArrayList<String> book2 = new ArrayList<String>();
		//在首尾插入元素（add）和随机访问元素时性能较高，在中间插入元素时性能较低
		book2.add("论数学的重要性");
		book2.add("en有一天我会觉得英语也很重要");
		System.out.println(book2.get(1));
		
		LinkedList<String> book3 = new LinkedList<String>();
		//不支持高效的随机元素访问，在中间插入元素性能较高，除了在集合
		//中大量随机插入删除操作时用LinkedList其他情况用ArrayList
		book3.add("少壮不努力，老大哭数学");
		book3.add("唧唧复唧唧，请你好好学数学");
		book3.add(1, "终于发现编的不是程序，是数学");
		book3.add(1, "知道真相的我眼泪掉下来");
		System.out.println(book3.get(1));
		System.out.println(book3.get(3));
	}
}
