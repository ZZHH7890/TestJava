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

		System.out.print("�����������Ϊ��");
		printArray(intArray);
		System.out.println("��ѡ����Ҫ������ʽ��");
		System.out.println("**********��ð������**********��1");
		System.out.println("**********��ð������**********��2");
		System.out.println("**********��������************��3");
		System.out.println("**********ѡ������************��4");
		System.out.println("**********��������************��5");
		System.out.println("***ϣ������(ǿ�����������)*****��6");
		System.out.println("**********�鲢����************��7");
		System.out.println("**********������**************��8");
		Scanner sortScanner = new Scanner(System.in);
		if (sortScanner.hasNextInt()) {
			int i = sortScanner.nextInt();
			runSort(i, intArray);
		} else {
			System.out.println("�������˸���į������������");
		}
		sortScanner.close();
		scanner.close();
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

	// ��ѡ������ķ�ʽ
	public static void runSort(int i, int intArray[]) {
		switch (i) {
		case 1:
			System.out.println("��ѡ�������ð������");
			positiveBubbleSort(intArray);
			break;
		case 2:
			System.out.println("��ѡ����Ƿ�ð������");
			negativeBubbleSort(intArray);
			break;

		case 3:
			System.out.println("��ѡ����ǿ�������");
			int start = 0;
			int end = intArray.length - 1;
			quickSort(intArray, start, end);
			break;

		case 4:
			System.out.println("��ѡ�����ѡ������");
			selectSort(intArray);
			break;

		case 5:
			System.out.println("��ѡ����ǲ�������");
			insertSort(intArray);
			break;

		case 6:
			System.out.println("��ѡ�����ϣ������");
			shellSort(intArray);
			break;

		case 7:
			System.out.println("������˼��û��������ɵ������");
			break;

		case 8:
			System.out.println("������˼������ɵ������Ҳû����");
			break;

		default:
			System.out.println("��������һ�������ձ������Լ��԰�!!");
			break;
		}
	}

	/*
	 * ��ð�����򣬵�һ�����͵ڶ�������Ƚϣ�Ȼ�󽻻�λ�ã��ڶ������͵��������Ƚϣ�Ȼ�󽻻�λ�� ����������Ū�ɵ�һ���ͺ������ԵıȽϣ�����޽��Ϊѡ��������
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
	 * ��ð���������һ�����͵����ڶ�������Ƚϣ�Ȼ�󽻻�λ�ã��ڶ������͵��������Ƚϣ�Ȼ�󽻻�λ��
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
	 * ѡ������
	 * ��Ҫ�����һ�����У�ѡ����С��һ�������һ��λ�õ���������Ȼ����ʣ�µ�������������С����ڶ���λ�õ������������ѭ���������ڶ����������һ�����Ƚ�Ϊֹ
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
	 * �������� ֱ�Ӳ�������Ļ��������ǽ�һ����¼���뵽�Ѿ��źõ�������У��Ӷ��õ�һ���µġ���¼����1�������
	 * ���ڸ�����һ���¼����ʼʱ�ٶ���һ����¼�Գ�һ���������У������¼Ϊ�������С�
	 * ���Ŵӵڶ�����¼��ʼ�����ռ�¼�Ĵ�С���ν���ǰ����ļ�¼���뵽��֮ǰ�����������У�ֱ�����һ����¼�嵽����������Ϊֹ��
	 * 
	 * �走������һ�δ��붼��һ��д�ó�������for��while
	 * 
	 */
	public static void insertSort(int intArray[]) {
		for (int i = 1; i < intArray.length; i++) {// ����ӵڶ���Ԫ�ؿ�ʼѭ��
			int insertTarget = intArray[i]; // �����������
			int j = i - 1;
			while (j >= 0 && intArray[j] > insertTarget) { // �����������ѭ��
				intArray[j + 1] = intArray[j];// �����j��Ԫ�ش���Ҫ�����Ԫ��,�ͽ���j��Ԫ������ƶ�
				j--;
			}
			intArray[j + 1] = insertTarget;// ֱ����j��Ԫ��С��Ҫ�����Ԫ��,��insertNote���뵽��j��Ԫ�ص�ǰ��
			printArray(intArray);
		}
	}

	/*
	 * ϣ������ �ֽ������������Ԫ�طֳɶ�������У�ʹ��ÿ�������е�Ԫ�ظ�����Խ��٣�Ȼ��Ը��������зֱ����ֱ�Ӳ������򣬴������������С��������򡱺�
	 * ����ڶ�����Ԫ�ؽ���һ��ֱ�Ӳ��������ص�1�������Ļ��֣�һ��ѭ���� �ص�2��ÿ�������ж���Ҫ���в�����������ѭ��
	 * 
	 * 
	 */
	public static void shellSort(int intArray[]) {
		for (int increment = intArray.length / 2; increment > 0; increment /= 2) {
			for (int i = increment; i < intArray.length; i++) {
				int j = i;
				while (j - increment >= 0 && intArray[j] < intArray[j - increment]) {// ����Ƥ�����ѭ����ô�ҹ��ɣ����������Լ��ֶ�������
					swap(intArray, j, j - increment);// ˵�ǲ���������ʵ������ѡ�����򣬵�Ȼ�����Ҳ�����������Ĳ�����������Ԫ���ƶ���
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
