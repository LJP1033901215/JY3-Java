package ��ҵ9С����������;

public class Ball {

	//9.һ��С���100�߶���������,ÿ����غ�����ԭ�߶ȵ�һ��,
	//	�����£������ڵ�ʮ�����ʱ,������������?��10�η������?
	public static void main(String[] args) {
		double sum = 100.0;
		double num = 0;
		for (int i = 0; i <=10; i++) 
		{
			sum = sum /2; 
			num+= sum;
		}
		System.out.println("��ʮ�εĸ߶���:"+sum);
		System.out.println("��ʮ�����ʱ������:"+num);
		
	}
}
