package ��ҵ4����;
/**
 * 
 * 4�����һ����Student���������������ѧ�źͳɼ���
 *  	���һ�����������ճɼ��Ӹߵ��͵�˳�����������ѧ�źͳɼ���Ϣ��[ѡ����]
 *
 */
public class Student {

	String name;
	int number;
	int grade;
	
	public void sort(int[] CJ,String[] XH,String[]XM)
	{
		for(int i=0;i<CJ.length;i++)
		{
			for(int j=0;j<CJ.length-i-1;j++)
			{
				if(CJ[j] < CJ[j+1]) 
				{
					//���ݳɼ��ųɼ�
					int tem = CJ [j+1];
					CJ [j+1] = CJ[j];
					CJ[j] = tem;
					//���ݳɼ���ѧ��
					String unm = XH[j+1];
					XH[j+1] = XH[j];
					XH[j] = unm;
					//���ݳɼ�������
					String num = XM[j+1];
					XM[j+1] = XM[j];
					XM[j] = num;
				}
			}
			System.out.print("�ɼ�"+CJ[i]+"��");
			System.out.print("ѧ��"+XH[i]+"��");
			System.out.println("����:"+XM[i]);
		}
	}
}
