package 学生管理系统2;

import java.util.Scanner;

public class Register {
	//初始化管理员用户和密码
	static String name = "admin";
	static String word = "admin";
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//添加一个客户端
		Register register = new Register();
		 register.Greet();
	}
	//登录页面
	public void Greet() {
		System.out.println("---------------------欢迎 登录学生信息管理系统----------------------");
		System.out.println("1.登录            2.退出");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("请选择:");
		int A = scanner.nextInt();
		switch (A) //使用Switch的方法判断输入的数字，输出不同的结果。
		{
		case 1://判断为1的时候输入密码账户比较正确
			System.out.println("欢迎登录！");
			System.out.println("请输入用户名");
			String B = scanner.next();
			System.out.println("请输入密码");
			String C = scanner.next();
			Admin D = new Admin(B, C); 
			boolean E = new Register().login(D);
			if(E == true) 
			{
				System.out.println("你好，"+B+"欢迎登录");
			}else {
				new Register().Greet();
			}
			
			break;
		case 2://输入2则退出
			System.out.println("已退出。。。");
			new  Register().Exit();
		default://其余则重新输入。
			System.out.println("输入错误，请重新输入");
			new Register().Greet();
			break;
		}
		new Register().Pipe();
	}

	public boolean login(Admin admin) 
	{
		//判断传入的是不是一样
		if(name.equals(admin.AdName) && word.equals(admin.AdWord)) 
		{
			return true;
		}else {
			return false;
		}
	}
	//退出系统
	public void Exit() 
	{
		System.exit(0);
	}
	
	//对学生的信息进行管理
	public void Pipe() 
	{
		System.out.println("************************请选择要操作的信息对应数字**************************");
		System.out.println("*1.查看学生信息  2.添加学生信息  3.删除学生信息   4.修改学生信息   5.  退出*");
		System.out.println("****************************************************************************");
		System.out.println("请选择");
		int D = scanner.nextInt();
		switch (D) {
		case 1:
			
			break;
		case 2:
		
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;

		default:
			System.out.println("输入有误，请重新输入.");
			new Register().Pipe();
			break;
		}
	}
	
	
	
	
	
}
