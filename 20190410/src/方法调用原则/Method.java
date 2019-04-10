package 方法调用原则;
//方法的调用原则是就近原则，那个转换近，就转换那个。
public class Method {
	//方法签名
	public void add(int a,int b) 
	{
		System.out.println(a+b);
		System.out.println("int");
	}
	public void add(long a,int b) 
	{
		System.out.println(a+b);
		System.out.println("long");
	}
	public static void main(String[] agrs)
	{
		Method name = new Method();
		name.add('A',50);
		//调用int，因为class转为int会比转成long近，所以输出int。
	}
}
