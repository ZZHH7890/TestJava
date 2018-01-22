package basicjavatest;

import java.util.Scanner;

/**
 * @author 张大爷
 * @time 2018年1月22日 下午9:50:08
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
		System.out.println("请输入平行四边形的行数：");
		if (scanner.hasNextInt()) {
			row = scanner.nextInt();
		} else {
			System.out.println("你输入的不是整数 ");
		}
		System.out.println("请输入平行四边形的列数：");
		if (scanner.hasNextInt()) {
			col = scanner.nextInt();
		} else {
			System.out.println("你输入的不是整数 ");
		}
		scanner.close();
		System.out.println("你输入的行是：" + row);
		System.out.println("你输入的列是：" + col);
		System.out.println("");
		printParallelogram(row, col);

	}

}
