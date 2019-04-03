import java.util.*;
public class l20190402
{
	public static void main(String[] args)
		//门
	{
		Scanner a = new Scanner(System.in);
		System.out.print("请输入要更换的字符");
		//给一个文字说
		String num = a.next();
		//索取控制器中的文字给 String（字符串） num
		char b = num.charAt(0);
		//转化字符串的第一个给char b
	    int d = r(b);
		//运行自己编辑的语法，r
		System.out.print("转换后的字符为："+d);
		//输出int字符

	}
	public static int r(char c)//b=char c
	{
		return c;
	}
}
//public class l201904021
//{
//	public static void main(String[])


//}