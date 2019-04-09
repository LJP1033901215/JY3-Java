package stlx;

import java.util.Scanner;

public class STLX01 {
	public static void main(String[] agrs)
	{
		book p1 = new book();
		p1.书名 = "解忧杂货店";
		p1.number = 335;
		p1.money = 30.5;
		p1.author = "东野圭吾";
		p1.ISBN = 123456789;
		p1.leixing = "小说故事";
		p1.chubanshe = "东京出版社";
		
		System.out.println("书名："+p1.书名);
		System.out.println("页数："+p1.number);
		System.out.println("价格："+p1.money);
		System.out.println("作者："+p1.author);
		System.out.println("ISBN："+p1.ISBN);
		System.out.println("类型："+p1.leixing);
		System.out.println("出版社："+p1.chubanshe);
		p1.lookbook();
		p1.Shifoushoucang = true;
		boolean c1 = p1.collectbook();
		if(c1 == true)
		{
			System.out.println("已收藏");
		}else 
		{
			System.out.println("未收藏");
		}
		double a1 = p1.maibook();
		System.out.print("您的价格是:"+a1+"元");

	}
	
}
class book
{
	String 书名;
	int number;
	double money;
	String author;
	int ISBN;
	String leixing;
	String chubanshe;
	boolean Shifoushoucang;

	
	public void lookbook()
	{
		System.out.println("正在看书....");
	}
	public  double maibook()  
	{
		Scanner unme = new Scanner(System.in);
		System.out.print("请输入购买的数量:");
		int a1 = unme.nextInt();
		return money*a1;
	}
	public boolean collectbook() 
	{
		return Shifoushoucang;
	}
}