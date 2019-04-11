package 作业9小球自由落体;

public class Ball {

	//9.一个小球从100高度自由落下,每次落地后反跳回原高度的一半,
	//	再落下，求它在第十次落地时,共经过多少米?第10次反弹多高?
	public static void main(String[] args) {
		double sum = 100.0;
		double num = 0;
		for (int i = 0; i <=10; i++) 
		{
			sum = sum /2; 
			num+= sum;
		}
		System.out.println("第十次的高度是:"+sum);
		System.out.println("第十次落地时经过了:"+num);
		
	}
}
