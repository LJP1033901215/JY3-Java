package 圆;

public class Test {
	public static void main(String[] args) {
//	Yuan yuan = new Yuan();
	Point yuanxin =new Point(0, 0);//圆心
	Yuan yuan = new Yuan(yuanxin,2);//圆
	Point dian =new Point(1, 1);//比较的点
	System.out.println(yuan.contains(dian) == true ? "在圆内":"在圆外");
	}
	
}
