package homework_1;

import java.util.HashSet;
import java.util.Set;

public class Book {
	private String name;
	private String ChuBan;
	public Book() {
		name="";
		ChuBan="";
	}

	public Book(String name, String ChuBan) {
		this.name = name;
		this.ChuBan = ChuBan;
	}
	public int hashCode() {		//自定义哈希值（重写）
		return ChuBan.hashCode();
	}
	public boolean equals(Object o) {	//自定义相等属性（重写）
		Book book = (Book)o;
		if (name.equals(book.name)&&ChuBan.equals(book.ChuBan)){
			return true;
		}else
			return false;
	}
	public static void main(String[] args) {
		Set<Book> set = new HashSet();
		Book book1 = new Book("哈利波特","新华出版社");
		Book book2 = new Book("千与千寻","华中师范大学出版社");
		Book book3 = new Book("千与千寻","华中师范大学出版社");
		set.add(book1);
		set.add(book2);
		set.add(book3);
		System.out.println(set.size());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getChuBan() {
		return ChuBan;
	}

	public void setChuBan(String chuBan) {
		ChuBan = chuBan;
	}

}

