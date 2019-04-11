package 学生管理系统;

import java.util.Scanner;

//学生信息管理系统
public class HomePage {
	public static void main(String[] args) {
		/*System.out.println("**********************欢迎 登陆学生信息管理系统***********************");
		System.out.println("1.登陆"+"\t"+"2.退出");
		System.out.println("--------------------------------------------------------------");
		Scanner name1 = new Scanner(System.in);
		System.out.println("请选择:");
		int name2 = name1.nextInt();
		name1.close();
		new Way().greet(name2);//引用方法一
		
		Scanner name3 = new Scanner(System.in);
		System.out.println("请输入您的姓名:");
		String accountq = name3.next();
		
		Scanner name4 = new Scanner(System.in);
		System.out.println("请输入您的密码:");
		String passwordq = name4.next();
		
		new Way().Login(accountq, passwordq);//引用方法二
		*/
//-------------------------------以下是添加学生信息栏-------------------------------------
		System.out.println("************************请选择要操作的信息对应数字****************************");
		System.out.println("*1.查看学生信息"+"\t"+"2.添加学生信息"+"\t"+"3.删除学生信息"+"\t"+"4.修改学生信息"+"\t"+"5.退出"+"*");
		System.out.println("**********************************************************************");
		Scanner name7 = new Scanner(System.in);
		System.out.println("请选择:");
		String name8 = name7.next();
		CS name66 = new CS();
		System.out.println(name66);
	}
	
	
}
