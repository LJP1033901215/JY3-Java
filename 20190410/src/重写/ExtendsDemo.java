package 重写;

public class ExtendsDemo {
	public static void main(String[] args) 
	{
		//new子类的对象
		noteComputer name = new noteComputer();
		name.playGame();
		//new父类的对象
		Computer name2 = new Computer();
		name2.playGame();
	}
	
}
class Computer 
{
	String brand;//品牌
	String type;//型号
	
	public void playGame() //打游戏
	{
		System.out.println("Gaming");
	}
	
	public void playCode() //敲代码
	{
		System.out.println("Coding");
	}
}
class noteComputer extends Computer
{	
	//注解
	//@Override
	//首先继承,
	//其次方法/返回值类型/方法名称/参数列表必须一致。
	//重写规则只改变"方法体",其他的不改变
	public void playGame() 
	{
		System.out.println("玩高级游戏");
	}
	
	//继承关系里面存在重载关系
	public void playCode(String str) 
	{
		System.out.println(str+"敲代码");
	}
}