package ѧ������ϵͳ2;

import java.util.Scanner;

public class Register {
	//��ʼ������Ա�û�������
	static String name = "admin";
	static String word = "admin";
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//���һ���ͻ���
		Register register = new Register();
		 register.Greet();
	}
	//��¼ҳ��
	public void Greet() {
		System.out.println("---------------------��ӭ ��¼ѧ����Ϣ����ϵͳ----------------------");
		System.out.println("1.��¼            2.�˳�");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("��ѡ��:");
		int A = scanner.nextInt();
		switch (A) //ʹ��Switch�ķ����ж���������֣������ͬ�Ľ����
		{
		case 1://�ж�Ϊ1��ʱ�����������˻��Ƚ���ȷ
			System.out.println("��ӭ��¼��");
			System.out.println("�������û���");
			String B = scanner.next();
			System.out.println("����������");
			String C = scanner.next();
			Admin D = new Admin(B, C); 
			boolean E = new Register().login(D);
			if(E == true) 
			{
				System.out.println("��ã�"+B+"��ӭ��¼");
			}else {
				new Register().Greet();
			}
			
			break;
		case 2://����2���˳�
			System.out.println("���˳�������");
			new  Register().Exit();
		default://�������������롣
			System.out.println("�����������������");
			new Register().Greet();
			break;
		}
		new Register().Pipe();
	}

	public boolean login(Admin admin) 
	{
		//�жϴ�����ǲ���һ��
		if(name.equals(admin.AdName) && word.equals(admin.AdWord)) 
		{
			return true;
		}else {
			return false;
		}
	}
	//�˳�ϵͳ
	public void Exit() 
	{
		System.exit(0);
	}
	
	//��ѧ������Ϣ���й���
	public void Pipe() 
	{
		System.out.println("************************��ѡ��Ҫ��������Ϣ��Ӧ����**************************");
		System.out.println("*1.�鿴ѧ����Ϣ  2.���ѧ����Ϣ  3.ɾ��ѧ����Ϣ   4.�޸�ѧ����Ϣ   5.  �˳�*");
		System.out.println("****************************************************************************");
		System.out.println("��ѡ��");
		int D = scanner.nextInt();
		switch (D) {
		case 1:
			
			break;
		case 2:
		
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;

		default:
			System.out.println("������������������.");
			new Register().Pipe();
			break;
		}
	}
	
	
	
	
	
}
