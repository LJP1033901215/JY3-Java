package ��ҵ12��;

//12.һ��ԪǮ��ټ�,����ÿֻ��Ԫ��ĸ��ÿֻ��Ԫ�� С����С��Ǯ�ͣ�
//   ��ֻС����һԪ,����ĸ����С������������м��ֹ��򷽷�?
public class Chook {
	
		public static void count(int money)
		{
			int C = 0;//���Ǹ�������ӱ���
			for(int i=0;i<=money/5;i++)//����ѭ������������
			{
				for(int j=0;j<=money/3; j++)//����ѭ��ĸ��������
				{
					for(int k = 0; k <=money; k++) //����ѭ��С��������
					{
						
						if (5*i+3*j+1*k==money && i+j+3*k==100)//�����ж����ּ���������Ǯ�� 
						{
						C++;
						System.out.println("����:"+i+"ĸ��:"+j+"С��:"+3*k);
						}
					}
				}
				
			}
			System.out.println("һ���У�"+C+"�ַ���");
		}
	}
	
	
