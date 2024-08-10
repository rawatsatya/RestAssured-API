package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.BrandListEndpoint;
import Endpoints.ProductListEndpoint;
import io.restassured.response.Response;

public class PutToAllBrandList {
	@Test
	public void putToAllBrandList() {
		Response resp=BrandListEndpoint.putAllBrandList();
		resp.then().log().all();
		Assert.assertEquals(resp.getStatusCode(),200);
		Assert.assertEquals("401",resp.jsonPath().getString("responseCode"));
		Assert.assertEquals(resp.jsonPath().getString("message"), "This request method is not supported.");
	}
}
