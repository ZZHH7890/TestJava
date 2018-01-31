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
	public static int factorial(int n) {
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
	 * ��һ����λ�����������ִ�С�������򣬵õ�һ���µ���λ��
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
