package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.CreateAndUpdateUserAccountEndPoint;
import io.restassured.response.Response;

public class PutMethodToUpdateUserAccountTest {
	@Test
	public void putMethodToUpdateUserAccount() throws Exception {
		Response resp = CreateAndUpdateUserAccountEndPoint.putMethodToUpdateUserAccount();
		resp.then().log().all();
		Assert.assertEquals("200", resp.jsonPath().getString("responseCode"));
		Assert.assertEquals("User updated!", resp.jsonPath().getString("message"));
	}
}
