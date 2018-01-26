package basicjavatest;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import common.InputUtil;

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
	 * number���ֳ������������޸�����������Ϊ�ڴ���1����Ȼ���У�����1�����������ⲻ��������������
	 */
	public static void primeNumber() {
		System.out.print("�����루0<N<1000�������������������ַ�������");
		int intArray[] = InputUtil.getIntArray();
		int intArraySum = 0;
		for (int i = 0; i < intArray.length; i++) {// ������������е����ֵĺ�
			intArraySum += intArray[i];
		}
		int notPrime = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == 2) {// ������ֱ������2�����ʺ�ѭ������j = intArray[i] - 1; j > 1
				notPrime += intArray[i];
			}
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(Fibonacci(10));
		//primeNumber();

	}

}
