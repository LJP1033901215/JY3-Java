package ��ҵ10�ۼ�ֵ;
//�ۼ�ֵ
//������1~100���ۼ�ֵ����Ҫ���������и�λΪ3��������ʹ��forѭ��ʵ�֣�
public class Accumulation {
public static void main(String[] args) {
	int sun = 0;
	for (int i = 0; i <=100; i++)
	{
		if(i%10 != 3) 
		{
		  sun = sun +i;
		}
		
	}
	System.out.println(sun);
}
}
