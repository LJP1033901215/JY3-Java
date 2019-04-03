import java.util.Random;
public class lianxi
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int rInt = r.nextInt(58);
		System.out.println(rInt);
		char c = (char)('A' + rInt);
		System.out.println(c);
	}
}