package 作业4排名;
/**
 * 
 * 4、设计一个类Student，该类包括姓名、学号和成绩。
 *  	设计一个方法，按照成绩从高到低的顺序输出姓名、学号和成绩信息。[选做题]
 *
 */
public class Student {

	String name;
	int number;
	int grade;
	
	public void sort(int[] CJ,String[] XH,String[]XM)
	{
		for(int i=0;i<CJ.length;i++)
		{
			for(int j=0;j<CJ.length-i-1;j++)
			{
				if(CJ[j] < CJ[j+1]) 
				{
					//根据成绩排成绩
					int tem = CJ [j+1];
					CJ [j+1] = CJ[j];
					CJ[j] = tem;
					//根据成绩排学号
					String unm = XH[j+1];
					XH[j+1] = XH[j];
					XH[j] = unm;
					//根据成绩排名称
					String num = XM[j+1];
					XM[j+1] = XM[j];
					XM[j] = num;
				}
			}
			System.out.print("成绩"+CJ[i]+"、");
			System.out.print("学号"+XH[i]+"、");
			System.out.println("姓名:"+XM[i]);
		}
	}
}
