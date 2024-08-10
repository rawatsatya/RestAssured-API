package Endpoints;
import static io.restassured.RestAssured.when;

import io.restassured.response.Response;

public class ProductListEndpoint {
	public static Response getAllProductList() {
		Response resp = when().get(Routes.get_all_product_list);
		return resp;
	}
	
	public static Response postAllProductList() {
		Response resp = when().post(Routes.post_to_all_product_list);
		return resp;
	}
}
