package stlx;

public class STLX03 {
	public static void main(String[] agrs)
	{
		Person p1 = new Person();
		Person p2 = new Person();
		p1.bh = 1001;
		p1.name = "С��";
		p1.sex = '��';
		p1.nl = 20;
		p1.hf = "δ���";
		p1.sfzh = "1033901231516231";
		p1.dz = "�������";
		p1.bl = "��";
		
		p2.bh = 1002;
		p2.name = "СС��";
		p2.sex = 'Ů';
		p2.nl = 19;
		p2.hf = "δ���";
		p2.sfzh = "1033901231516231";
		p2.dz = "�������";
		p2.bl = "��";
		System.out.print(p1);
	}
}
class Person
{
		int bh;
		String name;
		char sex;
		int nl;
		String hf;
		String sfzh;
		String dz;
		int dh;
		String bl;
}
