package ѧ������ϵͳ2;

public class Student {
	public Student(int ID,String StuNanme,char StuGender,int StuAge,String StuGrade,String StuSite,String Stuphone,String StuEmail) {
		this.ID=ID;
		this.StuAge=StuAge;
		this.StuEmail=StuEmail;
		this.StuGender=StuGender;
		this.StuNanme = StuNanme;
		this.Stuphone = Stuphone;
		this.StuSite=StuSite;
		this.StuGrade=StuGrade;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", StuNanme=" + StuNanme + ", StuGender=" + StuGender + ", StuAge=" + StuAge
				+ ", StuGrade=" + StuGrade + ", StuSite=" + StuSite + ", Stuphone=" + Stuphone + ", StuEmail="
				+ StuEmail + "]";
	}
	int ID;//ID��
	String StuNanme;//����
	char StuGender;//�Ա�
	int StuAge;//����
	String StuGrade;//�����꼶
	String StuSite;//��ַ
	String Stuphone;//�绰
	String StuEmail;//�����ʼ�
}
