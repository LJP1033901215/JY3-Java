package 选择题案例;
/**
 * 选择题
 * @author Administrator
 *
 */
public class Question {

	int id;//题号
	String text;//题干
	String[]  XX = {};//选项
	
	//检查答案的方法
	public boolean JCDA() 
	{
		return false;
	}
	//打印题目到控制台
	public void TM() 
	{
		System.out.println(id+"题目:"+text);
//		for(int i=0;i<XX.length;i++) 
//		{
//			System.out.print(XX[i]);
//		}
		//增强for循环
		for(String str: XX) //不会报错 
		{
			System.out.print("\t"+str);
		}
		System.out.println("");
	}
}
