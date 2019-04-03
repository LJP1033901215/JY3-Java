import java.util.*;
public class zuoye40201
{//运用方法计算
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		System.out.println("请输入你要求余的数：");
		int num1 = input.nextInt();//截取输入的数字
		int y =f(num1);//使输入的数字进行函数
		int e =g(num1);//使输入的数字进行函数
		System.out.println("求出的余数和数++为："+y+"\n"+e);
		//输出运算完成的数
	}
	//       int运算数据类型 f:名称(参数列表；变量)
	public static int f(int num){
		int c = num%3;
		return c;
	}
	public static int g(int num2){
		int d = num2++;
		return d;
	}

}