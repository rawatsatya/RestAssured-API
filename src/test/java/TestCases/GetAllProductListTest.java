package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import Endpoints.ProductListEndpoint;
import io.restassured.response.Response;

public class GetAllProductListTest {
	@Test
	public void getAllProductListTest() {
		Response resp = ProductListEndpoint.getAllProductList();
		 resp.then().log().all();
		 Assert.assertEquals(200, resp.getStatusCode());
	}
}
