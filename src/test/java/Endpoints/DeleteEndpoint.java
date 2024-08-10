package Endpoints;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import Utilities.ExcelUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class DeleteEndpoint {
	public static Response delete_MethodToDeleteUserAccount() throws Exception {
		HashMap<String, String> data = ExcelUtility.mapData();
		Response resp = given()
				.accept(ContentType.JSON)
				.contentType(ContentType.MULTIPART)
				.multiPart("email",data.get("email"))
				.multiPart("password",data.get("password"))
				.when().delete(Routes.delete_account);
		return resp;
	}
}
