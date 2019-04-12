package 学生管理系统2;

import java.util.Arrays;


//学生信息管理
public class Operation {
	//声明一个学生数组
	static Student[] stu = new Student[0];
	//声明一个删除后的数字
	static Student[] stus = new Student[0];
	//添加学生
	
	
	public void Addstudent(Student student) 
	{
		stu = Arrays.copyOf(stu, stu.length+1);
		stu[stu.length-1] = student;
	}
	
	//删除一个学生的信息
	public Student[] Delete(int X) 
	{
		//给删除后的数组赋值
		stus = new Student[stu.length-1];
		int j=0;
		for (int i = 0; i < stu.length; i++) 
		{
			if(X != stu[i].ID)
			{
				stus[j] = stu[i];
				j++;
			}
			
		}
		return stus;
		//System.out.println(Arrays.toString(stus));
	}
	//修改全部信息
	public void Amend(Student student) 
	{
		for (int i = 0; i < stu.length; i++) 
		{
			if(student.ID == stu[i].ID)
			{
				//找到要修改的同学的ID
				//然后给同学赋值
				 stu[i] = student;
			}
		}
		
	}
	//根据ID修改部分信息
	public void amend(Student atudent) 
	{
		for (int i = 0; i < stu.length; i++) 
		{
			if (atudent.ID == stu[i].ID)
			{
				
			}
		}
	}
	public boolean Repetition(int Y)
	{	//boolean H = true;
		for (int i = 0; i < stu.length; i++) 
		{
			if (Y == stu[i].ID) 
			{
				return false;
			}
		}
		return true;
	}
//	public static void main(String[] args) {
//		Operation operation = new Operation();
//		Student ing =new Student(1, "张三", '男', 66, "高级", "中国", "12346678994", "1033901215@qq.com");
//		Student ings =new Student(2, "李四", '男', 66, "高级", "中国", "12346678994", "1033901215@qq.com");
//		operation.Addstudent(ing);
//		operation.Addstudent(ings);
//		Student inga =new Student(3, "张三", '男', 66, "高级", "中国", "12346678994", "1033901215@qq.com");
//		Student ingd =new Student(4, "李四", '男', 66, "高级", "中国", "12346678994", "1033901215@qq.com");
//		operation.Addstudent(inga);
//		operation.Addstudent(ingd);
//		operation.Delete(2);
////		
//		
//	}
}
