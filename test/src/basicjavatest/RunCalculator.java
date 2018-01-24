package basicjavatest;

import java.util.Scanner;

/**
 * @author 张大爷
 * @time 2018年1月23日 上午9:47:04
 * @mail 767580776@qq.com
 * @description
 */
public class RunCalculator {
	public static void add(double a, double b) {
		double c = a + b;
		System.out.println("a + b = " + c);
	}

	public static void sub(double a, double b) {
		double c = a - b;
		System.out.println("a - b = " + c);
	}

	public static void mul(double a, double b) {
		double c = a * b;
		System.out.println("a * b = " + c);
	}

	public static void div(double a, double b) {
		if (b == 0) {
			System.out.println("b不能作为被除数");
		} else {
			double c = a / b;
			System.out.println("a / b = " + c);
		}
	}

	public static void mod(double a, double b) {
		if (b == 0) {
			System.out.println("b不能作为被除数");
		} else {
			double c = a % b;
			System.out.println("a % b = " + c);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double a = 0;
		double b = 0;
		System.out.println("请输入第一个数：");
		if (scanner.hasNextDouble()) {
			a = scanner.nextDouble();
		} else {
			System.out.println("请输入数字");
		}

		System.out.println("请输入第二个数：");
		if (scanner.hasNextDouble()) {
			b = scanner.nextDouble();
		} else {
			System.out.println("请输入数字");
		}
		scanner.close();
		add(a, b);
		sub(a, b);
		mul(a, b);
		div(a, b);
		mod(a, b);

	}

}
