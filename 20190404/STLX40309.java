import java.util.*;
public class STLX40309
{
	public static void main(String[] agrs)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.print("�����������Ʒ���:");
		String str = scanner.next();
		System.out.println(str);
		//String str = "692116851128";
		//System.out.print(str.length());
		//�������
		int o =0;
		for(int i=0;i<str.length();i+=2)
		{
			char c = str.charAt(i);
			o += c - 48;
		}
		System.out.println(o);
		//ż�����
		int j =0;
		for(int i=1;i<str.length();i+=2)
		{
			char e =str.charAt(i);
			j += e - 48;
		}
		System.out.println(j);
		int cc = o + j*3;


	}
}