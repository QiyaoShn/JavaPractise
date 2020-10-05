package mygraphic;

public class triangle extends MyGraphic {
	int z;
	public triangle (int x,int y,int z) {
		super(x,y);
		this.z=z;
	}
	public triangle() {
		this(1, 1, 1);  //三边长度
	}
}
