package stlx;

import java.util.Scanner;

public class Test {
	public static void main(String[] agrs) 
	{
	//������һ��USER�Ķ���
	User user = new User(); 
	//ʹ�ü�������
	Scanner scanner = new Scanner(System.in);
	System.out.println("�������˻�:");
	String c1 = scanner.next();
	System.out.println("����������:");
	String c2 = scanner.next();
	boolean c3 = user.uset(c1, c2);
	System.out.print(c3 == true ? "��¼�ɹ�":"��¼ʧ��");
	//�ر�Scanner
	scanner.close();
	}
}
