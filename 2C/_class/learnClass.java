package _class;

public class learnClass extends school {
	int classNum;
	int studentNumber;
	public learnClass(int classNum,String name,int 
			studentNumber) {
		this.classNum=classNum;
		this.name=name;
		this.studentNumber=studentNumber;
	}
	public static void main(String[] args) {
		learnClass m =new learnClass(11901,"大数据",39);
		m.showName();
		System.out.println(m.classNum);
		System.out.println(m.studentNumber);
	}
}
