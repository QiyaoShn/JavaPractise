package MyGraphic;

public class MyGraphic {
	int x,y;
	MyGraphic(int x1,int y1){
		x=x1;
		y=y1;
	}
	MyGraphic(){
		this(0,0);
	}
	void moveTo(int x1,int y1) {
		x=x1;
		y=y1;
	}
}
