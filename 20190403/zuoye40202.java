import java.util.*;
public class zuoye40202//���÷������̿���-IF-else
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("���������ĳɼ�:");
		int num1 = input.nextInt();
		if(num1>100 || num1<0){
			System.out.println("super man");
		}//else if(num1<0){
			//System.out.println("super man");}
		else if(num1>=90 && num1<=100){
			System.out.println("����");
		}else if(num1>=80 && num1<90){
			System.out.println("����");
		}else{
			System.out.println("���ϸ�");
		}
		
	
	
	
	}



}