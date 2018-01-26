package basicjavatest;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import common.InputUtil;

/**
 * @author 张大爷
 * @time 2018年1月26日 下午4:35:41
 * @mail 767580776@qq.com
 * @description
 */
public class ACMOnline {

	/**
	 * 
	 * ASCII码排序
	 * 
	 * 输入三个字符（可以重复）后，按各字符的ASCII码从小到大的顺序输出这三个字符。
	 * 第一行输入一个数N,表示有N组测试数据。后面的N行输入多组数据，每组输入数据都是占一行，有三个字符组成，之间无空格。
	 * 对于每组输入数据，输出一行，字符中间用一个空格分开。
	 * 
	 */
	public static void ASCIISort() {
		Scanner scanner = new Scanner(System.in);
		String string[] = null;
		int size = 0;

		System.out.print("请输入数字，代表多少组测试字符串：");
		if (scanner.hasNextInt()) {
			size = scanner.nextInt();
			string = new String[size];
		} else {
			System.out.print("请输入数字！！");
		}
		Scanner scannerString = new Scanner(System.in);
		System.out.println("请开始输入字符串，每组字符串以enter键结束：");
		for (int i = 0; i < size; i++) { // 获取输入的字符串，存入字符串数组
			if (scannerString.hasNextLine()) {
				string[i] = scannerString.nextLine();
			}
		}

		for (int i = 0; i < string.length; i++) {
			char ch[] = string[i].toCharArray(); // 字符串转化成字符数组
			for (int j = 0; j < ch.length - 1; j++) { // 冒泡排序
				for (int k = 0; k < ch.length - 1 - j; k++) {
					if (ch[k] > ch[k + 1]) {
						char temp = ch[k];
						ch[k] = ch[k + 1];
						ch[k + 1] = temp;
					}
				}
			}
			for (int l = 0; l < ch.length; l++) {
				System.out.print(ch[l] + " ");
			}
			System.out.println("");

		}
		scanner.close();
		scannerString.close();

	}

	/**
	 * 
	 * 奇偶数分离
	 * 
	 * 有一个整数n(2<= num <=10000),你要做的是：先把1到n中的所有奇数从小到大输出，再把所有的偶数从小到大输出。
	 * 第一行输出所有的奇数,第二行输出所有的偶数
	 * 
	 */
	public static void SeparateOddAndEven() {
		System.out.print("请输入一个整数n(2<= num <=10000)：");
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		if (scanner.hasNextInt()) {
			num = scanner.nextInt();
		} else {
			System.out.print("瞎J8输入，会搞坏我的程序的，严肃点~~");
		}
		if (num >= 2 && num <= 10000) {
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println("");
			for (int i = 1; i <= num; i++) {
				if (i % 2 != 0) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.print("瞎J8输入，会搞坏我的程序的，严肃点~~");
		}

		scanner.close();
	}

	/**
	 * Fibonacci数
	 * 
	 * 无穷数列1，1，2，3，5，8，13，21，34，55...称为Fibonacci数列，它可以递归地定义为 F(n)=1
	 * ...........(n=1或n=2)， F(n)=F(n-1)+F(n-2).....(n>2) 现要你来求第n个斐波那契数。（第1个、第二个都为1)
	 */
	public static int Fibonacci(int n) {
		int FibonacciNum = 0;
		if (n == 1 || n == 2) {
			FibonacciNum = 1;
		} else {
			FibonacciNum = Fibonacci(n - 1) + Fibonacci(n - 2);
		}
		return FibonacciNum;
	}

	/**
	 * 素数求和问题
	 * 
	 * 现在给你N个数（0<N<1000），现在要求你写出一个程序，找出这N个数中的所有素数，并求和。 质数（prime
	 * number）又称素数，有无限个。质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数。
	 */
	public static void primeNumber() {
		System.out.print("请输入（0<N<1000）的数，以输入任意字符结束：");
		int intArray[] = InputUtil.getIntArray();
		int intArraySum = 0;
		for (int i = 0; i < intArray.length; i++) {// 求出数组中所有的数字的和
			intArraySum += intArray[i];
		}
		int notPrime = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == 2) {// 如果数字本身就是2，不适合循环条件j = intArray[i] - 1; j > 1
				notPrime += intArray[i];
			}
			for (int j = intArray[i] - 1; j > 1; j--) {// 不能对1和本身求余数
				if (intArray[i] % j == 0) {
					notPrime += intArray[i];// 求出所有的非素数的和
					break;// 只要有一个j能除尽，就证明intArray[i]不是素数，跳出该循环
				}
			}
		}
		System.out.println("所有数的和为：" + intArraySum);
		System.out.println("所有非素数的和为：" + notPrime);
		System.out.println("所有素数的和为：" + (intArraySum - notPrime));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(Fibonacci(10));
		//primeNumber();

	}

}
