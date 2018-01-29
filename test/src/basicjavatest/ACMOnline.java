package basicjavatest;

import java.util.Scanner;

import common.Util;
import sort.MySort;

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
	 * number）又称素数，有无限个。质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数。 注意2其实也是素数，2是偶数
	 */
	public static void sumOfPrimeNumber() {
		System.out.print("请输入（0<N<1000）的数，以输入任意字符结束：");
		int intArray[] = Util.getIntArray();
		int intArraySum = 0;
		for (int i = 0; i < intArray.length; i++) {// 求出数组中所有的数字的和
			intArraySum += intArray[i];
		}
		int notPrime = 0;
		for (int i = 0; i < intArray.length; i++) {
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

	/**
	 * 素数距离问题
	 * 
	 * 现在给出你一些数，要求你写出一个程序，输出这些整数相邻最近的素数， 并输出其相距长度,如果左右有等距离长度素数，则输出左侧的值及相应距离。
	 * 如果输入的整数本身就是素数，则输出该素数本身，距离输出0
	 *
	 **/
	public static void distanceOfprimeNumber() {
		System.out.print("请输入（0<N<100000）的数，以输入任意字符结束：");
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		if (scanner.hasNextInt()) {
			num = scanner.nextInt();
		}
		scanner.close();
		int Rnum = 0;
		int RDistance = 0;
		int Lnum = 0;
		int LDistance = 0;
		if (num == 1) {
			System.out.println("向右最近的素数是： " + (num + 1) + " 距离为：" + 1);
		} else {
			int flag = 0;
			for (int i = 0; i < 10; i++) {
				if (flag != 0) {// flag标志位重置为0，用于判断是否为素数
					flag = 0;
				}
				for (int j = num + i - 1; j > 1; j--) {// 判断num是否为素数，不是，则标志位置1，退出内循环
					if ((num + i) % j == 0) {
						flag = 1;
						break;
					}
				}
				if (flag == 0) {// 判断标志位，是0则输出素数，并且退出循环
					Rnum = num + i;
					RDistance = i;
					System.out.println("向右最近的素数是： " + Rnum + " 距离为：" + RDistance);
					break;
				}
			}

			for (int i = 0; i < 10; i++) {
				if (flag != 0) {// flag标志位重置为0，用于判断是否为素数
					flag = 0;
				}
				for (int j = num - i - 1; j > 1; j--) {// 判断num是否为素数，不是，则标志位置1，退出内循环
					if ((num - i) % j == 0) {
						flag = 1;
						break;
					}
				}
				if (flag == 0) {// 判断标志位，是0则输出素数，并且退出循环
					Lnum = num - i;
					LDistance = i;
					System.out.println("向左最近的素数是： " + Lnum + " 距离为：" + LDistance);
					break;
				}
			}
		}
		if (RDistance == LDistance) {
			System.out.println("由于左右两边素数距离相等，所以输出左边素数 ");
			System.out.println("向左最近的素数是： " + Lnum + " 距离为：" + LDistance);
		}
	}

	/**
	 * A Famous Music Composer
	 * 
	 * Musical keys
	 * 
	 * A A#=Bb B C C#=Db D D#=Eb E F F#=Gb G G#=Ab
	 * 
	 * Alternate names
	 *
	 * Ab minor A# major A# minor C# major Db minor
	 * 
	 * D# major D# minor Gb major Gb minor G# major
	 *
	 * Input:
	 *
	 * Ab minor
	 *
	 * D# major
	 *
	 * G minor
	 *
	 * Output
	 *
	 * Case 1: G# minor
	 *
	 * Case 2: Eb major
	 *
	 * Case 3: UNIQUE
	 *
	 *
	 **/
	public static void FamousMusicComposer() {
		String alternateNames[] = { "Ab minor", "A# major", "A# minor", "C# major", "Db minor", "D# major", "D# minor",
				"Gb major", "Gb minor", "G# major" };
		System.out.println("Please input the \"note tonality\": ");
		Scanner scanner = new Scanner(System.in);
		String noteTonality = null;
		String Case = null;
		if (scanner.hasNextLine()) {
			noteTonality = scanner.nextLine();
		}
		if (noteTonality.length() < 8) {
			System.out.println("Case : UNIQUE");
		} else {
			for (String i : alternateNames) {
				String subString = null;
				if (noteTonality.equalsIgnoreCase(i)) {
					subString = noteTonality.substring(0, 2);
					System.out.println(subString);
					switch (subString) {
					case "A#":
						Case = noteTonality.replace("A#", "Bb");
						break;
					case "Bb":
						Case = noteTonality.replace("Bb", "A#");
						break;
					case "C#":
						Case = noteTonality.replace("C#", "Db");
						break;
					case "Db":
						Case = noteTonality.replace("Db", "C#");
						break;
					case "D#":
						Case = noteTonality.replace("D#", "Eb");
						break;
					case "Eb":
						Case = noteTonality.replace("Eb", "D#");
						break;
					case "F#":
						Case = noteTonality.replace("F#", "Gb");
						break;
					case "Gb":
						Case = noteTonality.replace("Gb", "F#");
						break;
					case "G#":
						Case = noteTonality.replace("G#", "Ab");
						break;
					case "Ab":
						Case = noteTonality.replace("Ab", "G#");
						break;
					default:
						break;
					}
					System.out.println("Case : " + Case);
					break;
				} else {
					System.out.println("Case : UNIQUE");
					break;
				}
			}
		}
		scanner.close();
	}

	/**
	 * 求最值
	 * 
	 * 输入只有一组测试数据，在整数中取最小数和最大数的程序 用冒泡排序法排序后，输出第一个和最后一个数
	 **/
	public static void valueOfMinMax() {
		System.out.print("请输入（0<N<10000）的整数，以输入任意字符结束：");
		int intArray[] = Util.getIntArray();
		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = 0; j < intArray.length - 1 - i; j++) {
				if (intArray[j] > intArray[j + 1]) {
					Util.swap(intArray, j + 1, j);
				}
			}
		}
		System.out.println("最小值为：" + intArray[0]);
		System.out.println("最大值为：" + intArray[intArray.length - 1]);
	}

	/**
	 * 蛇形填数
	 * 
	 * 在n*n方陈里填入1,2,...,n*n,要求填成蛇形。例如n=4时方陈为： 10 11 12 1 9 16 13 2 8 15 14 3 7 6 5 4
	 * 
	 **/
	public static void snakeFill() {
		int n = Util.getInt();
		int intArray[][] = new int[n][n];
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length; j++) {
				intArray[i][j] = 0;
			}
		}
		int row = 0;
		int col = n - 1;
		int count = 0;
		while (intArray[row][col] == 0 && row < n) {
			intArray[++row][col] = count++;
			System.out.println(count);
		}
		Util.print2DArrary(intArray);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(Fibonacci(10));
		// sumOfPrimeNumber();
		// distanceOfprimeNumber();
		// FamousMusicComposer();
		// valueOfMinMax();
		snakeFill();

	}

}
