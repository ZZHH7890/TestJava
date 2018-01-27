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

		System.out.print("你输入的数组为：");
		printArray(intArray);
		System.out.println("请选择你要的排序方式：");
		System.out.println("**********正冒泡排序**********：1");
		System.out.println("**********反冒泡排序**********：2");
		System.out.println("**********快速排序************：3");
		System.out.println("**********选择排序************：4");
		System.out.println("**********插入排序************：5");
		System.out.println("***希尔排序(强化版插入排序)*****：6");
		System.out.println("**********归并排序************：7");
		System.out.println("**********堆排序**************：8");
		Scanner sortScanner = new Scanner(System.in);
		if (sortScanner.hasNextInt()) {
			int i = sortScanner.nextInt();
			runSort(i, intArray);
		} else {
			System.out.println("你输入了个寂寞，请重新输入");
		}
		sortScanner.close();
		scanner.close();
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

	// 请选择排序的方式
	public static void runSort(int i, int intArray[]) {
		switch (i) {
		case 1:
			System.out.println("你选择的是正冒泡排序！");
			positiveBubbleSort(intArray);
			break;
		case 2:
			System.out.println("你选择的是反冒泡排序！");
			negativeBubbleSort(intArray);
			break;

		case 3:
			System.out.println("你选择的是快速排序！");
			int start = 0;
			int end = intArray.length - 1;
			quickSort(intArray, start, end);
			break;

		case 4:
			System.out.println("你选择的是选择排序！");
			selectSort(intArray);
			break;

		case 5:
			System.out.println("你选择的是插入排序！");
			insertSort(intArray);
			break;

		case 6:
			System.out.println("你选择的是希尔排序！");
			shellSort(intArray);
			break;

		case 7:
			System.out.println("不好意思，没有做这种傻逼排序！");
			break;

		case 8:
			System.out.println("不好意思，这种傻吊排序也没做！");
			break;

		default:
			System.out.println("你输入了一个兰州烧饼，你自己吃吧!!");
			break;
		}
	}

	/*
	 * 正冒泡排序，第一个数和第二个数相比较，然后交换位置，第二个数和第三个数比较，然后交换位置 ，经常犯错弄成第一个和后面所以的比较，这就无解成为选择排序了
	 *
	 * 
	 */
	public static void positiveBubbleSort(int intArray[]) {
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
	 * 反冒泡排序，最后一个数和倒数第二个数相比较，然后交换位置，第二个数和第三个数比较，然后交换位置
	 * 
	 */
	public static void negativeBubbleSort(int intArray[]) {
		int size = intArray.length;
		for (int i = 0; i < size - 1; i++) {
			for (int k = size - 1; k > i; k--) {
				if (intArray[k - 1] > intArray[k]) {
					swap(intArray, k, k - 1);
				}
				printArray(intArray);
			}
		}
	}

	/*
	 * 选择排序
	 * 在要排序的一组数中，选出最小的一个数与第一个位置的数交换；然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止
	 */
	public static void selectSort(int intArray[]) {
		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = intArray.length; j > i + 1; j--) {
				if (intArray[i] > intArray[j - 1]) {
					swap(intArray, i, j - 1);
				}
			}
			printArray(intArray);
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
	 * 插入排序 直接插入排序的基本操作是将一个记录插入到已经排好的有序表中，从而得到一个新的、记录数增1的有序表。
	 * 对于给定的一组记录，初始时假定第一个记录自成一个有序序列，其余记录为无序序列。
	 * 接着从第二个记录开始，按照记录的大小依次将当前处理的记录插入到其之前的有序序列中，直到最后一个记录插到有序序列中为止。
	 * 
	 * 妈蛋，看过一次代码都不一定写得出来，又for又while
	 * 
	 */
	public static void insertSort(int intArray[]) {
		for (int i = 1; i < intArray.length; i++) {// 数组从第二个元素开始循环
			int insertTarget = intArray[i]; // 待插入的数据
			int j = i - 1;
			while (j >= 0 && intArray[j] > insertTarget) { // 不满足就跳出循环
				intArray[j + 1] = intArray[j];// 如果第j个元素大于要插入的元素,就将第j个元素向后移动
				j--;
			}
			intArray[j + 1] = insertTarget;// 直到第j个元素小于要插入的元素,将insertNote插入到第j个元素的前面
			printArray(intArray);
		}
	}

	/*
	 * 希尔排序 现将待排序的数组元素分成多个子序列，使得每个子序列的元素个数相对较少，然后对各个子序列分别进行直接插入排序，待整个待排序列“基本有序”后，
	 * 最后在对所有元素进行一次直接插入排序，重点1是增量的划分，一个循环， 重点2是每个子序列都需要进行插入排序，两个循环
	 * 
	 * 
	 */
	public static void shellSort(int intArray[]) {
		for (int increment = intArray.length / 2; increment > 0; increment /= 2) {
			for (int i = increment; i < intArray.length; i++) {
				int j = i;
				while (j - increment >= 0 && intArray[j] < intArray[j - increment]) {// 马奶皮的这个循环怎么找规律！！！很难自己手动做出来
					swap(intArray, j, j - increment);// 说是插入排序，其实更像是选择排序，当然这里的也可以用真正的插入排序（数组元素移动）
					j -= increment;
				}
			}
			printArray(intArray);
		}
	}

	public static void main(String[] args) {
		start();
	}

}
