package basicjavatest;

import java.text.DecimalFormat;

/**
 * @author 张大爷
 * @time 2018年1月27日 下午10:38:35
 * @mail 767580776@qq.com
 * @description
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 76.2356;
		DecimalFormat dfDecimalFormat = new DecimalFormat(".00");
		System.out.println(dfDecimalFormat.format(d));
		
	}

}
