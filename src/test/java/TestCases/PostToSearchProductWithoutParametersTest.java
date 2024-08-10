package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.SearchProductEndpoint;
import io.restassured.response.Response;

public class PostToSearchProductWithoutParametersTest {
	@Test
	public void postToSearchProductWithoutParameter() {
		Response resp = SearchProductEndpoint.postTosearchProductwithoutParameters();
		resp.then().log().all();
		Assert.assertEquals("400", resp.jsonPath().getString("responseCode"));
		Assert.assertEquals("Bad request, search_product parameter is missing in POST request.", resp.jsonPath().getString("message"));
	}
}	
