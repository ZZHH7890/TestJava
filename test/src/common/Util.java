package common;

import java.util.ArrayList;
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
	 * ���տ���̨ѭ�������ַ���������list
	 * 
	 */
	public static List<String> getListString(int n) {
		Scanner scanner1 = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			String e = scanner1.nextLine();
			list.add(e);
		}
		scanner1.close();
		return list;
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
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		if (scanner.hasNextInt()) {
			n = scanner.nextInt();
		}
		return n;
	}

	/**
	 * ���n*n��ά����
	 * 
	 */
	public static void print2DArrary(int intArray[][]) {
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length; j++) {
				System.out.print(intArray[i][j] + " ");
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

	/**
	 * ��ð�����򣬵�һ�����͵ڶ�������Ƚϣ�Ȼ�󽻻�λ�ã��ڶ������͵��������Ƚϣ�Ȼ�󽻻�λ�� ������
	 * 
	 */
	public static void upSort(int intArray[]) {
		int size = intArray.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (intArray[j] > intArray[j + 1]) {// С��������
					swap(intArray, j, j + 1);
				}
			}

		}
	}

	/**
	 * ��ð�����򣬵�һ�����͵ڶ�������Ƚϣ�Ȼ�󽻻�λ�ã��ڶ������͵��������Ƚϣ�Ȼ�󽻻�λ�� ������
	 * 
	 */
	public static void downSort(int intArray[]) {
		int size = intArray.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (intArray[j] < intArray[j + 1]) {// ��С����
					swap(intArray, j, j + 1);
				}
			}

		}
	}

	/**
	 * �ж�һ�������Ƿ�����ȵ�����
	 * 
	 */
	public static boolean sameNumberInArray(int intArray[]) {
		boolean flag = false;
		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] == intArray[j]) {
					flag = true;
					break;
				}
			}
		}
		return flag;
	}

	/**
	 * �ж�һ����λ���Ƿ�����ȵ�����
	 * 
	 */
	public static boolean sameNumberInDigit(int n) {
		boolean flag = false;
		int intArray[] = new int[4];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = n % 10;
			n = n / 10;
		}
		flag = sameNumberInArray(intArray);
		return flag;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sameNumberInDigit(1224);

	}

}
