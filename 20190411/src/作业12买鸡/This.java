package ��ҵ12��;

import java.util.Scanner;

public class This {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("��������Ԥ���򼦵ļ�Ǯ");
		int name = scanner.nextInt();
		Chook.count(name);
		scanner.close();
	}
}
