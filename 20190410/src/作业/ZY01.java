package 作业;
	/*1、定义一个点类Point，包含2个成员变量x、y分别表示x和y坐标，2个构造器
		Point()和Point(intx0,y0),以及一个movePoint（int dx,int dy)方法实现点的位置移动，
		创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标。[必作题]*/
public class ZY01
{
	int x;
	int y;

	public ZY01() 
	{	
		
	}
	public ZY01(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	public void movePoint(int dx,int dy) 
	{
//		ZY01 point1 = new ZY01(x,y);
		x += dx;
		y += dy;
//		return point1;
	}
	
}	
	

	
 