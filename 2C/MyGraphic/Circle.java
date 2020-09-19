package MyGraphic;

public class Circle extends MyGraphic {
	int r;
	public Circle (int x,int y,int r) {
		super(x,y);
		this.r=r;
	}
	public Circle() {
		this(0, 0, 1);  //单位圆
	}
}
