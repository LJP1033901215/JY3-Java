package ��ҵ5;
/**5�����������࣬�������£� [������]

5.1����һ������Person��

	5.1.1����һ������sayHello()��������Է������ʺ��hello,my name is XXX��
	5.1.2���������ԣ����֡���ߡ�����

5.2����һ��PersonCreate�ࣺ

	5.2.1�����������󣬷ֱ���zhangsan��33�꣬1.73��lishi��44��1.74
	5.2.2�ֱ���ö����sayHello()������
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
		System.out.println("�ҵ����ֽ�"+"\t"+name+"\t"+"�ҽ���"+"\t"+age+"\t"+"�ҵ����"+"\t"+height);
	}
}
