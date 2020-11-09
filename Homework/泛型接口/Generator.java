package 泛型接口;

public interface Generator<T> {
	public T next(); 		//使用泛型定义接口的返回参数
	public T nextNumber();
}
