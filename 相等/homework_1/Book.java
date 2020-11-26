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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ChuBan == null) ? 0 : ChuBan.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (ChuBan == null) {
			if (other.ChuBan != null)
				return false;
		} else if (!ChuBan.equals(other.ChuBan))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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

