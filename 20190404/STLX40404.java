import java.util.Arrays;
public class STLX40404
{
	public static void main(String[] agrs)
	{
		String zfc = "统计一个字符在字符串中的所有位置";
		//int[] zi =f(zfc,'字');
		//System.out.println(Arrays.toString(zi));
		f(zfc,'字');
	}
	public static void f(String zfc,char ch)
	{
		for(int i=0;i<zfc.length();i++){
		
			char x = zfc.charAt(i);
			if(ch==x)
			{
			System.out.print(i);
			}

		}










		/*int[] zi = {};
		for(int i=0;i<zfc.length();i++)
		{
			char c = zfc.charAt(i);
			if(c==ch)
			{
				zi = Arrays.copyOf(zi,zi.length+1);
				zi[zi.length-1] = i;
			}
		}
		return zi;*/
	}
}