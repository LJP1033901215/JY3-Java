package Բ;

public class Test {
	public static void main(String[] args) {
//	Yuan yuan = new Yuan();
	Point yuanxin =new Point(0, 0);//Բ��
	Yuan yuan = new Yuan(yuanxin,2);//Բ
	Point dian =new Point(1, 1);//�Ƚϵĵ�
	System.out.println(yuan.contains(dian) == true ? "��Բ��":"��Բ��");
	}
	
}
