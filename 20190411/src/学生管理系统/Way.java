package 学生管理系统;

import java.util.Scanner;

public class Way {
	public static void main(String[] args) {
		CS name66 = new CS();
		
		System.out.println();
	}
	
	String accounts = "刘江鹏";
	String passwords = "123456";
	//方法1.判断是否登陆，不登录直接退出。
	public void greet(int X) 
	{
		if(X == 1) 
		{
			System.out.println("欢迎您的登陆！");
		}else if(X == 2) 
		{
			System.out.println("正在退出...");
			System.exit(X);
		}else {
			System.out.println("输入错误,请重新输入.");
		}
	}
	//方法2.判断账号密码是否正确，如正确则成功，如不成功则自动继续方法。
	public void Login(String account,String password) 
	{
		if (account.equals(accounts) && password.equals(passwords))
		{
			System.out.println("登陆成功"+"\n"+"欢迎您，"+accounts);
		}else{
				System.out.println("您输入的名称或密码有误，请重新输入");
				Scanner name5 = new Scanner(System.in);
				System.out.println("请输入您的姓名:");
				String accounta = name5.next();
				Scanner name6 = new Scanner(System.in);
				System.out.println("请输入您的密码:");
				String passworda = name6.next();
				Login(accounta, passworda);	
				name5.close();
				name6.close();
			}
		
		
		
	}
}
