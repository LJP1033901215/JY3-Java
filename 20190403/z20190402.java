import java.util.*;
public class z20190402
{
	public static void main(String[] args)
	{
		//第一题声明int类型变量age1和age2
        //1.将age1初始化，赋值为你自己的年龄
		//2.将age2初始化，赋值为你同桌的年龄
		//3.输出你的年龄与你同桌年龄之和
		int age1 = 18;
		int age2 = 36;
		System.out.println("年龄:"+(age1+age2));
		//第二题定义一个int类型的整数19，
		//在控制台输出它的2进制数和16进制数和8进制数
		int num = 250;
		//转为二进制
		String num2 = Integer.toBinaryString(num);
		//转为八进制
		String num3 = Integer.toOctalString(num);
		//转为十六进制
		String num4 = Integer.toHexString(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		//第三题
		//定义一个long 类型变量等于12345678901
		//定义一个float类型变量等于3.1415926
		//定义一个double 类型变量等于1234567890.0987654321
		long num5 = 12345678901l;
		float num6 = 3.1415926f;
		double num7 = 1234567890.0987654321;
		System.out.println(num5+""+num6+""+num7);
		//第四题
		//1.每运行一次程序，随机生成A~Z 之间的某个字母
		//2.整型（int）数 97代表的字符是什么？
		//3.字符‘0’代表整型数是多少？
		//1.下面两行是随机生成数字的代码
		Random random = new Random();
		int num8 = random.nextInt(26);
		char b = (char)('A'+num8);
		//2.
		System.out.println(b);
		char c = 97;
		System.out.println(c);
		//3.第一种方法
		char e = 'o';
		int f = e;
		System.out.println(f);
		//第二种办法，直接输出int
		System.out.println((int)e);
		//穿插一个"循环"
		//for(int i=0;i<100;i++)
		//第五题
		//1.牛郎织女来相会： 假设牛郎星与织女星相距4.2光年，假设每只喜鹊长0.45米，
		//问需要多少只喜鹊首尾相接才能架成 鹊桥，让两人相会？
		double num9 = 9460730472581d*4.2;
		double num10 = 0.00045;
		System.out.println(num9 / num10);
		//2.计算自由落体运动： 一个小球从384米高的塔上掉落，
		  //问到地面的速度是多少
		  //Ps:速度-时间公式：v=gt
		  //位移-时间公式;h=gt^2/2
		  //速度-位移公式：v^2=2gh
		double x =2 * 9.8 * 384;
		System.out.print(Math.sqrt(x));
	}
}