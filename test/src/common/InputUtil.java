package common;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
*@author �Ŵ�ү
*@time 2018��1��26�� ����11:40:54
*@mail 767580776@qq.com
*@description
*Just a joke
*/

public class InputUtil {
	
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

}
