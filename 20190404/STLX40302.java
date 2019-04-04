import java.util.*;
public class STLX40302
{
	public static void main(String[] args)
	{
		
		Scanner console = new Scanner(System.in);
		//创建键盘输入的对象
		System.out.print("请输入您的年份:");
		//这是键盘输入的数字
		int C1 = console.nextInt();
		//这是从控制台索取到的数字
		double C2 = 7.7/100;
		if(C1>2){
			C2 *= 0.5;
		}else if(C1>=2 && C1<3){
			C2 *= 0.7;
		}else if(C1>=3 && C1<5){
			C2 = C2;
		}else{
			C2 *= 1.1;
		}
		System.out.print("您的年利率为:"+C2);
	}



}