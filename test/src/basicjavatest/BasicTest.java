package basicjavatest;

/**
 * @author �Ŵ�ү
 * @time 2018��2��5�� ����6:13:37
 * @mail 767580776@qq.com
 * @description
 */
public class BasicTest {
	/**
	 *
	 * ���ָ������������
	 *
	 */
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

	/**
	 *
	 * �žų˷���
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
	 * ��ӡƽ���ı���
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
	 * ��ӡ����
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
	 * ��ӡ��������
	 *
	 */
	public static void printInvertedTriangle(int row) {
		System.out.println("����Ҫ�ĵ�������Ϊ��");
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
	 * ��ӡ������
	 *
	 */
	public static void printTriangle(int row) {
		System.out.println("����Ҫ��������Ϊ��");
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
