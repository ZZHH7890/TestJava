package common;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
*@author 张大爷
*@time 2018年1月26日 下午11:40:54
*@mail 767580776@qq.com
*@description
*Just a joke
*/

public class InputUtil {
	
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

}
