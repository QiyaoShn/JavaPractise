package test;

import java.util.Set;
import java.util.TreeSet;

public class BookOrder implements Comparable{
	String name;
	private String ChuBan;
	@Override
	public int compareTo(Object o) {
		BookOrder book=(BookOrder) o;
		return name.compareTo(book.name);
		//本类属性在左，传入对象在右（反序后大小排列顺序交换）
		//即：传入对象小于本类属性返回1，大于本类对象返回-1.所以TreeSet的排序标准为从大到小
	}
	public BookOrder() {
		name="";
		ChuBan="";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookOrder other = (BookOrder) obj;
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

	public BookOrder(String name, String ChuBan) {
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
	public static void main(String[] args) {
		Set<BookOrder> set = new TreeSet();//非包装类实现Comparable接口自定义排序(重写compareTo方法)
		BookOrder book1 = new BookOrder("哈利波特","新华出版社");
		BookOrder book2 = new BookOrder("千与千寻","华中师范大学出版社");
		BookOrder book3 = new BookOrder("千与千寻","华中师范大学出版社");
		BookOrder book4 = new BookOrder("阿波罗","华中师范大学出版社");
		set.add(book1);
		set.add(book2);
		set.add(book3);
		set.add(book4);
		for(BookOrder book:set) {
			System.out.println(book.name);
		}
		Set<Integer> setnumber= new TreeSet();//TreeSet对包装类排序
		setnumber.add(3);
		setnumber.add(1);
		setnumber.add(10);
		for(Integer cnt:setnumber) {
			System.out.println(cnt.intValue());
		}
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
