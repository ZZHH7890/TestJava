package testcases;

import org.testng.annotations.Test;

import net.sf.json.JSONObject;

import org.testng.annotations.BeforeClass;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LoginCases {
	private static CloseableHttpClient httpClient = HttpClients.createDefault();
	private static HttpPost httppost;
	private static HttpResponse response;
	
	
  @Test
  public void f() {
	  
	  String loginURL = "http://release.thy360.com/v2/regist/code";
		// 创建一个httppost请求
		httppost = new HttpPost(loginURL);
		JSONObject jsonParam = new JSONObject();
		jsonParam.put("phone", "13714672774");
		jsonParam.put("code", "1234");
		jsonParam.put("introducerCode", "");

		try {
			
			StringEntity entity = new StringEntity(jsonParam.toString(), "utf-8");// 解决中文乱码问题
			entity.setContentEncoding("UTF-8");
			entity.setContentType("application/json");
			httppost.setEntity(entity);
			response = httpClient.execute(httppost);
			String strResult = EntityUtils.toString(response.getEntity());
			System.out.println("登录请求返回的结果：" + strResult);
			Assert.assertTrue(strResult.contains("登录成功"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		httppost.releaseConnection();
	}
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("测试开始！");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("测试结束！");
  }

}
