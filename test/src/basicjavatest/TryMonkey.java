package basicjavatest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author �Ŵ�ү
 * @time 2018��1��19�� ����9:32:23
 * @mail 767580776@qq.com
 * @automation
 */
public class TryMonkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = null;
		//String command = "adb shell monkey -p com.geometry --ignore-crashes --ignore-timeouts --ignore-security-exceptions --ignore-native-crashes --monitor-native-crashes --throttle 100 -s 5 -v -v -v 1000 > C:\\m.log";
		String command = "adb version > D:\\m.log ";
		try {
			Process process = Runtime.getRuntime().exec(command);// ����cmd����
			BufferedReader bReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			while ((line = bReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
