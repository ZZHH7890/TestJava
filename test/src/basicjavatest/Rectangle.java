package basicjavatest;

import java.util.Scanner;

/**
 * @author �Ŵ�ү
 * @time 2018��1��22�� ����10:16:09
 * @mail 767580776@qq.com
 * @description Just a joke
 */

public class Rectangle {
	public static void printRectangle(int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
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
		System.out.println("��������εĳ���");
		if (scanner.hasNextInt()) {
			row = scanner.nextInt();
		} else {
			System.out.println("������Ĳ������� ");
		}
		System.out.println("��������εĿ�");
		if (scanner.hasNextInt()) {
			col = scanner.nextInt();
		} else {
			System.out.println("������Ĳ������� ");
		}
		scanner.close();
		System.out.println("������ĳ��ǣ�" + col);
		System.out.println("������Ŀ��ǣ�" + row);
		System.out.println("");
		printRectangle(row, col);
	}

}
