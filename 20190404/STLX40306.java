import java.util.*;
public class STLX40306
{
	//分页的逻辑
	public static void main(String[] agrs)
	{
		//让键盘在控制台输入
		Scanner scanner = new Scanner(System.in);
		//输出的语言
		System.out.print("请输入总的数据数量:");
		//从控制台接受数据作为总的数据
		int sx = scanner.nextInt();
		//一页的数据是10条
		int y = 10;
		int x = sx % y == 0 ? sx/y : sx/y + 1;
		System.out.print("一共有"+x+"页");
	}

}