package jjj;
//修饰符+class+类名
import java.io.Serializable;

//修饰符+class+类名+extends(继承)+父类+implements+父接口
public class Lei extends Object implements Serializable{


		// 定义四个内部类
		//class是关键字 class前面可以添加修饰符
		//第一种修饰符是作用范围:public公有的  protected受保护的  private私有的  什么都不写叫默认的
		//第二种修饰符是功能性的:static:静态的;final:最终的(表示该类不能被继承);
		public static final class A extends Object implements Serializable{}
		protected static final class B extends Object implements Serializable{}
		static final class C extends Object implements Serializable{}
		public static final class D extends Object implements Serializable{}
		//定义两个成员变量 修饰符+数据类型+成员变量名
		public static int age;
		public static String name;
		//定义两个成员方法 修饰符+返回值数据类型+成员方法名([参数类型 参数名]){}
		public void setAge(int nianling) {}
		public int getAge() {return 0;}
}
