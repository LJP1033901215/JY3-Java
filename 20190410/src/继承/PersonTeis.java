package 继承;

public class PersonTeis {
	public static void main(String[] args) {
		//实例化
		Child child = new Child();
		child.sys();//子系中的方法
		child.num();//父系中的方法依然可以使用子系引用
		Boy boy = new Boy();
		boy.num();//继承Chlid；
	}
}

