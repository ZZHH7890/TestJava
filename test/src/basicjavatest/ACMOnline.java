package basicjavatest;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import common.Util;

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
	 * 在n*n方陈里填入1,2,...,n*n,要求填成蛇形。 下下下下->左左左->上上上->右右
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
		int count = 1;
		while (count < n * n) {
			while (row < n && intArray[row][col] == 0) {
				intArray[row][col] = count;
				row++;
				count++;
			}
			row--;
			while (col > 0 && intArray[row][col - 1] == 0) {
				intArray[row][col - 1] = count;
				col--;
				count++;
			}
			row--;
			while (row >= 0 && intArray[row][col] == 0) {
				intArray[row][col] = count;
				row--;
				count++;
			}
			row++;
			while (col < n - 1 && intArray[row][col + 1] == 0) {
				intArray[row][col + 1] = count;
				col++;
				count++;
			}
			row++;
		}

		Util.print2DArrary(intArray);

	}

	/**
	 * 韩信点兵
	 * 
	 * 已知总人数不小于10，不超过100 。 输入3个非负整数a,b,c ，表示每种队形排尾的人数（a<3,b<5,c<7）。例如,输入：2 4 5
	 * 
	 * 输出总人数的最小值（或报告无解，即输出No answer）。实例，输出：89
	 **/
	public static void pointSoldier() {
		System.out.println("请输入3个测试整数，以任意字符结束：");
		int intArray[] = Util.getIntArray();
		int sum = 0;
		int a = intArray[0];
		int b = intArray[1];
		int c = intArray[2];
		for (int k = 0; 7 * k <= 100; k++) {
			for (int j = 0; 5 * j <= 100; j++) {
				if ((5 * j + b) == (7 * k + c)) {
					for (int i = 0; 3 * i <= 100; i++) {
						if ((3 * i + a) == (5 * j + b)) {
							sum = 3 * i + a;
						}
					}
				}
			}
		}
		if (sum != 0) {
			System.out.println(sum);
		} else {
			System.out.println("No answer");
		}
	}

	/**
	 * 水仙花数
	 * 
	 * 水仙花数定义各个位数立方和等于它本身的三位数
	 * 
	 * 输出总人数的最小值（或报告无解，即输出No answer）。实例，输出：89
	 **/
	public static void NarcissisticNumber() {
		System.out.println("请输入N个测试数据，以任意字符结束：");
		int intArray[] = Util.getIntArray();
		int unitsDigit = 0;
		int tensDigit = 0;
		int hundredsDigit = 0;
		for (int i = 0; i < intArray.length; i++) {
			hundredsDigit = intArray[i] / 100;
			tensDigit = intArray[i] % 100 / 10;
			unitsDigit = intArray[i] % 100 % 10;
			if (intArray[i] == hundredsDigit * hundredsDigit * hundredsDigit + tensDigit * tensDigit * tensDigit
					+ unitsDigit * unitsDigit * unitsDigit) {
				System.out.println(intArray[i] + "YES");
			} else {
				System.out.println(intArray[i] + "NO");
			}
		}
	}

	/**
	 * 最大公约数和最小公倍数
	 * 
	 * 给出两个正整数，求出它们的最大公约数和最小公倍数。
	 * 
	 * 最小公倍数=两数的乘积/最大公约（因）数
	 * 
	 **/

	public static void greatestCommonDivisor() {
		System.out.println("请输入两个正整数，以任意字母结束！！");
		int intArray[] = Util.getIntArray();
		int min = 0;
		int max = 0;
		if (intArray[0] > intArray[1]) {
			max = intArray[0];
			min = intArray[1];
		} else {
			max = intArray[1];
			min = intArray[0];
		}
		int i = 0;
		for (i = min; i > 1; i--) {// 取小的数进行从大到小求余，如果有则输出，然后退出循环
			if (min % i == 0 && max % i == 0) {
				System.out.println("最大公约数为：" + i);
				break;
			}
		}
		if (i != 0) {
			System.out.println("最小公倍数为：" + intArray[0] * intArray[1] / i);
		}
	}

	/**
	 * 阶乘
	 * 
	 * 一个正整数的阶乘（factorial）是所有小于及等于该数的正整数的积，并且0的阶乘为1。自然数n的阶乘写作n!
	 **/
	public static int factorial(int n) {
		int factorial = 1;
		if (n < 19) {
			for (int i = 1; i <= n; i++) {
				factorial *= i;
			}
			System.out.println(n + "! = " + factorial);
		} else {
			System.out.println("n太大了，这个程序只支持int类型的最大值");
		}
		return factorial;
		/*
		 * DecimalFormat df = new DecimalFormat();// 16位整数位，两小数位 String temp =
		 * df.format(factorial); System.out.println(n + "! = " +temp);
		 */
	}

	/**
	 * 分解质因数
	 * 
	 * 分解质因数只针对合数。（分解质因数也称分解素因数）求一个数分解质因数，要从最小的质数除起，一直除到结果为质数为止。分解质因数的算式叫短除法
	 * 
	 **/
	public static void factoring(int n) {
		int temp = n;
		int flag = 0;// 标志位，用来判断输入的数是否为合数
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i <= temp; i++) { // 注意最后求余本身(=temp)
			if (temp % i == 0) {
				System.out.println(temp + "," + i);
				list.add(i);
				temp = temp / i;
				flag++;// 标志位
				i--;// 如果有则下一个数继续对当前i求余
			}
		}
		if (flag == 0) {
			System.out.print("你输入的不是合数！！");
		} else {
			System.out.print(n + "的分解质因数为：");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
		}
	}

	/**
	 * 将一个四位数的所以数字从大到小排序，得到一个新的四位数
	 * 
	 **/
	public static int sort4DigitNumberFromBigToSmall(int n) {
		int thousandsDigit = n / 1000;
		int hundredsDigit = n % 1000 / 100;
		int tensDigit = n % 1000 % 100 / 10;
		int unitsDigit = n % 1000 % 100 % 10;
		int intArray[] = {thousandsDigit, hundredsDigit, tensDigit, unitsDigit };
		Util.downSort(intArray);
		int a = 1000*intArray[0]+100*intArray[1]+10*intArray[2]+intArray[3];
		return a;
	}
	
	/**
	 * 将一个四位数的所以数字从小到大排序，得到一个新的四位数
	 * 
	 **/
	public static int sort4DigitNumberFromSmallToBig(int n) {
		int thousandsDigit = n / 1000;
		int hundredsDigit = n % 1000 / 100;
		int tensDigit = n % 1000 % 100 / 10;
		int unitsDigit = n % 1000 % 100 % 10;
		int intArray[] = {thousandsDigit, hundredsDigit, tensDigit, unitsDigit };
		Util.upSort(intArray);
		int a = 1000*intArray[0]+100*intArray[1]+10*intArray[2]+intArray[3];
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort4DigitNumberFromBigToSmall(5678);
		sort4DigitNumberFromSmallToBig(4321);

	}

}
