package ��д;

public class ExtendsDemo {
	public static void main(String[] args) 
	{
		//new����Ķ���
		noteComputer name = new noteComputer();
		name.playGame();
		//new����Ķ���
		Computer name2 = new Computer();
		name2.playGame();
	}
	
}
class Computer 
{
	String brand;//Ʒ��
	String type;//�ͺ�
	
	public void playGame() //����Ϸ
	{
		System.out.println("Gaming");
	}
	
	public void playCode() //�ô���
	{
		System.out.println("Coding");
	}
}
class noteComputer extends Computer
{	
	//ע��
	//@Override
	//���ȼ̳�,
	//��η���/����ֵ����/��������/�����б����һ�¡�
	//��д����ֻ�ı�"������",�����Ĳ��ı�
	public void playGame() 
	{
		System.out.println("��߼���Ϸ");
	}
	
	//�̳й�ϵ����������ع�ϵ
	public void playCode(String str) 
	{
		System.out.println(str+"�ô���");
	}
}