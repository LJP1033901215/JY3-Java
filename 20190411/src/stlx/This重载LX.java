package stlx;

public class This重载LX {

}
class Money
{
	//重载方法
	//1.方法名一样
	//2.方法参数不一样
	
	public Money() 
	{
		
	}
	public Money(int d) //方法重载
	{
		this.value = d;
		this.herght = d;
		this.width = d;
		//or this(d,d,d);
	}
	public Money(int value,int herght,int width) //构造器
	{
		this.value = value;
		this.herght = herght;
		this.width = width;
	}
	int value;//面值
	int herght;//宽度
	int width;//长度

}