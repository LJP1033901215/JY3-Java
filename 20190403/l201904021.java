public class l201904021
{
	public static void main(String[] args){
	int a = 1;
	a = ++a;
	a = a++;//2
	a = a++ + ++a;//6
	System.out.println(a-- + ++a + a++ +a);//25
	System.out.println(a);//7
	int x = 3;
	int y = x++ + ++x + x *10;
	System.out.println(x);
	System.out.println(y);
	}
}