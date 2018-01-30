package common;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author �Ŵ�ү
 * @time 2018��1��26�� ����11:40:54
 * @mail 767580776@qq.com
 * @description Just a joke
 */

public class Util {

	/**
	 * ���տ���̨ѭ���������֣���������
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
	 * ���������ֵ����λ��
	 * 
	 */
	public static void swap(int[] intArray, int i, int j) {
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}
	
	/**
	 * ���տ���̨���뵥������
	 * 
	 */
	public static int getInt() {
		System.out.println("������һ������������");
		Scanner scanner = new Scanner(System.in);
		int n=0;
		if(scanner.hasNextInt()) {
			n=scanner.nextInt();
		}
		scanner.close();
		return n;	
	}
	/**
	 * ���n*n��ά����
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
	 * ���һά����
	 * 
	 */
	public static void print1DArrary(int intArray[]) {
		for (int k = 0; k < intArray.length; k++) {
			System.out.print(intArray[k] + " ");
		}
		System.out.println("");
	}
	
}
