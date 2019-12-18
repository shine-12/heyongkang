package jjj;

public class Condlition {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int age = 13;
		if (age < 12)
			System.out.println("此人是儿童");
		
		else if (age<18)
			System.out.println("此人未成年");
		
		int month=5;
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("当前时间为冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("当前时间为春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("当前时间为夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("当前时间为秋季");
			break;
			
		default:
			System.out.println("输入的月份不正确");
			break;
		}
	}

}
