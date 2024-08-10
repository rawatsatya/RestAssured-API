package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.LoginEndpoint;
import io.restassured.response.Response;

public class PostToVerifyLoginWithoutEmailParameter {
	@Test
	public void postToVerifyLoginWithoutEmailParameter() {
		Response resp = LoginEndpoint.postToVerifyLoginWithoutEmailParameter();
		resp.then().log().all();
		Assert.assertEquals("400", resp.jsonPath().getString("responseCode"));
		Assert.assertEquals("Bad request, email or password parameter is missing in POST request.", resp.jsonPath().getString("message"));
	}
}
