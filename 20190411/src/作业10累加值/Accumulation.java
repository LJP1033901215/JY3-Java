package 作业10累加值;
//累加值
//求整数1~100的累加值，但要求跳过所有个位为3的数。（使用for循环实现）
public class Accumulation {
public static void main(String[] args) {
	int sun = 0;
	for (int i = 0; i <=100; i++)
	{
		if(i%10 != 3) 
		{
		  sun = sun +i;
		}
		
	}
	System.out.println(sun);
}
}
