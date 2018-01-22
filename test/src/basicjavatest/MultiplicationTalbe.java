package basicjavatest;

/**
 * @author 张大爷
 * @time 2018年1月22日 下午5:08:58
 * @mail 767580776@qq.com
 * @description 九九乘法表
 */
public class MultiplicationTalbe {
	public static void printMultiplicationTalbe() {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j + 1 + "*" + i + "=" + (j + 1) * i + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("九九乘法表如下：");
		printMultiplicationTalbe();

	}

}
