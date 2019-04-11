package 作业12买鸡;

import java.util.Scanner;

public class This {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("请输入您预计买鸡的价钱");
		int name = scanner.nextInt();
		Chook.count(name);
		scanner.close();
	}
}
