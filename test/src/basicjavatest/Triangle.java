package basicjavatest;

import java.util.Scanner;

/**
 * @author �Ŵ�ү
 * @time 2018��1��22�� ����6:11:39
 * @mail 767580776@qq.com
 * @description
 */
public class Triangle {
	public static void printInvertedTriangle(int row) {
		for(int i =0; i< row; i++) {
			for(int j = 0; j< i; j++) {
				System.out.print(" ");
			}
			for(int k = 2*row-2*i-2; k>0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public static void printTriangle(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = row - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int row = 0;
		System.out.print("�����������ε�������");
		if (scanner.hasNextInt()) {
			row = scanner.nextInt();
			System.out.println("�����������Ϊ�� " + row);
		} else {
			System.out.println("������Ĳ������� ");
		}
		scanner.close();
		printInvertedTriangle(row);
		printTriangle(row);

	}

}
