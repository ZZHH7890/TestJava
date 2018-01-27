package basicjavatest;

/**
 * @author 张大爷
 * @time 2018年1月27日 下午10:38:35
 * @mail 767580776@qq.com
 * @description
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 9) {
				break;
			}
			System.out.println(a[i]);
			System.out.println("");
		}
	}

}
