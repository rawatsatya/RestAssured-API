package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.ProductListEndpoint;
import io.restassured.response.Response;

public class PostAllProductListTest {
	
	@Test
	public void postAllProductList() {
		Response resp = ProductListEndpoint.postAllProductList();
		resp.then().log().all();
		Assert.assertEquals(resp.getStatusCode(),200);
		Assert.assertEquals("405",resp.jsonPath().getString("responseCode"));
		Assert.assertEquals(resp.jsonPath().getString("message"), "This request method is not supported.");
	}
}
