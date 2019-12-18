package jjj;

public class Oper {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i=1;
		int f=1;
		System.out.println("后加"+(i++));
		System.out.println("后加"+(++f));
		System.out.println("不管是先加还是后加变量加了1,i="+i);
		System.out.println("不管是先加还是后加变量加了1,i="+i);
		//赋值运算符
		int a=2;
		a+=3;//等价于a=a+3
		System.out.println(a);
		String s1="hello";
		String s2="hello";
		E01 e1=new E01();
		E01 e2=new E01();
		System.out.println(s1==s2);
		System.out.println(e1==e2);
		
		int x=0,y=0,z=0;
		boolean b1,b2;
		b1=x>0&y++>1;
		
		System.out.println("b1="+b1);
		System.out.println("z="+z);
		
		int store=5;
		System.out.println(store<=0?"库存没了！":(store>100?"库存太多了":"库存量为"+store));

	}

}
