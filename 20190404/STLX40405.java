import java.util.*;
public class STLX40405
{
	public static void main(String[] agrs)
	{
	char[] arr = {'��','��'};
	char[] temp = Arrays.copyOf(arr,4);
	System.out.println(temp);
	//char[] newArr = temp;
	temp[2] = '��';
	temp[3] = '��';
	System.out.println(temp);
	}	

}