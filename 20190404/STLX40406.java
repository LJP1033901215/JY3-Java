import java.util.*;
public class STLX40406{
public static void main(String[] agrs)
	{
		String zfc ="把这段话中的带字的汉字提标记出来";
		f(zfc,'字');
	}
	public static void f(String zfc,char ch)
	{
		for(int i=0;i<zfc.length();i++)
		{
			char x =zfc.charAt(i);
			if(x==ch)
			{
			System.out.print(i);
			}
		}
	}
}