package ѧ������ϵͳ2;

import java.util.Arrays;


//ѧ����Ϣ����
public class Operation {
	//����һ��ѧ������
	static Student[] stu = new Student[0];
	//����һ��ɾ���������
	static Student[] stus = new Student[0];
	//���ѧ��
	
	
	public void Addstudent(Student student) 
	{
		stu = Arrays.copyOf(stu, stu.length+1);
		stu[stu.length-1] = student;
	}
	
	//ɾ��һ��ѧ������Ϣ
	public Student[] Delete(int X) 
	{
		//��ɾ��������鸳ֵ
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
	//�޸�ȫ����Ϣ
	public void Amend(Student student) 
	{
		for (int i = 0; i < stu.length; i++) 
		{
			if(student.ID == stu[i].ID)
			{
				//�ҵ�Ҫ�޸ĵ�ͬѧ��ID
				//Ȼ���ͬѧ��ֵ
				 stu[i] = student;
			}
		}
		
	}
	//����ID�޸Ĳ�����Ϣ
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
//		Student ing =new Student(1, "����", '��', 66, "�߼�", "�й�", "12346678994", "1033901215@qq.com");
//		Student ings =new Student(2, "����", '��', 66, "�߼�", "�й�", "12346678994", "1033901215@qq.com");
//		operation.Addstudent(ing);
//		operation.Addstudent(ings);
//		Student inga =new Student(3, "����", '��', 66, "�߼�", "�й�", "12346678994", "1033901215@qq.com");
//		Student ingd =new Student(4, "����", '��', 66, "�߼�", "�й�", "12346678994", "1033901215@qq.com");
//		operation.Addstudent(inga);
//		operation.Addstudent(ingd);
//		operation.Delete(2);
////		
//		
//	}
}
