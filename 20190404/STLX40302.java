import java.util.*;
public class STLX40302
{
	public static void main(String[] args)
	{
		
		Scanner console = new Scanner(System.in);
		//������������Ķ���
		System.out.print("�������������:");
		//���Ǽ������������
		int C1 = console.nextInt();
		//���Ǵӿ���̨��ȡ��������
		double C2 = 7.7/100;
		if(C1>2){
			C2 *= 0.5;
		}else if(C1>=2 && C1<3){
			C2 *= 0.7;
		}else if(C1>=3 && C1<5){
			C2 = C2;
		}else{
			C2 *= 1.1;
		}
		System.out.print("����������Ϊ:"+C2);
	}



}