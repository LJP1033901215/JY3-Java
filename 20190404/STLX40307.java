import java.util.*;
public class STLX40307
{	//循环接收控制台输入的一个数
	//   并且输出控制台"您输入的数是"，
	//   如果输入”-1“退出循环。
	public static void main(String[] agrs)
	{
		//while循环，
		Scanner scanner = new Scanner(System.in);
		while(-1 == -1)
		{
			int sx = scanner.nextInt();
			System.out.println("您输入的数是:"+sx);
			if(sx == -1)
			{
				break;
			}
		}
		System.out.println("exit...");
	}
}