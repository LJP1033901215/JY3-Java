package ���;
/*
 * �������ԣ�C1��š�C2���֡�C3�Ա�C4���䡢
 *         C5���C6���֤�š�C7��ַ��C8�绰��C9����
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
	String C1;//���
	
	String C2;//����
	
	char C3;//�Ա�
	
	int C4;//����
	
	boolean C5;//���
	
	String C6;//���֤
	
	String C7;//��ַ
	
	String C8;//�绰
	
	Person C9;//����
	
	//���
	public boolean jiehun(Person name1)//����
	{
		Minzhengju minzhengju = new Minzhengju();
		boolean J2 = minzhengju.jiehungueize(this, name1);
		return J2;
		
	}
}
