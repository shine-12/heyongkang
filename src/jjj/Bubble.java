package jjj;

public class Bubble {

	public static void main(String[] args) {
		int[] array= {8,5,4,6,1};
		System.out.println("这个数组的长度是"+array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+"");
		}
		System.out.println();
		for (int i=1;i <array.length;i++) {
			for (int j=0;j<array.length -i; j++) {
				if (array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j + 1];
					array[j+1]=temp;
				}
			}
		}
	}

}
