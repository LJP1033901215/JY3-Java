package Բ;

public class Yuan {
	public Yuan()
	{
		
	}
	public Yuan(Point p1,int r) 
	{
		this.p1 = p1;
		this.r = r;
	}
	
	Point p1;//Բ��
	
	int r;//�뾶
	
	//��Բ�����
	public double Area(int r)
	{
		return Math.PI*r*r;
	}
	//����Բ�Ƿ������
	public boolean contains(Point p)
	{
		boolean name = Math.pow((p.x - p1.x),2) + Math.pow((p.y- p1.y),2) <= r*r;
		return name;
	}
	//���ط���contains(int x�� int y)
	public boolean contains(int x, int y)
	{
		boolean name = Math.pow((x - p1.x),2) + Math.pow((y- p1.y),2) <= r*r;
		return name;
	}
	
}
class Point//����point��Բ����
{
	public Point()//����һ���յ��޲�ѡ����ռλ��
	{
		 
	}
	public Point(int x, int y)//����һ���в�ѡ���� 
	{
		this.x = x;
		this.y = y;
	}
	int x;
	int y;
}
