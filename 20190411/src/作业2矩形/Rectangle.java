package ��ҵ2����;
//2������һ��������Rectangle����֪ʶ�㣺����Ĵ�����ʹ�ã�[������]
//
//2.1 ��������������getArea()�������getPer()���ܳ���
//    showAll() �ֱ��ڿ���̨���������������ܳ���
//2.2 ��2�����ԣ���length����width
//2.3 ͨ�����췽��Rectangle(int width, int length)��
//    �ֱ���������Ը�ֵ
//2.4 ����һ��Rectangle����,����������Ϣ
public class Rectangle {
	public Rectangle() 
	{
		
	}
	public Rectangle(int width,int length) 
	{
		this.width = width;
		this.length = length;
	}
	int length;
	int width;
	//�����ڲ���ֵ�����ֱ��ʹ�����е�ֵ
	public int getArea() //�������
	{
		int num = width*length;
		return num;
	}
	public int getPer()//���ܳ�
	{
		int num2 =  (width+length)*2;
		return num2;
	}
	
}
