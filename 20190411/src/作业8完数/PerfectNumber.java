package 作业8完数;

public class PerfectNumber {
	//8.一个数如果恰好等于它的因子之和,这个数就成为"完数".
	//	例如6=1+2+3.编程:找出1000以内的所有完数.
	public static void main(String[] args) {
	
	
		for(int i=2;i<1000;i++)
		{
			int sum = 0;
			for(int j = 1; j < i; j++) 
			{
				if(i%j == 0) 
				{
					sum = sum +j;
				}
			}
			if (i== sum) {
				System.out.println(sum);
			}
		}
	}
}
