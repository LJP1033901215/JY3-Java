package stlx;

public class STLX02 {
	//�޲����Ĺ�����
	public STLX02() {
		x = 30;
		y = 60;
	}
	//�в����Ĺ��췽��
	public STLX02(int X,int Y)
	{
		x = X;
		y = Y;
	}
	
	int x;
	int y;
	int r;
	public double mianji()
	{
		return 3.14*r*r;
	}
	
	
	public static void main(String[] agrs)
	{
		//Circle name = new Circle();
		STLX02 sun = new STLX02();
		STLX02 sun2 = new STLX02(90,120);
		System.out.print(sun.x);
		System.out.print(sun2.x);
	}
	

}
//class Circle
//{
//	int x;
//	int y;
//	int r;
//	public double mianji(int r)
//	{
//		return 3.14*r;
//	}
//	//System.out.print("������һ�����췽��");
//}