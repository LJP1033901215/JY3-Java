package 学生管理系统2;

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
	int ID;//ID号
	String StuNanme;//姓名
	char StuGender;//性别
	int StuAge;//年龄
	String StuGrade;//级别。年级
	String StuSite;//地址
	String Stuphone;//电话
	String StuEmail;//电子邮件
}
