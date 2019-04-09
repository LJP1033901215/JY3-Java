package stlx;

public class STLX04 {
	public static void main(String[] ages)
	{
		for(int i=0;i<600;i++)
		{
			long a = f(i);
			System.out.println(a);
		}
		
		
	}
	public static long f(long c1)
	{
		if(c1 == 1||c1 == 0)
		{
			return 1;
		}else {
			return f(c1-1)*c1;
		}
	}
	
	
}
