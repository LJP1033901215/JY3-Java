package ��ҵ5������;
/**5�����������࣬�������£� [������]

5.1����һ������Person��

	5.1.1����һ������sayHello()��������Է������ʺ��hello,my name is XXX��
	5.1.2���������ԣ����֡���ߡ�����

5.2����һ��PersonCreate�ࣺ

	5.2.1�����������󣬷ֱ���zhangsan��33�꣬1.73��lishi��44��1.74
	5.2.2�ֱ���ö����sayHello()������
 */
public class PersonCreate {
	public static void main(String[] args) {
	Person zhangsan =new Person("zhangsan",33, 1.73);
	Person lisi = new Person("lisi",44,1.74);
	zhangsan.sayHello();
	lisi.sayHello();
	}
	
}
