package test;

import java.util.Scanner;

import com.sun.jna.platform.win32.WinUser.KBDLLHOOKSTRUCT;

/**
 * @author �Ŵ�ү
 * @time 2018��1��22�� ����9:22:17
 * @mail 767580776@qq.com
 * @description ���ָ������������
 */
public class Diamond {
	public static void printDiamond(int row) {
		System.out.println("�����������Ϊ�� " + row);
		if (row % 2 == 0) {
			row++;
		}
		for (int i = 0; i < row / 2 + 1; i++) {
			for (int j = row / 2 + 1; j > i + 1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int i = 0; i < row / 2; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int k = row - 2 * i - 2; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int row = 0;
		System.out.print("���������ε�������");
		if (scanner.hasNextInt()) {
			row = scanner.nextInt();
			System.out.println("�����������Ϊ�� " + row);
		} else {
			System.out.println("������Ĳ������� ");
		}
		scanner.close();
		printDiamond(row);
	}
}
