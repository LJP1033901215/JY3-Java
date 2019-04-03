import java.util.*;
public class zuoye40202//运用分制流程控制-IF-else
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您的成绩:");
		int num1 = input.nextInt();
		if(num1>100 || num1<0){
			System.out.println("super man");
		}//else if(num1<0){
			//System.out.println("super man");}
		else if(num1>=90 && num1<=100){
			System.out.println("优秀");
		}else if(num1>=80 && num1<90){
			System.out.println("良好");
		}else{
			System.out.println("不合格");
		}
		
	
	
	
	}



}