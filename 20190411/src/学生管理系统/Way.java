package ѧ������ϵͳ;

import java.util.Scanner;

public class Way {
	public static void main(String[] args) {
		CS name66 = new CS();
		
		System.out.println();
	}
	
	String accounts = "������";
	String passwords = "123456";
	//����1.�ж��Ƿ��½������¼ֱ���˳���
	public void greet(int X) 
	{
		if(X == 1) 
		{
			System.out.println("��ӭ���ĵ�½��");
		}else if(X == 2) 
		{
			System.out.println("�����˳�...");
			System.exit(X);
		}else {
			System.out.println("�������,����������.");
		}
	}
	//����2.�ж��˺������Ƿ���ȷ������ȷ��ɹ����粻�ɹ����Զ�����������
	public void Login(String account,String password) 
	{
		if (account.equals(accounts) && password.equals(passwords))
		{
			System.out.println("��½�ɹ�"+"\n"+"��ӭ����"+accounts);
		}else{
				System.out.println("����������ƻ�������������������");
				Scanner name5 = new Scanner(System.in);
				System.out.println("��������������:");
				String accounta = name5.next();
				Scanner name6 = new Scanner(System.in);
				System.out.println("��������������:");
				String passworda = name6.next();
				Login(accounta, passworda);	
				name5.close();
				name6.close();
			}
		
		
		
	}
}
