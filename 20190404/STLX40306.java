import java.util.*;
public class STLX40306
{
	//��ҳ���߼�
	public static void main(String[] agrs)
	{
		//�ü����ڿ���̨����
		Scanner scanner = new Scanner(System.in);
		//���������
		System.out.print("�������ܵ���������:");
		//�ӿ���̨����������Ϊ�ܵ�����
		int sx = scanner.nextInt();
		//һҳ��������10��
		int y = 10;
		int x = sx % y == 0 ? sx/y : sx/y + 1;
		System.out.print("һ����"+x+"ҳ");
	}

}