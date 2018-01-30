package common;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 张大爷
 * @time 2018年1月26日 下午11:40:54
 * @mail 767580776@qq.com
 * @description Just a joke
 */

public class Util {

	/**
	 * 接收控制台循环输入数字，返回数组
	 * 
	 */
	public static int[] getIntArray() {
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> elements = new LinkedList<Integer>();
		while (scanner.hasNextInt()) {
			int element = scanner.nextInt();
			elements.add(element);
		}
		Integer[] IntegerArray = (Integer[]) elements.toArray(new Integer[0]);
		int intArray[] = new int[IntegerArray.length];
		for (int i = 0; i < IntegerArray.length; i++) {
			intArray[i] = IntegerArray[i].intValue();
		}
		scanner.close();
		return intArray;
	}

	/**
	 * 数组的两个值交换位置
	 * 
	 */
	public static void swap(int[] intArray, int i, int j) {
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}
	
	/**
	 * 接收控制台输入单个数字
	 * 
	 */
	public static int getInt() {
		System.out.println("请输入一个测试整数：");
		Scanner scanner = new Scanner(System.in);
		int n=0;
		if(scanner.hasNextInt()) {
			n=scanner.nextInt();
		}
		scanner.close();
		return n;	
	}
	/**
	 * 输出n*n二维数组
	 * 
	 */
	public static void print2DArrary(int intArray[][]) {
		for(int i=0;i<intArray.length;i++) {
			for(int j= 0;j<intArray.length;j++) {
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println("");	
		}	
	}
	
	/**
	 * 输出一维数组
	 * 
	 */
	public static void print1DArrary(int intArray[]) {
		for (int k = 0; k < intArray.length; k++) {
			System.out.print(intArray[k] + " ");
		}
		System.out.println("");
	}
	
}
