package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.CreateAndUpdateUserAccountEndPoint;
import io.restassured.response.Response;

public class GetUserAccountDetailByEmail {
	@Test
	public void getUserAccountDetailByEmail() throws Exception {
		Response resp = CreateAndUpdateUserAccountEndPoint.getUserAccountDetailByEmail();
		resp.then().log().all();
		Assert.assertEquals("200", resp.jsonPath().getString("responseCode"));
	}
}
