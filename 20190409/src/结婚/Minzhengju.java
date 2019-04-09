package 结婚;
/*
 * 定义属性：C1编号、C2名字、C3性别、C4年龄、
 *         C5婚否、C6身份证号、C7地址、C8电话、C9伴侣
 * 
 * 民政局的类*/
//结婚规则
public class Minzhengju {

	public boolean jiehungueize(Person p1,Person p2)
	{
		if(p1.C3 != p2.C3)
		{
			if(p1.C4 >= 22 && p2.C4 >= 20 && p1.C3== '男' ||p1.C4 >=20 && p2.C4 >= 22 && p1.C3 == '女') 
			{
				if(!p1.C5 && !p2.C5)
				{
					p1.C9 = p2;
					p2.C9 = p1;
					//System.out.println("P1伴侣名字"+p1.C9.C2);
					//System.out.println("P2伴侣名字"+p2.C9.C2);
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
