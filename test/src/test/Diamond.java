package test;

import java.util.Scanner;

import com.sun.jna.platform.win32.WinUser.KBDLLHOOKSTRUCT;

/**
 * @author 张大爷
 * @time 2018年1月22日 上午9:22:17
 * @mail 767580776@qq.com
 * @description 输出指定行数的菱形
 */
public class Diamond {
	public static void printDiamond(int row) {
		System.out.println("你输入的行数为： " + row);
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
		System.out.print("请输入菱形的行数：");
		if (scanner.hasNextInt()) {
			row = scanner.nextInt();
			System.out.println("你输入的行数为： " + row);
		} else {
			System.out.println("你输入的不是整数 ");
		}
		scanner.close();
		printDiamond(row);
	}
}
