package ��������ԭ��;
//�����ĵ���ԭ���Ǿͽ�ԭ���Ǹ�ת��������ת���Ǹ���
public class Method {
	//����ǩ��
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
		//����int����ΪclassתΪint���ת��long�����������int��
	}
}
