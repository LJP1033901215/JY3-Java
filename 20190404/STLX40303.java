import java.util.*;
public class STLX40303
{
	public static void main(String[] agrs)
		//while����ѭ��
	{
		Scanner scanner = new Scanner(System.in);
		while(1==1)
		{
			System.out.print("������һ������:");
			int num = scanner.nextInt();
			if(num >=0 && num <= 5)
			{
				break;
			}
		}
		System.out.print("exit...");
	}
}