package sort;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 张大爷
 * @time 2018年1月23日 上午10:52:10
 * @mail 767580776@qq.com
 * @description 排序
 */
public class MySort {

	// 开始运行
	public static void start() {
		System.out.println("请输入你要的排序的数组，以输入任意字母结束：");
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
		System.out.println("请选择你要的排序方式：");
		System.out.println("冒泡排序：0");
		System.out.println("快速排序：1");
		Scanner sortScanner = new Scanner(System.in);
		if (sortScanner.hasNextInt()) {
			int i = sortScanner.nextInt();
			runSort(i, intArray);
		} else {
			System.out.println("你输入了个寂寞，请重新输入");
		}

		scanner.close();
		sortScanner.close();

	}

	// 数组的两个值交换位置
	public static void swap(int[] intArray, int i, int j) {
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

	// 输出数组
	public static void printArray(int intArray[]) {
		for (int k = 0; k < intArray.length; k++) {
			System.out.print(intArray[k] + " ");
		}
		System.out.println("");
	}

	// 选择排序的方式
	public static void runSort(int i, int intArray[]) {
		switch (i) {
		case 0:
			System.out.println("你选择的是冒泡排序！");
			bubbleSort(intArray);
			break;
		case 1:
			System.out.println("你选择的是快速排序！");
			int start = 0;
			int end = intArray.length - 1;
			quickSort(intArray, start, end);
			break;

		default:
			System.out.println("你输入了一个兰州烧饼，你自己吃吧!!");
			break;
		}
	}

	/*
	 * 冒泡排序 
	 * 外层循环为需要排序数，内层循环为对比的次数，此循环是变化的
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
	 * 快速排序
	 * 一次循环：从后往前比较，用基准值和最后一个值比较，如果比基准值小的交换位置，如果没有继续比较下一个，直到找到第一个比基准值小的值才交换。找到这个值之后，
	 * 又从前往后开始比较，如果有比基准值大的，交换位置，如果没有继续比较下一个，直到找到第一个比基准值大的值才交换
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
	 * 选择排序
	 * 在要排序的一组数中，选出最小的一个数与第一个位置的数交换；然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止
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
