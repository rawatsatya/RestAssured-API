package Endpoints;
import static io.restassured.RestAssured.when;

import io.restassured.response.Response;

public class BrandListEndpoint {
	public static Response getAllBrandList() {
		 Response resp = when().get(Routes.get_all_brand_List);
		 return resp;
	}
	public static Response putAllBrandList() {
		Response resp = when().put(Routes.put_to_all_brand_List);
		return resp;
	}
}
