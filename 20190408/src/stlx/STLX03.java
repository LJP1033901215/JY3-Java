package stlx;

public class STLX03 {
	public static void main(String[] agrs)
	{
		Person p1 = new Person();
		Person p2 = new Person();
		p1.bh = 1001;
		p1.name = "小刘";
		p1.sex = '男';
		p1.nl = 20;
		p1.hf = "未结婚";
		p1.sfzh = "1033901231516231";
		p1.dz = "香格里拉";
		p1.bl = "无";
		
		p2.bh = 1002;
		p2.name = "小小刘";
		p2.sex = '女';
		p2.nl = 19;
		p2.hf = "未结婚";
		p2.sfzh = "1033901231516231";
		p2.dz = "香格里拉";
		p2.bl = "无";
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
