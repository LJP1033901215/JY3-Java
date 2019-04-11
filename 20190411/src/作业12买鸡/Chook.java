package 作业12买鸡;

//12.一百元钱买百鸡,公鸡每只五元，母鸡每只三元； 小鸡因小价钱低，
//   三只小鸡是一元,公鸡母鸡和小鸡，请你算出有几种购买方法?
public class Chook {
	
		public static void count(int money)
		{
			int C = 0;//这是给计数添加变量
			for(int i=0;i<=money/5;i++)//这是循环公鸡的数量
			{
				for(int j=0;j<=money/3; j++)//这是循环母鸡的数量
				{
					for(int k = 0; k <=money; k++) //这是循环小鸡的数量
					{
						
						if (5*i+3*j+1*k==money && i+j+3*k==100)//这是判断三种鸡加起来的钱数 
						{
						C++;
						System.out.println("公鸡:"+i+"母鸡:"+j+"小鸡:"+3*k);
						}
					}
				}
				
			}
			System.out.println("一共有："+C+"种方法");
		}
	}
	
	
