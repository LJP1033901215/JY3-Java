package ѡ���ⰸ��;
/**
 * ѡ����
 * @author Administrator
 *
 */
public class Question {

	int id;//���
	String text;//���
	String[]  XX = {};//ѡ��
	
	//���𰸵ķ���
	public boolean JCDA() 
	{
		return false;
	}
	//��ӡ��Ŀ������̨
	public void TM() 
	{
		System.out.println(id+"��Ŀ:"+text);
//		for(int i=0;i<XX.length;i++) 
//		{
//			System.out.print(XX[i]);
//		}
		//��ǿforѭ��
		for(String str: XX) //���ᱨ�� 
		{
			System.out.print("\t"+str);
		}
		System.out.println("");
	}
}
