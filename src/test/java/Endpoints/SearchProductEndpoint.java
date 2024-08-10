package Endpoints;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import Payloads.SearchProductPayloads;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SearchProductEndpoint {
	public static Response postToSearchProduct() {
		Response resp = given()
				.accept(ContentType.JSON)
				.contentType(ContentType.MULTIPART)
				.multiPart("search_product","top")
		.when()
			.post(Routes.post_to_search_product);
		return resp;
	}
	
	public static Response postTosearchProductwithoutParameters() {
		Response resp = given()
		.accept(ContentType.JSON)
		.contentType(ContentType.MULTIPART)
		.when().post(Routes.post_to_search_product_without_parameter);
		
		return resp;
	}
}
