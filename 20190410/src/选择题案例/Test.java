package ѡ���ⰸ��;



public class Test {
	public static void main(String[] args) {
		String[] name = new String[] {"A.��ѧ","B.����","C.Ӣ��","D.java"};
		String[] DA = new String[] {"D.java"};
		SingleQues name2 = new SingleQues(1, "�����Ǹ��ǽ��쿼�Ե����ݣ�", name, "D.java", DA);
		name2.TM();
		name2.KSDASC();
		name2.JCDA();
		boolean PD = name2.JCDA();
		System.out.println(PD == true ? "�ش���ȷ":"�ش����");
	}

}
