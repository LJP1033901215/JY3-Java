package 结婚;
/*定义属性：C1编号、C2名字、C3性别、C4年龄、
*         C5婚否、C6身份证号、C7地址、C8电话、C9伴侣*/
public class ren {
	public static void main(String[] agrs)
	{
		
		Person boy = new Person("56431186", "张三", '男', 22, false, "15351312", "石家庄", "123646548",null);
		Person girl = new Person("56431186", "芙蓉", '女', 20, false, "15351332", "石家庄", "123623348",null);
//		boy.C9 = girl;
//		girl.C9 = boy;
		boolean J1 = boy.jiehun(girl);
		System.out.print(J1);
		System.out.print(J1 == true ? "结婚成功":"因不符合规定，无法结婚");
	}

}
