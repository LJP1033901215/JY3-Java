public class STLX40402
{
public static void main(String[] agrs)
{
	//创建数组
	/*类型   默认值
	  int       0
	  boolean  false
	  char    '\u0000'
	  daoble    0.0
	  */
	 // 特点；1.连续
		//    2.下标是从0开始
		  //  3.数组得长度是不可更改的
	/*创建数组的方法
	1.int[] num =new int[5];
	num[0] = 5;
	num[1] = 15;
	2.int [] nums =new int[]{15,3,1,5,1};
	3.int [] nums = {1,2,3,4,5};
	*/
	int[] nums = new  int[]{5,12,15,6,5,};
	num[0] = 5;
	num[1] = 15;
	for(int i=0;i<num.length;i++)
	{
	System.out.print(num[i]);
	}

}


}