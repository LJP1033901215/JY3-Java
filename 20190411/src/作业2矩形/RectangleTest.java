package 作业2矩形;

public class RectangleTest {
	public static void main(String[] args) {
	Rectangle name = new Rectangle(3,5);
	//int name2 = name.getArea(6, 9);
	//int name3 = name.getPer(3, 5);
	System.out.println("长度为:"+name.length);
	System.out.println("宽度为:"+name.width);
	System.out.println("面积为:"+name.getArea());
	System.out.println("周长为:"+name.getPer());
	}
	
	
}
