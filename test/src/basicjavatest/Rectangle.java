package basicjavatest;

import java.util.Scanner;

/**
 * @author 张大爷
 * @time 2018年1月22日 下午10:16:09
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
		System.out.println("请输入矩形的长：");
		if (scanner.hasNextInt()) {
			row = scanner.nextInt();
		} else {
			System.out.println("你输入的不是整数 ");
		}
		System.out.println("请输入矩形的宽：");
		if (scanner.hasNextInt()) {
			col = scanner.nextInt();
		} else {
			System.out.println("你输入的不是整数 ");
		}
		scanner.close();
		System.out.println("你输入的长是：" + col);
		System.out.println("你输入的宽是：" + row);
		System.out.println("");
		printRectangle(row, col);
	}

}
