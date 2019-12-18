package jjj;

 class student {
	static String schoolName;
 }
public class E_12 {
	public static void main(String[] args) {
		student s1=new student();
		student s2=new student();
		student.schoolName="江汉艺术职业学院";
		System.out.println("我是"+s1.schoolName+"的学生");
		System.out.println("我是"+s2.schoolName+"的学生");
	}
}
 


