package 作业2矩形;
//2、定义一个矩形类Rectangle：（知识点：对象的创建和使用）[必做题]
//
//2.1 定义三个方法：getArea()求面积、getPer()求周长，
//    showAll() 分别在控制台输出长、宽、面积、周长。
//2.2 有2个属性：长length、宽width
//2.3 通过构造方法Rectangle(int width, int length)，
//    分别给两个属性赋值
//2.4 创建一个Rectangle对象,并输出相关信息
public class Rectangle {
	public Rectangle() 
	{
		
	}
	public Rectangle(int width,int length) 
	{
		this.width = width;
		this.length = length;
	}
	int length;
	int width;
	//括号内不赋值则可以直接使用类中的值
	public int getArea() //求面积；
	{
		int num = width*length;
		return num;
	}
	public int getPer()//求周长
	{
		int num2 =  (width+length)*2;
		return num2;
	}
	
}
