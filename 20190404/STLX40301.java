import java.util.*;
public class STLX40301
{
	public static void main(String[] args)
	{
		//创建键盘输入的对象
		Scanner scanner = new Scanner(System.in);
		//输出文字
		System.out.print("请输入您的账户：");
		//接受键盘输入的第一个字符串
		String q = scanner.next();
		System.out.print("请输入您的密码：");
		//接受键盘输入的第二个字符串
		String e = scanner.next();
		//宁义初始化账号和密码
		char name = 'a';
		char word = 'b';
		//根据索引取出字符串中的第一个字符变成Char
		char t = q.charAt(0);
		char c = e.charAt(0);
		if(t == name && c == word)
		{
			System.out.print("密码账号正确");
		}else if(t != name || c != word)
		{
			System.out.print("密码或账号错误");
		}
	}
}