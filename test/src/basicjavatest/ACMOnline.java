package basicjavatest;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import common.Util;

/**
 * @author �Ŵ�ү
 * @time 2018��1��26�� ����4:35:41
 * @mail 767580776@qq.com
 * @description
 */
public class ACMOnline {
	/**
	 *
	 * �ֵܽ�������
	 *
	 * �ֵ����ﳵ���Σ��ܵ��ȳ�����ÿ����X�ף�M���Ӻ󣬸���һ������������ÿ����Y�׵��ٶ�ȥ׷�ܵܣ�
	 * ��������ÿ����Z�׵��ٶ���ܵ���ȥ��׷�ϵܵܺ����������أ�ֱ�����׷�ϵܵ�ʱ�������˶����ף�
	 * 
	 * ��һ������һ������N����ʾ�������ݵ�����(N<100) ÿ���������ռһ�У����ĸ����������ֱ�ΪM,X,Y,Z�����ݱ�֤X<Y<Z)
	 * 
	 * ������ܵ�·�����������С�������λ��
	 */
	public static void brotherOuting() {
		
	}
	

	/**
	 *
	 * n-1λ��
	 *
	 * ��һ��ΪM����ʾ��������������������M�У�ÿ�а���һ���������ݡ�
	 * ���M�У�ÿ��Ϊ��Ӧ�е�n-1λ��������ǰ׺0��������������λ�⣬����λ��Ϊ0�������0��
	 *
	 */
	public static void printNextNum() {
		System.out.print("����������n�����������������ݣ�");
		int n = Util.getInt();
		System.out.print("������n��������ݣ�ÿ���������ڵ���2λ����");
		List<String> list = Util.getListString(n);
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);
			String subString = string.substring(1, string.length());// ʹ���ַ�����ȡ
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
	 * ASCII������
	 * 
	 * ���������ַ��������ظ����󣬰����ַ���ASCII���С�����˳������������ַ���
	 * ��һ������һ����N,��ʾ��N��������ݡ������N������������ݣ�ÿ���������ݶ���ռһ�У��������ַ���ɣ�֮���޿ո�
	 * ����ÿ���������ݣ����һ�У��ַ��м���һ���ո�ֿ���
	 * 
	 */
	public static void ASCIISort() {
		Scanner scanner = new Scanner(System.in);
		String string[] = null;
		int size = 0;
		System.out.print("���������֣��������������ַ�����");
		if (scanner.hasNextInt()) {
			size = scanner.nextInt();
			string = new String[size];
		} else {
			System.out.print("���������֣���");
		}
		Scanner scannerString = new Scanner(System.in);
		System.out.println("�뿪ʼ�����ַ�����ÿ���ַ�����enter��������");
		for (int i = 0; i < size; i++) { // ��ȡ������ַ����������ַ�������
			if (scannerString.hasNextLine()) {
				string[i] = scannerString.nextLine();
			}
		}

		for (int i = 0; i < string.length; i++) {
			char ch[] = string[i].toCharArray(); // �ַ���ת�����ַ�����
			for (int j = 0; j < ch.length - 1; j++) { // ð������
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
	 * ��ż������
	 * 
	 * ��һ������n(2<= num <=10000),��Ҫ�����ǣ��Ȱ�1��n�е�����������С����������ٰ����е�ż����С���������
	 * ��һ��������е�����,�ڶ���������е�ż��
	 * 
	 */
	public static void SeparateOddAndEven() {
		System.out.print("������һ������n(2<= num <=10000)��");
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		if (scanner.hasNextInt()) {
			num = scanner.nextInt();
		} else {
			System.out.print("ϹJ8���룬��㻵�ҵĳ���ģ������~~");
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
			System.out.print("ϹJ8���룬��㻵�ҵĳ���ģ������~~");
		}

		scanner.close();
	}

	/**
	 * Fibonacci��
	 * 
	 * ��������1��1��2��3��5��8��13��21��34��55...��ΪFibonacci���У������Եݹ�ض���Ϊ F(n)=1
	 * ...........(n=1��n=2)�� F(n)=F(n-1)+F(n-2).....(n>2) ��Ҫ�������n��쳲�������������1�����ڶ�����Ϊ1)
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
	 * �����������
	 * 
	 * ���ڸ���N������0<N<1000��������Ҫ����д��һ�������ҳ���N�����е���������������͡� ������prime
	 * number���ֳ������������޸�����������Ϊ�ڴ���1����Ȼ���У�����1�����������ⲻ�������������� ע��2��ʵҲ��������2��ż��
	 */
	public static void sumOfPrimeNumber() {
		System.out.print("�����루0<N<1000�������������������ַ�������");
		int intArray[] = Util.getIntArray();
		int intArraySum = 0;
		for (int i = 0; i < intArray.length; i++) {// ������������е����ֵĺ�
			intArraySum += intArray[i];
		}
		int notPrime = 0;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = intArray[i] - 1; j > 1; j--) {// ���ܶ�1�ͱ���������
				if (intArray[i] % j == 0) {
					notPrime += intArray[i];// ������еķ������ĺ�
					break;// ֻҪ��һ��j�ܳ�������֤��intArray[i]����������������ѭ��
				}
			}
		}
		System.out.println("�������ĺ�Ϊ��" + intArraySum);
		System.out.println("���з������ĺ�Ϊ��" + notPrime);
		System.out.println("���������ĺ�Ϊ��" + (intArraySum - notPrime));
	}

	/**
	 * ������������
	 * 
	 * ���ڸ�����һЩ����Ҫ����д��һ�����������Щ������������������� ���������೤��,��������еȾ��볤�����������������ֵ����Ӧ���롣
	 * �����������������������������������������������0
	 *
	 **/
	public static void distanceOfprimeNumber() {
		System.out.print("�����루0<N<100000�������������������ַ�������");
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
			System.out.println("��������������ǣ� " + (num + 1) + " ����Ϊ��" + 1);
		} else {
			int flag = 0;
			for (int i = 0; i < 10; i++) {
				if (flag != 0) {// flag��־λ����Ϊ0�������ж��Ƿ�Ϊ����
					flag = 0;
				}
				for (int j = num + i - 1; j > 1; j--) {// �ж�num�Ƿ�Ϊ���������ǣ����־λ��1���˳���ѭ��
					if ((num + i) % j == 0) {
						flag = 1;
						break;
					}
				}
				if (flag == 0) {// �жϱ�־λ����0����������������˳�ѭ��
					Rnum = num + i;
					RDistance = i;
					System.out.println("��������������ǣ� " + Rnum + " ����Ϊ��" + RDistance);
					break;
				}
			}

			for (int i = 0; i < 10; i++) {
				if (flag != 0) {// flag��־λ����Ϊ0�������ж��Ƿ�Ϊ����
					flag = 0;
				}
				for (int j = num - i - 1; j > 1; j--) {// �ж�num�Ƿ�Ϊ���������ǣ����־λ��1���˳���ѭ��
					if ((num - i) % j == 0) {
						flag = 1;
						break;
					}
				}
				if (flag == 0) {// �жϱ�־λ����0����������������˳�ѭ��
					Lnum = num - i;
					LDistance = i;
					System.out.println("��������������ǣ� " + Lnum + " ����Ϊ��" + LDistance);
					break;
				}
			}
		}
		if (RDistance == LDistance) {
			System.out.println("����������������������ȣ��������������� ");
			System.out.println("��������������ǣ� " + Lnum + " ����Ϊ��" + LDistance);
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
	 * ����ֵ
	 * 
	 * ����ֻ��һ��������ݣ���������ȡ��С����������ĳ��� ��ð����������������һ�������һ����
	 **/
	public static void valueOfMinMax() {
		System.out.print("�����루0<N<10000���������������������ַ�������");
		int intArray[] = Util.getIntArray();
		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = 0; j < intArray.length - 1 - i; j++) {
				if (intArray[j] > intArray[j + 1]) {
					Util.swap(intArray, j + 1, j);
				}
			}
		}
		System.out.println("��СֵΪ��" + intArray[0]);
		System.out.println("���ֵΪ��" + intArray[intArray.length - 1]);
	}

