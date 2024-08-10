package Endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import Utilities.ExcelUtility;
public class LoginEndpoint {
	HashMap<String, String> data;
	public static Response postToVerifyLoginWithValidDetail() throws Exception {
		HashMap<String, String> data = ExcelUtility.mapData();
		Response resp = given().accept(ContentType.JSON)
				.contentType(ContentType.MULTIPART)
				.multiPart("email",data.get("email"))
				.multiPart("password",data.get("password"))
				.when().post(Routes.login_with_valid_details);
				
		return resp;
	}
	public static Response postToVerifyLoginWithoutEmailParameter() {
		Response resp = given().accept(ContentType.JSON)
				.contentType(ContentType.MULTIPART)
				.multiPart("password","sandip@30")
				.when().post(Routes.login_with_valid_details);
				
		return resp;
	}
	
	public static Response postToVerifyLoginWithInvalidDetails() {
		Response resp = given().accept(ContentType.JSON)
				.contentType(ContentType.MULTIPART)
				.multiPart("email","rawatsatyam301998@bandhanbank.com")
				.multiPart("password","sandip@16")
				.when().post(Routes.login_with_valid_details);
		return resp;
	}
	
	
}
