package stlx;

import java.util.Scanner;

public class STLX01 {
	public static void main(String[] agrs)
	{
		book p1 = new book();
		p1.���� = "�����ӻ���";
		p1.number = 335;
		p1.money = 30.5;
		p1.author = "��Ұ����";
		p1.ISBN = 123456789;
		p1.leixing = "С˵����";
		p1.chubanshe = "����������";
		
		System.out.println("������"+p1.����);
		System.out.println("ҳ����"+p1.number);
		System.out.println("�۸�"+p1.money);
		System.out.println("���ߣ�"+p1.author);
		System.out.println("ISBN��"+p1.ISBN);
		System.out.println("���ͣ�"+p1.leixing);
		System.out.println("�����磺"+p1.chubanshe);
		p1.lookbook();
		p1.Shifoushoucang = true;
		boolean c1 = p1.collectbook();
		if(c1 == true)
		{
			System.out.println("���ղ�");
		}else 
		{
			System.out.println("δ�ղ�");
		}
		double a1 = p1.maibook();
		System.out.print("���ļ۸���:"+a1+"Ԫ");

	}
	
}
class book
{
	String ����;
	int number;
	double money;
	String author;
	int ISBN;
	String leixing;
	String chubanshe;
	boolean Shifoushoucang;

	
	public void lookbook()
	{
		System.out.println("���ڿ���....");
	}
	public  double maibook()  
	{
		Scanner unme = new Scanner(System.in);
		System.out.print("�����빺�������:");
		int a1 = unme.nextInt();
		return money*a1;
	}
	public boolean collectbook() 
	{
		return Shifoushoucang;
	}
}