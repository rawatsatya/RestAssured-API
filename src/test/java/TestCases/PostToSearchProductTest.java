package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Endpoints.SearchProductEndpoint;
import Payloads.SearchProductPayloads;
import io.restassured.response.Response;

public class PostToSearchProductTest {
	
	@Test
	public void postToSearchProduct() {
		Response resp = SearchProductEndpoint.postToSearchProduct();
		resp.then().log().all();
		Assert.assertEquals(resp.jsonPath().getString("responseCode"), "200");
	}
}
