package sort;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author �Ŵ�ү
 * @time 2018��1��23�� ����10:52:10
 * @mail 767580776@qq.com
 * @description ����
 */
public class MySort {

	// ��ʼ����
	public static void start() {
		System.out.println("��������Ҫ����������飬������������ĸ������");
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
		System.out.println("��ѡ����Ҫ������ʽ��");
		System.out.println("ð������0");
		System.out.println("��������1");
		Scanner sortScanner = new Scanner(System.in);
		if (sortScanner.hasNextInt()) {
			int i = sortScanner.nextInt();
			runSort(i, intArray);
		} else {
			System.out.println("�������˸���į������������");
		}

		scanner.close();
		sortScanner.close();

	}

	// ���������ֵ����λ��
	public static void swap(int[] intArray, int i, int j) {
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

	// �������
	public static void printArray(int intArray[]) {
		for (int k = 0; k < intArray.length; k++) {
			System.out.print(intArray[k] + " ");
		}
		System.out.println("");
	}

	// ѡ������ķ�ʽ
	public static void runSort(int i, int intArray[]) {
		switch (i) {
		case 0:
			System.out.println("��ѡ�����ð������");
			bubbleSort(intArray);
			break;
		case 1:
			System.out.println("��ѡ����ǿ�������");
			int start = 0;
			int end = intArray.length - 1;
			quickSort(intArray, start, end);
			break;

		default:
			System.out.println("��������һ�������ձ������Լ��԰�!!");
			break;
		}
	}

	/*
	 * ð������ 
	 * ���ѭ��Ϊ��Ҫ���������ڲ�ѭ��Ϊ�ԱȵĴ�������ѭ���Ǳ仯��
	 */
	public static void bubbleSort(int intArray[]) {
		int size = intArray.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (intArray[j] > intArray[j + 1]) {
					swap(intArray, j, j + 1);
				}
				printArray(intArray);
			}

		}
	}

	/*
	 * ��������
	 * һ��ѭ�����Ӻ���ǰ�Ƚϣ��û�׼ֵ�����һ��ֵ�Ƚϣ�����Ȼ�׼ֵС�Ľ���λ�ã����û�м����Ƚ���һ����ֱ���ҵ���һ���Ȼ�׼ֵС��ֵ�Ž������ҵ����ֵ֮��
	 * �ִ�ǰ����ʼ�Ƚϣ�����бȻ�׼ֵ��ģ�����λ�ã����û�м����Ƚ���һ����ֱ���ҵ���һ���Ȼ�׼ֵ���ֵ�Ž���
	 * 
	 */
	public static void quickSort(int intArray[], int start, int end) {
		int low = start;
		int high = end;
		int temp = intArray[low];
		printArray(intArray);
		while (low < high) {
			while (low < high && intArray[high] >= temp) {
				high--;
			}
			if (intArray[high] < temp) {
				swap(intArray, low, high);
			}
			while (low < high && intArray[low] <= temp) {
				low++;
			}
			if (intArray[low] > temp) {
				swap(intArray, low, high);
			}
		}
		if (low > start) {
			quickSort(intArray, start, low - 1);
		}
		if (high < end) {
			quickSort(intArray, high + 1, end);
		}

	}

	/*
	 * ѡ������
	 * ��Ҫ�����һ�����У�ѡ����С��һ�������һ��λ�õ���������Ȼ����ʣ�µ�������������С����ڶ���λ�õ������������ѭ���������ڶ����������һ�����Ƚ�Ϊֹ
	 */
	public static void selectSort(int intArray[]) {
		for(int i =1; i< intArray.length; i++) {
			if(intArray[i-1]>intArray[i]) {
				swap(intArray, 0, i);
			}
		}
	
	}

	public static void main(String[] args) {
		start();
	}

}
