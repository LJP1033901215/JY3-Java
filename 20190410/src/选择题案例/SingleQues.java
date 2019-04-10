package 选择题案例;
/**
 *单项选择题
 * @author Administrator
 *
 */
public class SingleQues extends Question{
	String BZDA;
	String[]  KSDA = {};
	public SingleQues() 
	{
		
	}
	//构建了一个题
	public SingleQues(int id,String text,String[] XX, String BZDA, String[] KSDA) 
	{
		this.id= id;
		this.text= text;
		this.XX= XX;
		this.BZDA= BZDA;
		this.KSDA = KSDA;
	}
//	public SingleQues(String[] KSDA) 
//	{
//		this.KSDA = KSDA;
//	}
	public boolean JCDA() 
	{
		if(KSDA.length != 1 || KSDA ==null) 
		{
			return false;
		}else 
		{
			return this.BZDA.equals(KSDA[0]);
		}
	}
	
	public void KSDASC() 
	{
		System.out.println("考生答案是:"+KSDA[0]);
	} 
}
