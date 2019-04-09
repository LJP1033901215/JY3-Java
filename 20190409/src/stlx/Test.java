package stlx;

import java.util.Scanner;

public class Test {
	public static void main(String[] agrs) 
	{
	//创建了一个USER的对象
	User user = new User(); 
	//使用键盘输入
	Scanner scanner = new Scanner(System.in);
	System.out.println("请输入账户:");
	String c1 = scanner.next();
	System.out.println("请输入密码:");
	String c2 = scanner.next();
	boolean c3 = user.uset(c1, c2);
	System.out.print(c3 == true ? "登录成功":"登录失败");
	//关闭Scanner
	scanner.close();
	}
}
