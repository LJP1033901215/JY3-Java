package �̳�;
//����
/*1.����:����/����/����
  2.�����������Ա��̳�
  3.�����̳и���ķ����ͳ�Ա����
  4.ʵ��������,��ݹ���丸������пռ�(ʵ��������,ͬʱʵ��������)
  5.һ������ֻ����һ������
  6.���๹����һ�����ø��๹����
  */
public class Person {
	public Person() 
	{
		System.out.println("���๹����");
	}
	String zhonglei;
	int tizhong;
	int shengao;
	public void num() 
	{
		System.out.println("�ܲ�������");
	}
}
//extends:�̳е���˼
class Child extends Person
{
	public Child() 
	{
		super();//���ø���Ĺ�����һ����Ĭ�ϵ�
	}
	public void sys()
	{
		System.out.println("�Է�������");
	}
}
class Boy extends Child
{
	
}
 