import java.util.Arrays;
public class STLX40404
{
	public static void main(String[] agrs)
	{
		String zfc = "ͳ��һ���ַ����ַ����е�����λ��";
		//int[] zi =f(zfc,'��');
		//System.out.println(Arrays.toString(zi));
		f(zfc,'��');
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