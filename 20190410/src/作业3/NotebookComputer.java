package ��ҵ3;

/**
 * 
 * @author Administrator
 * 3������һ���ʼǱ��࣬��������ɫ��char����cpu�ͺţ�int���������ԡ� [������]
	3.1 �޲κ��вε��������췽�����вι��췽�������ڴ��������ͬʱΪÿ�����Ը�ֵ;
	3.2 ����ʼǱ���Ϣ�ķ���
	3.3 Ȼ���дһ�������࣬���ԱʼǱ���ĸ�������.
 *
 */
public class NotebookComputer {

	public NotebookComputer() 
	{
		
	}
	public NotebookComputer(char color,int CPU) 
	{
		this.color = color;
		this.CPU =CPU;
	}
	char color;
	int CPU;
	public void Output() 
	{
		System.out.println("���Ե���ɫ��:"+color+"\n"+"CPU�ͺ�:"+CPU);
	}
}
