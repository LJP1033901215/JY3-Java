package ��ҵ;
	/*1������һ������Point������2����Ա����x��y�ֱ��ʾx��y���꣬2��������
		Point()��Point(intx0,y0),�Լ�һ��movePoint��int dx,int dy)����ʵ�ֵ��λ���ƶ���
		��������Point����p1��p2���ֱ����movePoint�����󣬴�ӡp1��p2�����ꡣ[������]*/
public class ZY01
{
	int x;
	int y;

	public ZY01() 
	{	
		
	}
	public ZY01(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	public void movePoint(int dx,int dy) 
	{
//		ZY01 point1 = new ZY01(x,y);
		x += dx;
		y += dy;
//		return point1;
	}
	
}	
	

	
 