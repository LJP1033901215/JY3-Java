import java.util.*;
public class l20190402
{
	public static void main(String[] args)
		//��
	{
		Scanner a = new Scanner(System.in);
		System.out.print("������Ҫ�������ַ�");
		//��һ������˵
		String num = a.next();
		//��ȡ�������е����ָ� String���ַ����� num
		char b = num.charAt(0);
		//ת���ַ����ĵ�һ����char b
	    int d = r(b);
		//�����Լ��༭���﷨��r
		System.out.print("ת������ַ�Ϊ��"+d);
		//���int�ַ�

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