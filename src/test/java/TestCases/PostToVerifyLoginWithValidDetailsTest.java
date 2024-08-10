package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.LoginEndpoint;
import io.restassured.response.Response;

public class PostToVerifyLoginWithValidDetailsTest {
	@Test
	public void postToVerifyLoginWithValidDetail() throws Exception {
		Response resp = LoginEndpoint.postToVerifyLoginWithValidDetail();
		resp.then().log().all();
		Assert.assertEquals("200", resp.jsonPath().getString("responseCode"));
//		Assert.assertEquals("200", resp.jsonPath().getString("message"));
	}
}
