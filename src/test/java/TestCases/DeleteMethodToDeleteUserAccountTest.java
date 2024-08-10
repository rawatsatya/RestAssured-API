package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.DeleteEndpoint;
import io.restassured.response.Response;

public class DeleteMethodToDeleteUserAccountTest {
	@Test
	public void deleteMethodToDeleteUserAccountTest() throws Exception {
		Response resp = DeleteEndpoint.delete_MethodToDeleteUserAccount();
		resp.then().log().all();
		Assert.assertEquals("200", resp.jsonPath().getString("responseCode"));
		Assert.assertEquals("Account deleted!", resp.jsonPath().getString("message"));
	}
}
