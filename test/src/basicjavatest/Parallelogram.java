package basicjavatest;

import java.util.Scanner;

/**
 * @author �Ŵ�ү
 * @time 2018��1��22�� ����9:50:08
 * @mail 767580776@qq.com
 * @description Just a joke
 */

public class Parallelogram {
	public static void printParallelogram(int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < col; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int row = 0;
		int col = 0;
		System.out.println("������ƽ���ı��ε�������");
		if (scanner.hasNextInt()) {
			row = scanner.nextInt();
		} else {
			System.out.println("������Ĳ������� ");
		}
		System.out.println("������ƽ���ı��ε�������");
		if (scanner.hasNextInt()) {
			col = scanner.nextInt();
		} else {
			System.out.println("������Ĳ������� ");
		}
		scanner.close();
		System.out.println("����������ǣ�" + row);
		System.out.println("����������ǣ�" + col);
		System.out.println("");
		printParallelogram(row, col);

	}

}
