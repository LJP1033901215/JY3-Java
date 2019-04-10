package 选择题案例;



public class Test {
	public static void main(String[] args) {
		String[] name = new String[] {"A.数学","B.语文","C.英语","D.java"};
		String[] DA = new String[] {"D.java"};
		SingleQues name2 = new SingleQues(1, "下面那个是今天考试的内容？", name, "D.java", DA);
		name2.TM();
		name2.KSDASC();
		name2.JCDA();
		boolean PD = name2.JCDA();
		System.out.println(PD == true ? "回答正确":"回答错误");
	}

}
