import java.util.*;
public class zuoye40201
{//���÷�������
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		System.out.println("��������Ҫ���������");
		int num1 = input.nextInt();//��ȡ���������
		int y =f(num1);//ʹ��������ֽ��к���
		int e =g(num1);//ʹ��������ֽ��к���
		System.out.println("�������������++Ϊ��"+y+"\n"+e);
		//���������ɵ���
	}
	//       int������������ f:����(�����б�����)
	public static int f(int num){
		int c = num%3;
		return c;
	}
	public static int g(int num2){
		int d = num2++;
		return d;
	}

}