package 作业5描述人;
/**5、定义两个类，描述如下： [必做题]

5.1定义一个人类Person：

	5.1.1定义一个方法sayHello()，可以向对方发出问候语“hello,my name is XXX”
	5.1.2有三个属性：名字、身高、体重

5.2定义一个PersonCreate类：

	5.2.1创建两个对象，分别是zhangsan，33岁，1.73；lishi，44，1.74
	5.2.2分别调用对象的sayHello()方法。
 */
public class PersonCreate {
	public static void main(String[] args) {
	Person zhangsan =new Person("zhangsan",33, 1.73);
	Person lisi = new Person("lisi",44,1.74);
	zhangsan.sayHello();
	lisi.sayHello();
	}
	
}
