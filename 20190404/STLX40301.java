import java.util.*;
public class STLX40301
{
	public static void main(String[] args)
	{
		//������������Ķ���
		Scanner scanner = new Scanner(System.in);
		//�������
		System.out.print("�����������˻���");
		//���ܼ�������ĵ�һ���ַ���
		String q = scanner.next();
		System.out.print("�������������룺");
		//���ܼ�������ĵڶ����ַ���
		String e = scanner.next();
		//�����ʼ���˺ź�����
		char name = 'a';
		char word = 'b';
		//��������ȡ���ַ����еĵ�һ���ַ����Char
		char t = q.charAt(0);
		char c = e.charAt(0);
		if(t == name && c == word)
		{
			System.out.print("�����˺���ȷ");
		}else if(t != name || c != word)
		{
			System.out.print("������˺Ŵ���");
		}
	}
}