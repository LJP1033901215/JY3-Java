package 作业5;
/**5、定义两个类，描述如下： [必做题]

5.1定义一个人类Person：

	5.1.1定义一个方法sayHello()，可以向对方发出问候语“hello,my name is XXX”
	5.1.2有三个属性：名字、身高、体重

5.2定义一个PersonCreate类：

	5.2.1创建两个对象，分别是zhangsan，33岁，1.73；lishi，44，1.74
	5.2.2分别调用对象的sayHello()方法。
 */
public class Person {
	public Person() {
		
	}
	public Person(String name,int age ,double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	String name;
	int age;
	double height;
	
	public void sayHello() 
	{
		System.out.println("hello,my name is"+name);
		System.out.println("我的名字叫"+"\t"+name+"\t"+"我今年"+"\t"+age+"\t"+"我的身高"+"\t"+height);
	}
}
