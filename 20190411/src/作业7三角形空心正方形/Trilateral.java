package ��ҵ7�����ο���������;
//��ӡ������
public class Trilateral {

	public static void main(String[] args) 
	{
		for(int i=0;i<6;i++)
		{
			for (int k =5-i; k >=0; k--) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
