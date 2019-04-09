package 圆;

public class Yuan {
	public Yuan()
	{
		
	}
	public Yuan(Point p1,int r) 
	{
		this.p1 = p1;
		this.r = r;
	}
	
	Point p1;//圆心
	
	int r;//半径
	
	//求圆的面积
	public double Area(int r)
	{
		return Math.PI*r*r;
	}
	//计算圆是否包含点
	public boolean contains(Point p)
	{
		boolean name = Math.pow((p.x - p1.x),2) + Math.pow((p.y- p1.y),2) <= r*r;
		return name;
	}
	//重载方法contains(int x， int y)
	public boolean contains(int x, int y)
	{
		boolean name = Math.pow((x - p1.x),2) + Math.pow((y- p1.y),2) <= r*r;
		return name;
	}
	
}
class Point//创建point（圆）类
{
	public Point()//创建一个空的无参选择器占位置
	{
		 
	}
	public Point(int x, int y)//创建一个有参选择器 
	{
		this.x = x;
		this.y = y;
	}
	int x;
	int y;
}
