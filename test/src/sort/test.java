package sort;

/**
 * @author �Ŵ�ү
 * @time 2018��1��25�� ����9:49:19
 * @mail 767580776@qq.com
 * @description
 */
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 17, 6, 25, 4, 43, 2, 21, 0 };
		// MySort.selectSort(intArray);
		MySort.printArray(intArray);
		// MySort.positiveBubbleSort(intArray);
		// MySort.negativeBubbleSort(intArray);
		// MySort.insertSort(intArray);
		MySort.shellSort(intArray);

	}

}
