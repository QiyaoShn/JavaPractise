package Shape;

public class Client {
	public static void main(String[] args) throws Exception{
		try {
			shape shap;
			String shapeName = XMLUtil.getShapeName();
			shap = Factory.createShape(shapeName);
			shap.draw();
			shap.erase();
		}catch(Exception e){
			System.out.println("UnSupportedShapeException");
		}
	}
}
