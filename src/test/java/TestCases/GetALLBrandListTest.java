package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Endpoints.BrandListEndpoint;
import io.restassured.response.Response;

@Test
public class GetALLBrandListTest {
	public void getAllBrandList() {
		Response resp = BrandListEndpoint.getAllBrandList();
		resp.then().log().all();
		Assert.assertEquals(200, resp.getStatusCode());
		Assert.assertEquals("200", resp.jsonPath().getString("responseCode"));
	}
}
