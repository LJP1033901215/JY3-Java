package ��ҵ6;
/**7������һ��������Vehicle��Ҫ�����£�[ѡ����]

7.1���԰���������Ʒ��brand��String���ͣ�����ɫcolor��String����
	���ٶ�speed��double���ͣ���������������Ϊ˽�С�
7.2�����ṩһ���вεĹ��췽����Ҫ��Ʒ�ƺ���ɫ���Գ�ʼ��Ϊ����ֵ��
	���ٶȵĳ�ʼֵ����Ϊ0���� 7.3Ϊ˽�������ṩ������������ע�⣺����Ʒ��һ����ʼ��֮�����޸ġ�
7.4����һ��һ�㷽��run()���ô�ӡ��������������ܵĹ���
7.5���������VehicleTest������main�����д���һ��Ʒ��Ϊ��benz����
	��ɫΪ��black����������
 */
public class Vehicle {

	public Vehicle(){
		
	}
	public Vehicle(String brand,String color) 
	{
		this.brand = brand;
		this.color = color;
	}
	String brand;
	String color;
	static double speed = 0;
	
}