	/**
	 * ��������
	 * 
	 * ��n*n����������1,2,...,n*n,Ҫ��������Ρ� ��������->������->������->����
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
	 * ���ŵ��
	 * 
	 * ��֪��������С��10��������100 �� ����3���Ǹ�����a,b,c ����ʾÿ�ֶ�����β��������a<3,b<5,c<7��������,���룺2 4 5
	 * 
	 * �������������Сֵ���򱨸��޽⣬�����No answer����ʵ���������89
	 **/
	public static void pointSoldier() {
		System.out.println("������3�������������������ַ�������");
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
	 * ˮ�ɻ���
	 * 
	 * ˮ�ɻ����������λ�������͵������������λ��
	 * 
	 * �������������Сֵ���򱨸��޽⣬�����No answer����ʵ���������89
	 **/
	public static void NarcissisticNumber() {
		System.out.println("������N���������ݣ��������ַ�������");
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
	 * ���Լ������С������
	 * 
	 * ����������������������ǵ����Լ������С��������
	 * 
	 * ��С������=�����ĳ˻�/���Լ������
	 * 
	 **/

	public static void greatestCommonDivisor() {
		System.out.println("��������������������������ĸ��������");
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
		for (i = min; i > 1; i--) {// ȡС�������дӴ�С���࣬������������Ȼ���˳�ѭ��
			if (min % i == 0 && max % i == 0) {
				System.out.println("���Լ��Ϊ��" + i);
				break;
			}
		}
		if (i != 0) {
			System.out.println("��С������Ϊ��" + intArray[0] * intArray[1] / i);
		}
	}

	/**
	 * �׳�
	 * 
	 * һ���������Ľ׳ˣ�factorial��������С�ڼ����ڸ������������Ļ�������0�Ľ׳�Ϊ1����Ȼ��n�Ľ׳�д��n!
	 **/
	public static int factorial1(int n) {
		int factorial = 1;
		if (n < 19) {
			for (int i = 1; i <= n; i++) {
				factorial *= i;
			}
			System.out.println(n + "! = " + factorial);
		} else {
			System.out.println("n̫���ˣ��������ֻ֧��int���͵����ֵ");
		}
		return factorial;
		/*
		 * DecimalFormat df = new DecimalFormat();// 16λ����λ����С��λ String temp =
		 * df.format(factorial); System.out.println(n + "! = " +temp);
		 */
	}

	/**
	 * ��һ�ֽ׳�
	 * 
	 * ��Ҷ�֪���׳��������ٸ��򵥵����ӣ�5��=1*2*3*4*5.������������һ���µĽ׳˸��
	 * ��ԭ����ÿ������˱�Ϊi������n����������������磺5!!=1*3*5.���������������ֽ׳˵���˼�˰ɣ�
	 * 
	 * ����������������1!!+2!!......+n!!����ȷֵ(n<=20)
	 **/
	public static void factorial2() {
		System.out.println("����һ������n(n<=20)��");
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
			System.out.println("n̫���ˣ��������ֻ֧��int���͵����ֵ");
		}
		if (sum != 0) {
			System.out.println("1!!+2!!......+n!! = " + sum);
		}
	}

	/**
	 * �ֽ�������
	 * 
	 * �ֽ�������ֻ��Ժ��������ֽ�������Ҳ�Ʒֽ�����������һ�����ֽ���������Ҫ����С����������һֱ�������Ϊ����Ϊֹ���ֽ�����������ʽ�ж̳���
	 * 
	 **/
	public static void factoring(int n) {
		int temp = n;
		int flag = 0;// ��־λ�������ж���������Ƿ�Ϊ����
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i <= temp; i++) { // ע��������౾��(=temp)
			if (temp % i == 0) {
				System.out.println(temp + "," + i);
				list.add(i);
				temp = temp / i;
				flag++;// ��־λ
				i--;// ���������һ���������Ե�ǰi����
			}
		}
		if (flag == 0) {
			System.out.print("������Ĳ��Ǻ�������");
		} else {
			System.out.print(n + "�ķֽ�������Ϊ��");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
		}
	}

