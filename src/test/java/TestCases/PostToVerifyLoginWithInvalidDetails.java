package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.LoginEndpoint;
import io.restassured.response.Response;

public class PostToVerifyLoginWithInvalidDetails {
	@Test
	public void postToverifyWithInvalidDetails() {
		Response resp = LoginEndpoint.postToVerifyLoginWithInvalidDetails();
		resp.then().log().all();
		Assert.assertEquals("404", resp.jsonPath().getString("responseCode"));
		Assert.assertEquals("User not found!", resp.jsonPath().getString("message"));
	}
}
