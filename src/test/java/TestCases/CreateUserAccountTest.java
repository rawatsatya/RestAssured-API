package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.CreateAndUpdateUserAccountEndPoint;
import io.restassured.response.Response;

public class CreateUserAccountTest {
	@Test
	public void createUserAccount() throws Exception {
		Response resp = CreateAndUpdateUserAccountEndPoint.createUseraccount();
		resp.then().log().all();
		Assert.assertEquals("201", resp.jsonPath().getString("responseCode"));
		Assert.assertEquals("User created!", resp.jsonPath().getString("message"));
		
	}
}