	/**
	 * ��һ����λ�����������ִӴ�С���򣬵õ�һ���µ���λ��
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
	 * ��һ����λ�����������ִ�С�������򣬵õ�һ���µ���λ��
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
	 * 6174����
	 * 
	 * ��������һ����λ���ֻ�����ͬ����λ���������е����ִӴ�С�����õ�a,��С�����õ�b,Ȼ����a-b�滻ԭ������������Ҽ���������
	 * 
	 * ���磬��1234���������ο��Եõ�4321-1234=3087��8730-378=8352��8532-2358=6174���ֻص������Լ�������Ҫ��дһ���������ж�һ����λ���������ٴ������Ĳ����ܳ���ѭ����������������Ĵ���
	 * 
	 **/
	public static void issue6174() {
		System.out.println("������һ����λ���ֻ�����ͬ����λ����");
		int n = Util.getInt();
		if (!Util.judgeSameNumberInDigit(n)) {// �ж���λ�������Ƿ�����ͬ����
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
			System.out.println("����Ϊ��" + flag);
		} else {
			System.out.println("��λ��������ͬ���֣���");
		}
	}

	/**
	 * ˭�������߽�ѧ��
	 * 
	 * ĳУ�Ĺ�������ÿѧ�ڵ���ĩ����֮�󷢷Ž�ѧ�𡣷��ŵĽ�ѧ�������֣���ȡ���������Բ�ͬ��
	 * 1)Ժʿ��ѧ��ÿ��8000Ԫ����ĩƽ���ɼ�����80�֣�>80���������ڱ�ѧ���ڷ���1ƪ��1ƪ�������ĵ�ѧ�����ɻ�ã�
	 * 2)���Ľ�ѧ��ÿ��4000Ԫ����ĩƽ���ɼ�����85�֣�>85�������Ұ༶����ɼ�����80�֣�>80����ѧ�����ɻ�ã�
	 * 3)�ɼ����㽱��ÿ��2000Ԫ����ĩƽ���ɼ�����90�֣�>90����ѧ�����ɻ�ã�
	 * 4)������ѧ��ÿ��1000Ԫ����ĩƽ���ɼ�����85�֣�>85��������ʡ��ѧ�����ɻ�ã�
	 * 5)�༶���׽���ÿ��850Ԫ���༶����ɼ�����80�֣�>80����ѧ���ɲ����ɻ�ã�
	 * ֻҪ���������Ϳ��Եý���ÿ�ѧ��Ļ�����û�����ƣ�ÿ��ѧ��Ҳ����ͬʱ��ö��ѧ������Ҧ�ֵ���ĩƽ���ɼ���87�֣��༶����ɼ�82�֣�ͬʱ������һλѧ���ɲ�����ô������ͬʱ������Ľ�ѧ��Ͱ༶���׽�������������4850Ԫ��
	 * ���ڸ�������ѧ����������ݣ��������Щͬѧ��õĽ���������ߣ���������ͬѧ�������ý�ѧ�����������
	 * 
	 * ����
	 * 
	 * ��һ����������N����ʾѧ������������������X��ÿ����һλѧ�������ݣ�����������������������ĩƽ���ɼ����༶����ɼ���
	 * �Ƿ���ѧ���ɲ����Ƿ�������ʡ��ѧ�����Լ���������������������ɴ�СдӢ����ĸ��ɵĳ��Ȳ�����20���ַ����������ո񣩣�
	 * ��ĩƽ���ɼ��Ͱ༶����ɼ�����0��100֮�������������0��100����
	 * �Ƿ���ѧ���ɲ����Ƿ�������ʡ��ѧ���ֱ���һ���ַ���ʾ��Y��ʾ�ǣ�N��ʾ���ǣ��������������0��10������������0��10����ÿ��������������֮����һ���ո�ָ���
	 * 
	 * ���
	 * 
	 * ÿ�������������������У���һ���ǻ����ཱ���ѧ�����������ڶ���������ѧ����õĽ���������
	 * �������λ����λ���ϵ�ѧ����õĽ�����࣬�������֮���������ļ��г��������ѧ��������������������X��ѧ����õĽ�ѧ���������
	 * 
	 * ���� ��ĩƽ���ɼ� ������ �༶����ɼ� ����ʡ��ѧ����Y or N�� ѧ���ɲ���Y or N��
	 * 
	 * ���Ʒ������ѧ����������ѧ����Ϣ�� ˼·����ѧ����Ϣ����list, ʹ��split��ÿ��ѧ����Ϣ�����ַ�������
	 * 
	 **/
	public static void topScholarship() {
		System.out.println("������N��ѧ������");
		Scanner scanner1 = new Scanner(System.in);
		int studentNum = 0;
		if (scanner1.hasNextInt()) {
			studentNum = scanner1.nextInt();
		}
		System.out.println("������ѧ����Ϣ������ ��ĩƽ���ɼ� ������ �༶����ɼ� ����ʡ��ѧ����Y or N�� ѧ���ɲ���Y or N������");
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
		System.out.println("��ý�ѧ��������" + intArray[0]);
		scanner1.close();
		scanner2.close();
	}

