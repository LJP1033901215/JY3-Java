package ���;
/*
 * �������ԣ�C1��š�C2���֡�C3�Ա�C4���䡢
 *         C5���C6���֤�š�C7��ַ��C8�绰��C9����
 * 
 * �����ֵ���*/
//������
public class Minzhengju {

	public boolean jiehungueize(Person p1,Person p2)
	{
		if(p1.C3 != p2.C3)
		{
			if(p1.C4 >= 22 && p2.C4 >= 20 && p1.C3== '��' ||p1.C4 >=20 && p2.C4 >= 22 && p1.C3 == 'Ů') 
			{
				if(!p1.C5 && !p2.C5)
				{
					p1.C9 = p2;
					p2.C9 = p1;
					//System.out.println("P1��������"+p1.C9.C2);
					//System.out.println("P2��������"+p2.C9.C2);
					p1.C5 = true;
					p2.C5 = true;
//					System.out.println(p1.C2);
//					System.out.println(p2.C2);
//					System.out.println(p1.C9.C2);
//					System.out.println(p2.C9.C2);
					p1.C9.C2 = p2.C2;
					p2.C9.C2 = p1.C2;
					
					return true;
				}
			}
		}
		return false;
		
	}
}
