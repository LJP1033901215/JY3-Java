import java.util.*;
public class STLX40308
{
	//����p1(x1,y1)��p2(x2,y2)֮��ľ���
	public static void main(String[] agrs)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.print("������P1X������");
		int x1 = scanner.nextInt();
		System.out.print("������P1Y������");
		int y1 = scanner.nextInt();
		System.out.print("������P2X������");
		int x2 = scanner.nextInt();
		System.out.print("������P2Y������");
		int y2 = scanner.nextInt();
		double dis = f(x1,y1,x2,y2);
		System.out.println(dis);
	}
	public static double f(int x1,int y1,int x2,int y2)
		{
	
		//double a = 0.0;
		double dis = Math.sqrt(Math.pow(x1 - x2,2)+Math.pow(y1 - y2,2));//����ֵ
		return dis;



	//	int c = (p1x - p2x)*(p1x - p2x);
	//	int d = (p1y - p2y)*(p1y - p2y);
		
	//	int e = c+d;
	//	System.out.print(e);
	//	return Math.sqrt(e);
	}
}