	/**
	 * ��С��
	 * 
	 * ����maxn�ǵ����г��ִ���������ĸ�ĳ��ִ�����minn�ǵ����г��ִ������ٵ���ĸ�ĳ��ִ��������maxn-minn��һ����������ô��С�ܾ���Ϊ���Ǹ�Lucky
	 * Word�������ĵ��ʺܿ��ܾ�����ȷ�Ĵ𰸡�
	 * 
	 * ����
	 * 
	 * ��һ������N(0<N<100)��ʾ�������������� ÿ�������������ֻ��һ�У���һ�����ʣ�����ֻ���ܳ���Сд��ĸ�����ҳ���С��100��
	 * 
	 * ���
	 * 
	 * ÿ�����������������У���һ����һ���ַ�������������ĵĵ�����Lucky Word����ô�����Lucky Word�������������No Answer����
	 * �ڶ�����һ��������������뵥����Lucky Word�����maxn-minn��ֵ���������0
	 * 
	 **/
	public static void stupidBear() {
		System.out.println("�����뵥�ʸ�����");
		int n = Util.getInt();
		System.out.println("�����뵥�ʣ�");
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
	 * ����ͬ��
	 * 
	 * ��֪�����õ�������Ϊn,������Ϊm������n��m,������������õ���Ŀ������޽⣬�������No answer��(��Ҫ����)��
	 **/
	public static void chickenAndRabbit() {
		System.out.println("����������ܹ��м���������ݣ�");
		int a = Util.getInt();
		System.out.println("�����õ�����������������");
		List<String> list = Util.getListString(a);

		for (int i = 0; i < list.size(); i++) {
			boolean flag = false;
			String stringArray[] = list.get(i).split(" ");
			int n = Integer.valueOf(stringArray[0]);
			int m = Integer.valueOf(stringArray[1]);
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (4 * j + 2 * k == m && j + k == n) {
						flag = true;// ���ñ�־λ��false�Ļ�֤��û�д�
						System.out.println("���������ֱ�Ϊ:" + k + " " + j);
					}
				}
			}
			if (!flag) {
				System.out.println("��" + (i + 1) + "���������Ϊ��" + "No answer");
			}
		}
	}

	/**
	 * Financial Management
	 * 
	 * ��Ҫdouble,DecimalFormat��ʹ�ý����Ҫ������λС��
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
	 * Сѧ������
	 * 
	 * �ܶ�Сѧ����ѧϰ�ӷ�ʱ�����֡���λ���ر����׳�����������Ǽ���������λ�������ʱ��Ҫ���ٴν�λ��
	 * ����Ƶĳ���Ӧ��������������������ݣ�ֱ����������0���������������ǣ���
	 * 
	 * ��������������m,n.(m,n,������λ��)�� ���m,n,���ʱ��Ҫ��λ���ٴΡ�
	 * 
	 * 
	 **/
	public static void numCarryCount() {
		System.out.println("�������������(m,n,������λ��),��0 0����:");
		List<String> list = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String eString = scanner.nextLine();
			if (eString.equalsIgnoreCase("0 0")) {// �ַ����ıȽ���==�ĺ��������ñȽ�
				break;
			} else {
				list.add(eString);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			String stringArray[] = list.get(i).split(" ");
			int mArray[] = Util.separateNumber(stringArray[0]);// ����һ�����ֽ��и���λ������
			int nArray[] = Util.separateNumber(stringArray[1]);// ���ڶ������ֽ��и���λ������
			int count = 0;
			for (int j = 0; j < mArray.length - 1; j++) {
				if (mArray[j] + nArray[j] >= 10) {
					count++;
					if (mArray[j + 1] + nArray[j + 1] == 9) {// �ж���һλ����Ƿ����9
						count++;
					}
				}
			}
			if (mArray[mArray.length - 1] + nArray[mArray.length - 1] >= 10) {// �ж����λ�Ƿ��λ
				count++;
			}
			System.out.println(list.get(i) + " �����Ҫ��λ����Ϊ��" + count);
		}
		scanner.close();
	}

	/**
	 * ���ڼ���
	 * 
	 * ����һ�����ڣ���ʽ�磺2010 10 24 ���ж���һ������һ���еĵڼ��졣
	 * 
	 * ��һ������һ����N��0<N<=100��,��ʾ��N��������ݡ������N����������������ݣ�ÿ�е��������ݶ���һ������ĿҪ���ʽ��������ڡ�
	 * 
	 * ÿ���������ݵ����ռһ�У�����жϳ�������n
	 * 
	 * ��1-12�·ֱ�Ϊ31�죬?�죬31�죬30�죬31�죬30�죬31�죬31�죬30�죬31�죬30�죬31�죩
	 **/
	public static void calculateDate() {
		System.out.println("�������ж������������");
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
			System.out.println(list.get(i) + " ��" + string[0] + "��ĵ�" + total + "��");
		}
	}

	/**
	 * ��������
	 * 
	 * ��nյ�ƣ����Ϊ1~n����1���˰����еƴ򿪣���2���˰������б��Ϊ2 �ı����Ŀ��أ���Щ�ƽ����ص�������3
	 * ���˰������б��Ϊ3�ı����Ŀ��أ����йص��ĵƽ����򿪣����ŵĵƽ����رգ����������ơ�һ����k���ˣ�
	 * ���������Щ�ƿ��ţ����룺n��k��������ŵĵƱ�š�k��n��1000
	 * 
	 * ����һ�����ݣ�n��k
	 * 
	 * ������ŵĵƱ��
	 * 
	 * �����ǹأ�ż���ǿ�
	 **/
	public static void turnOnTheLight() {
		System.out.println("������k��n(k��n��1000)");
		int n = Util.getInt();
		int k = Util.getInt();
		if (k <= n) {
			for (int i = 1; i <= n; i++) {
				int flag = 0;// ��־λ�������ǹصƣ�ż���ǿ���
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
			System.out.println("������Ĳ������ݲ���ȷ��");
		}
	}

	/**
	 * cigarettes
	 * 
	 * Tom has many cigarettes. We hypothesized that he has n cigarettes and smokes
	 * them one by one keeping all the butts. Out of k > 1 butts he can roll a new
	 * cigarette. Now��do you know how many cigarettes can Tom has?
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
		System.out.println("����������ܹ��м���������ݣ�");
		int a = Util.getInt();
		System.out.println("�������̺���ͷ����");
		List<String> list = Util.getListString(a);
		for (int i = 0; i < list.size(); i++) {
			String string[] = list.get(i).split(" ");
			int n = Integer.valueOf(string[0]);
			int k = Integer.valueOf(string[1]);
			int cigarettes = n;
			int butts = k;
			while (butts >= k) {
				int temp = cigarettes % k;// ��¼���������̵���ͷ����
				cigarettes /= k;
				n += cigarettes;
				butts = cigarettes + temp;// �����̺��¼ʣ�µ���ͷ����
			}
			System.out.println("The maximum number of cigarettes is: " + n);
		}
	}

}
