package 结婚;
/*
 * 定义属性：C1编号、C2名字、C3性别、C4年龄、
 *         C5婚否、C6身份证号、C7地址、C8电话、C9伴侣
 * */
public class Person {
	public Person()
	{
		
	}

	public Person(String C1,String C2,char C3,int C4,boolean C5,String C6,String C7,String C8,Person C9)
	{
	this.C1 = C1;
	this.C2 = C2;
	this.C3 = C3;
	this.C4 = C4;
	this.C5 = C5;
	this.C6 = C6;
	this.C7 = C7;
	this.C8 = C8;
	this.C9 = C9;
		
	}
	String C1;//编号
	
	String C2;//名字
	
	char C3;//性别
	
	int C4;//年龄
	
	boolean C5;//婚否
	
	String C6;//身份证
	
	String C7;//地址
	
	String C8;//电话
	
	Person C9;//伴侣
	
	//结婚
	public boolean jiehun(Person name1)//方法
	{
		Minzhengju minzhengju = new Minzhengju();
		boolean J2 = minzhengju.jiehungueize(this, name1);
		return J2;
		
	}
}
