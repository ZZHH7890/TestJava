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
	 * 兄弟郊游问题
	 *
	 * 兄弟俩骑车郊游，弟弟先出发，每分钟X米，M分钟后，哥哥带一条狗出发。以每分钟Y米的速度去追弟弟，
	 * 而狗则以每分钟Z米的速度向弟弟跑去，追上弟弟后又立即返回，直到哥哥追上弟弟时，狗跑了多少米？
	 * 
	 * 第一行输入一个整数N，表示测试数据的组数(N<100) 每组测试数据占一行，是四个正整数，分别为M,X,Y,Z（数据保证X<Y<Z)
	 * 
	 * 输出狗跑的路径，结果保留小数点后两位。
	 */
	public static void brotherOuting() {
		
	}
	

	/**
	 *
	 * n-1位数
	 *
	 * 第一行为M，表示测试数据组数。接下来M行，每行包含一个测试数据。
	 * 输出M行，每行为对应行的n-1位数（忽略前缀0）。如果除了最高位外，其余位都为0，则输出0。
	 *
	 */
	public static void printNextNum() {
		System.out.print("请输入数字n，代表多少组测试数据：");
		int n = Util.getInt();
		System.out.print("请输入n组测试数据，每个整数大于等于2位数：");
		List<String> list = Util.getListString(n);
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);
			String subString = string.substring(1, string.length());// 使用字符串截取
			char ch[] = subString.toCharArray();
			if (ch[0] == '0' && ch[1] != '0') {
				System.out.println(subString.substring(1, subString.length()));
			} else if (ch[0] == '0' && ch[1] == '0' && ch[2] == '0') {
				System.out.println("0");
			} else {
				System.out.println(subString);
			}
		}
	}

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
	public static int factorial1(int n) {
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
	 * 另一种阶乘
	 * 
	 * 大家都知道阶乘这个概念，举个简单的例子：5！=1*2*3*4*5.现在我们引入一种新的阶乘概念，
	 * 将原来的每个数相乘变为i不大于n的所有奇数相乘例如：5!!=1*3*5.现在明白现在这种阶乘的意思了吧！
	 * 
	 * 现在你的任务是求出1!!+2!!......+n!!的正确值(n<=20)
	 **/
	public static void factorial2() {
		System.out.println("请输一个整数n(n<=20)：");
		int n = Util.getInt();
		long sum = 0;
		if (n <= 20 && n > 0) {
			if (n == 1 || n == 2) {
				sum = n;
			} else {
				for (int i = 1; i <= n; i++) {
					long factorial = 1;
					for (int j = 1; j <= i; j++) {
						if (j % 2 != 0) {
							System.out.println(i + " " + j);
							factorial *= j;
						}
					}
					System.out.println(i + "!! = " + factorial);
					sum += factorial;
				}
			}
		} else {
			System.out.println("n太大了，这个程序只支持int类型的最大值");
		}
		if (sum != 0) {
			System.out.println("1!!+2!!......+n!! = " + sum);
		}
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
		int intArray[] = new int[4];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = n % 10;
			n = n / 10;
		}
		Util.downSort(intArray);
		int a = 1000 * intArray[0] + 100 * intArray[1] + 10 * intArray[2] + intArray[3];
		return a;
	}

	/**
	 * 将一个四位数的所以数字从小到大排序，得到一个新的四位数
	 * 
	 **/
	public static int sort4DigitNumberFromSmallToBig(int n) {
		int intArray[] = new int[4];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = n % 10;
			n = n / 10;
		}
		Util.upSort(intArray);
		int a = 1000 * intArray[0] + 100 * intArray[1] + 10 * intArray[2] + intArray[3];
		return a;
	}

	/**
	 * 6174问题
	 * 
	 * 假设你有一个各位数字互不相同的四位数，把所有的数字从大到小排序后得到a,从小到大后得到b,然后用a-b替换原来这个数，并且继续操作。
	 * 
	 * 例如，从1234出发，依次可以得到4321-1234=3087、8730-378=8352、8532-2358=6174，又回到了它自己！现在要你写一个程序来判断一个四位数经过多少次这样的操作能出现循环，并且求出操作的次数
	 * 
	 **/
	public static void issue6174() {
		System.out.println("请输入一个各位数字互不相同的四位数：");
		int n = Util.getInt();
		if (!Util.judgeSameNumberInDigit(n)) {// 判断四位数字中是否有相同数字
			int result = n;
			int flag = 0;
			int a = 0;
			int b = 0;
			while (result != 6174) {
				a = sort4DigitNumberFromBigToSmall(result);
				b = sort4DigitNumberFromSmallToBig(result);
				result = a - b;
				System.out.println(result);
				flag++;
			}
			System.out.println("次数为：" + flag);
		} else {
			System.out.println("四位数中有相同数字！！");
		}
	}

	/**
	 * 谁获得了最高奖学金
	 * 
	 * 某校的惯例是在每学期的期末考试之后发放奖学金。发放的奖学金共有五种，获取的条件各自不同：
	 * 1)院士奖学金，每人8000元，期末平均成绩高于80分（>80），并且在本学期内发表1篇或1篇以上论文的学生均可获得；
	 * 2)五四奖学金，每人4000元，期末平均成绩高于85分（>85），并且班级评议成绩高于80分（>80）的学生均可获得；
	 * 3)成绩优秀奖，每人2000元，期末平均成绩高于90分（>90）的学生均可获得；
	 * 4)西部奖学金，每人1000元，期末平均成绩高于85分（>85）的西部省份学生均可获得；
	 * 5)班级贡献奖，每人850元，班级评议成绩高于80分（>80）的学生干部均可获得；
	 * 只要符合条件就可以得奖，每项奖学金的获奖人数没有限制，每名学生也可以同时获得多项奖学金。例如姚林的期末平均成绩是87分，班级评议成绩82分，同时他还是一位学生干部，那么他可以同时获得五四奖学金和班级贡献奖，奖金总数是4850元。
	 * 现在给出若干学生的相关数据，请计算哪些同学获得的奖金总数最高（假设总有同学能满足获得奖学金的条件）。
	 * 
	 * 输入
	 * 
	 * 第一行输入数据N，表示学生的总数。接下来的X行每行是一位学生的数据，从左向右依次是姓名，期末平均成绩，班级评议成绩，
	 * 是否是学生干部，是否是西部省份学生，以及发表的论文数。姓名是由大小写英文字母组成的长度不超过20的字符串（不含空格）；
	 * 期末平均成绩和班级评议成绩都是0到100之间的整数（包括0和100）；
	 * 是否是学生干部和是否是西部省份学生分别用一个字符表示，Y表示是，N表示不是；发表的论文数是0到10的整数（包括0和10）。每两个相邻数据项之间用一个空格分隔。
	 * 
	 * 输出
	 * 
	 * 每组测试数据输出包括三行，第一行是获得最多奖金的学生的姓名，第二行是这名学生获得的奖金总数。
	 * 如果有两位或两位以上的学生获得的奖金最多，输出他们之中在输入文件中出现最早的学生的姓名。第三行是这X个学生获得的奖学金的总数。
	 * 
	 * 姓名 期末平均成绩 论文数 班级评议成绩 西部省份学生（Y or N） 学生干部（Y or N）
	 * 
	 * 半成品：输入学生数，输入学生信息， 思路：将学生信息放入list, 使用split将每个学生信息放入字符串数组
	 * 
	 **/
	public static void topScholarship() {
		System.out.println("请输入N个学生数：");
		Scanner scanner1 = new Scanner(System.in);
		int studentNum = 0;
		if (scanner1.hasNextInt()) {
			studentNum = scanner1.nextInt();
		}
		System.out.println("请输入学生信息（姓名 期末平均成绩 论文数 班级评议成绩 西部省份学生（Y or N） 学生干部（Y or N））：");
		Scanner scanner2 = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < studentNum; i++) {
			String e = scanner2.nextLine();
			list.add(e);
		}
		int intArray[] = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			String stringArray[] = list.get(i).split(" ");
			int sum = 0;
			if (Integer.valueOf(stringArray[1]) > 80 && Integer.valueOf(stringArray[2]) > 0) {
				sum += 8000;
			}
			if (Integer.valueOf(stringArray[1]) > 85 && Integer.valueOf(stringArray[3]) > 80) {
				sum += 4000;
			}
			if (Integer.valueOf(stringArray[1]) > 90) {
				sum += 2000;
			}
			if (Integer.valueOf(stringArray[1]) > 85 && stringArray[4].equalsIgnoreCase("Y")) {
				sum += 1000;
			}
			if (Integer.valueOf(stringArray[3]) > 80 && stringArray[5].equalsIgnoreCase("Y")) {
				sum += 850;
			}
			intArray[i] = sum;
			System.out.println(stringArray[0] + " " + sum);
		}
		Util.downSort(intArray);
		System.out.println("获得奖学金最多的是" + intArray[0]);
		scanner1.close();
		scanner2.close();
	}

	/**
	 * 笨小熊
	 * 
	 * 假设maxn是单词中出现次数最多的字母的出现次数，minn是单词中出现次数最少的字母的出现次数，如果maxn-minn是一个质数，那么笨小熊就认为这是个Lucky
	 * Word，这样的单词很可能就是正确的答案。
	 * 
	 * 输入
	 * 
	 * 第一行数据N(0<N<100)表示测试数据组数。 每组测试数据输入只有一行，是一个单词，其中只可能出现小写字母，并且长度小于100。
	 * 
	 * 输出
	 * 
	 * 每组测试数据输出共两行，第一行是一个字符串，假设输入的的单词是Lucky Word，那么输出“Lucky Word”，否则输出“No Answer”；
	 * 第二行是一个整数，如果输入单词是Lucky Word，输出maxn-minn的值，否则输出0
	 * 
	 **/
	public static void stupidBear() {
		System.out.println("请输入单词个数：");
		int n = Util.getInt();
		System.out.println("请输入单词：");
		List<String> list = Util.getListString(n);
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);
			int maxn = Util.getMaxValue(Util.charCountMap(string));
			int minn = Util.getMinValue(Util.charCountMap(string));
			int m = maxn - minn;
			if (Util.judgePrimeNumber(m)) {
				System.out.println(string + " " + m + " Lucky Word");
			} else {
				System.out.println(string + " " + m + " No Answer");
			}
		}
	}

	/**
	 * 鸡兔同笼
	 * 
	 * 已知鸡和兔的总数量为n,总腿数为m。输入n和m,依次输出鸡和兔的数目，如果无解，则输出“No answer”(不要引号)。
	 **/
	public static void chickenAndRabbit() {
		System.out.println("请输入测试总共有几组测试数据：");
		int a = Util.getInt();
		System.out.println("鸡和兔的总数量和总腿数：");
		List<String> list = Util.getListString(a);

		for (int i = 0; i < list.size(); i++) {
			boolean flag = false;
			String stringArray[] = list.get(i).split(" ");
			int n = Integer.valueOf(stringArray[0]);
			int m = Integer.valueOf(stringArray[1]);
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (4 * j + 2 * k == m && j + k == n) {
						flag = true;// 设置标志位，false的话证明没有答案
						System.out.println("鸡兔数量分别为:" + k + " " + j);
					}
				}
			}
			if (!flag) {
				System.out.println("第" + (i + 1) + "组测试数据为：" + "No answer");
			}
		}
	}

	/**
	 * Financial Management
	 * 
	 * 需要double,DecimalFormat类使用结果需要保留两位小数
	 * 
	 **/
	public static void financialManagement() {
		Scanner scanner = new Scanner(System.in);
		Double sum = 0.0;
		for (int i = 0; i < 12; i++) {
			if (scanner.hasNextDouble()) {
				sum += scanner.nextDouble();
			}
		}
		Double averag = sum / 12;
		DecimalFormat dfDecimalFormat = new DecimalFormat(".00");
		System.out.println(dfDecimalFormat.format(averag));
		scanner.close();
	}

	/**
	 * 小学生算术
	 * 
	 * 很多小学生在学习加法时，发现“进位”特别容易出错。你的任务是计算两个三位数在相加时需要多少次进位。
	 * 你编制的程序应当可以连续处理多组数据，直到读到两个0（这是输入结束标记）。
	 * 
	 * 输入两个正整数m,n.(m,n,都是三位数)。 输出m,n,相加时需要进位多少次。
	 * 
	 * 
	 **/
	public static void numCarryCount() {
		System.out.println("请输入测试数据(m,n,都是三位数),以0 0结束:");
		List<String> list = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String eString = scanner.nextLine();
			if (eString.equalsIgnoreCase("0 0")) {// 字符串的比较用==的含义是引用比较
				break;
			} else {
				list.add(eString);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			String stringArray[] = list.get(i).split(" ");
			int mArray[] = Util.separateNumber(stringArray[0]);// 将第一个数字进行各个位数分离
			int nArray[] = Util.separateNumber(stringArray[1]);// 将第二个数字进行各个位数分离
			int count = 0;
			for (int j = 0; j < mArray.length - 1; j++) {
				if (mArray[j] + nArray[j] >= 10) {
					count++;
					if (mArray[j + 1] + nArray[j + 1] == 9) {// 判断下一位相加是否等于9
						count++;
					}
				}
			}
			if (mArray[mArray.length - 1] + nArray[mArray.length - 1] >= 10) {// 判断最高位是否进位
				count++;
			}
			System.out.println(list.get(i) + " 相加需要进位次数为：" + count);
		}
		scanner.close();
	}

	/**
	 * 日期计算
	 * 
	 * 输入一个日期，格式如：2010 10 24 ，判断这一天是这一年中的第几天。
	 * 
	 * 第一行输入一个数N（0<N<=100）,表示有N组测试数据。后面的N行输入多组输入数据，每行的输入数据都是一个按题目要求格式输入的日期。
	 * 
	 * 每组输入数据的输出占一行，输出判断出的天数n
	 * 
	 * （1-12月分别为31天，?天，31天，30天，31天，30天，31天，31天，30天，31天，30天，31天）
	 **/
	public static void calculateDate() {
		System.out.println("请输入有多少组测试数据");
		int n = Util.getInt();
		List<String> list = Util.getListString(n);
		for (int i = 0; i < list.size(); i++) {
			String string[] = list.get(i).split(" ");
			int year = Integer.valueOf(string[0]);
			int month = Integer.valueOf(string[1]);
			int day = Integer.valueOf(string[2]);
			int count = 0;
			int total = 0;
			if (month > 1) {
				count += 31;
			}
			if (month > 2) {
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					count += 29;
				} else {
					count += 28;
				}
			}
			if (month > 3) {
				count += 31;
			}
			if (month > 4) {
				count += 30;
			}
			if (month > 5) {
				count += 31;
			}
			if (month > 6) {
				count += 30;
			}
			if (month > 7) {
				count += 31;
			}
			if (month > 8) {
				count += 31;
			}
			if (month > 9) {
				count += 30;
			}
			if (month > 10) {
				count += 31;
			}
			if (month > 11) {
				count += 30;
			}
			total = count + day;
			System.out.println(list.get(i) + " 是" + string[0] + "年的第" + total + "天");
		}
	}

	/**
	 * 开灯问题
	 * 
	 * 有n盏灯，编号为1~n，第1个人把所有灯打开，第2个人按下所有编号为2 的倍数的开关（这些灯将被关掉），第3
	 * 个人按下所有编号为3的倍数的开关（其中关掉的灯将被打开，开着的灯将被关闭），依此类推。一共有k个人，
	 * 问最后有哪些灯开着？输入：n和k，输出开着的灯编号。k≤n≤1000
	 * 
	 * 输入一组数据：n和k
	 * 
	 * 输出开着的灯编号
	 * 
	 * 奇数是关，偶数是开
	 **/
	public static void turnOnTheLight() {
		System.out.println("请输入k和n(k≤n≤1000)");
		int n = Util.getInt();
		int k = Util.getInt();
		if (k <= n) {
			for (int i = 1; i <= n; i++) {
				int flag = 0;// 标志位，奇数是关灯，偶数是开灯
				for (int j = 2; j <= k; j++) {
					if (i % j == 0) {
						flag++;
					}
				}
				if (flag == 0 || !Util.judgeEvenNumber(flag)) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("你输入的测试数据不正确！");
		}
	}

	/**
	 * cigarettes
	 * 
	 * Tom has many cigarettes. We hypothesized that he has n cigarettes and smokes
	 * them one by one keeping all the butts. Out of k > 1 butts he can roll a new
	 * cigarette. Now，do you know how many cigarettes can Tom has?
	 * 
	 * First input is a single line,it's n and stands for there are n testdata.then
	 * there are n lines ,each line contains two integer numbers giving the values
	 * of n and k.
	 * 
	 * For each line of input, output one integer number on a separate line giving
	 * the maximum number of cigarettes that Peter can have.
	 * 
	 * 
	 **/
	public static void cigarettes() {
		System.out.println("请输入测试总共有几组测试数据：");
		int a = Util.getInt();
		System.out.println("请输入烟和烟头数：");
		List<String> list = Util.getListString(a);
		for (int i = 0; i < list.size(); i++) {
			String string[] = list.get(i).split(" ");
			int n = Integer.valueOf(string[0]);
			int k = Integer.valueOf(string[1]);
			int cigarettes = n;
			int butts = k;
			while (butts >= k) {
				int temp = cigarettes % k;// 记录不够做成烟的烟头总数
				cigarettes /= k;
				n += cigarettes;
				butts = cigarettes + temp;// 做成烟后记录剩下的烟头总数
			}
			System.out.println("The maximum number of cigarettes is: " + n);
		}
	}

}
