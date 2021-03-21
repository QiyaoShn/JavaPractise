package Shape;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
public class XMLUtil {
	//该方法用于从xml配置文件中提取水果名称，并返回该水果名称
	public static String getShapeName() {
		try {
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("configShape.xml"));
			//获取包含品牌名称的文本节点
			NodeList nl = doc.getElementsByTagName("shapeName");
			Node classNode = nl.item(0).getFirstChild();
			String shapeName = classNode.getNodeValue().trim();
			return shapeName;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
	