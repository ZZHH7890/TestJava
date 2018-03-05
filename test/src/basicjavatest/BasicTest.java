package basicjavatest;

/**
 * @author 张大爷
 * @time 2018年2月5日 下午6:13:37
 * @mail 767580776@qq.com
 * @description
 */
public class BasicTest {
	/**
	 *
	 * 输出指定行数的菱形
	 *
	 */
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

	/**
	 *
	 * 九九乘法表
	 *
	 */
	public static void printMultiplicationTalbe() {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j + 1 + "*" + i + "=" + (j + 1) * i + " ");
			}
			System.out.println("");
		}
	}

	/**
	 *
	 * 打印平行四边形
	 *
	 */
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

	/**
	 *
	 * 打印矩形
	 *
	 */
	public static void printRectangle(int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	/**
	 *
	 * 打印倒三角形
	 *
	 */
	public static void printInvertedTriangle(int row) {
		System.out.println("你想要的倒三角形为：");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 2 * row - 2 * i - 1; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	/**
	 *
	 * 打印三角形
	 *
	 */
	public static void printTriangle(int row) {
		System.out.println("你想要的三角形为：");
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
		printInvertedTriangle(5);
	}

}
