package 作业7三角形空心正方形;

//生成带星的空心正方形；

public class Square {
public static void main(String[] args) {
	for(int i=1;i<12;i++)
	{
		//System.out.print("*");
		for(int k=1;k<12; k++) 
		{
			if( k == 1 || k == 11 || i==11||i == 1) 
			{
				System.out.print("*");
			}else {
				System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}
	
	

