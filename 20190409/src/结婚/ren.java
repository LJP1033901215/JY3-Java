package ���;
/*�������ԣ�C1��š�C2���֡�C3�Ա�C4���䡢
*         C5���C6���֤�š�C7��ַ��C8�绰��C9����*/
public class ren {
	public static void main(String[] agrs)
	{
		
		Person boy = new Person("56431186", "����", '��', 22, false, "15351312", "ʯ��ׯ", "123646548",null);
		Person girl = new Person("56431186", "ܽ��", 'Ů', 20, false, "15351332", "ʯ��ׯ", "123623348",null);
//		boy.C9 = girl;
//		girl.C9 = boy;
		boolean J1 = boy.jiehun(girl);
		System.out.print(J1);
		System.out.print(J1 == true ? "���ɹ�":"�򲻷��Ϲ涨���޷����");
	}

}
