import java.util.*;
public class z20190402
{
	public static void main(String[] args)
	{
		//��һ������int���ͱ���age1��age2
        //1.��age1��ʼ������ֵΪ���Լ�������
		//2.��age2��ʼ������ֵΪ��ͬ��������
		//3.��������������ͬ������֮��
		int age1 = 18;
		int age2 = 36;
		System.out.println("����:"+(age1+age2));
		//�ڶ��ⶨ��һ��int���͵�����19��
		//�ڿ���̨�������2��������16��������8������
		int num = 250;
		//תΪ������
		String num2 = Integer.toBinaryString(num);
		//תΪ�˽���
		String num3 = Integer.toOctalString(num);
		//תΪʮ������
		String num4 = Integer.toHexString(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		//������
		//����һ��long ���ͱ�������12345678901
		//����һ��float���ͱ�������3.1415926
		//����һ��double ���ͱ�������1234567890.0987654321
		long num5 = 12345678901l;
		float num6 = 3.1415926f;
		double num7 = 1234567890.0987654321;
		System.out.println(num5+""+num6+""+num7);
		//������
		//1.ÿ����һ�γ����������A~Z ֮���ĳ����ĸ
		//2.���ͣ�int���� 97������ַ���ʲô��
		//3.�ַ���0�������������Ƕ��٣�
		//1.��������������������ֵĴ���
		Random random = new Random();
		int num8 = random.nextInt(26);
		char b = (char)('A'+num8);
		//2.
		System.out.println(b);
		char c = 97;
		System.out.println(c);
		//3.��һ�ַ���
		char e = 'o';
		int f = e;
		System.out.println(f);
		//�ڶ��ְ취��ֱ�����int
		System.out.println((int)e);
		//����һ��"ѭ��"
		//for(int i=0;i<100;i++)
		//������
		//1.ţ��֯Ů����᣺ ����ţ������֯Ů�����4.2���꣬����ÿֻϲȵ��0.45�ף�
		//����Ҫ����ֻϲȵ��β��Ӳ��ܼܳ� ȵ�ţ���������᣿
		double num9 = 9460730472581d*4.2;
		double num10 = 0.00045;
		System.out.println(num9 / num10);
		//2.�������������˶��� һ��С���384�׸ߵ����ϵ��䣬
		  //�ʵ�������ٶ��Ƕ���
		  //Ps:�ٶ�-ʱ�乫ʽ��v=gt
		  //λ��-ʱ�乫ʽ;h=gt^2/2
		  //�ٶ�-λ�ƹ�ʽ��v^2=2gh
		double x =2 * 9.8 * 384;
		System.out.print(Math.sqrt(x));
	}
}