package 继承;
//人类
/*1.名称:基类/超类/父类
  2.构造器不可以被继承
  3.子类会继承父类的方法和成员变量
  4.实例化子类,会递归分配父类的所有空间(实例化子类,同时实例化父类)
  5.一个子类只能有一个父类
  6.子类构造器一定调用父类构造器
  */
public class Person {
	public Person() 
	{
		System.out.println("父类构造器");
	}
	String zhonglei;
	int tizhong;
	int shengao;
	public void num() 
	{
		System.out.println("跑步。。。");
	}
}
//extends:继承的意思
class Child extends Person
{
	public Child() 
	{
		super();//调用父类的构造器一般是默认的
	}
	public void sys()
	{
		System.out.println("吃饭、、、");
	}
}
class Boy extends Child
{
	
}
 