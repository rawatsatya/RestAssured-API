package Endpoints;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import Utilities.ExcelUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class CreateAndUpdateUserAccountEndPoint {
	public static Response createUseraccount() throws Exception {
		HashMap<String, String> data = ExcelUtility.mapData();
		Response resp = given()
		.accept(ContentType.JSON)
		.contentType(ContentType.MULTIPART)
		.multiPart("name",data.get("name"))
		.multiPart("email",data.get("email"))
		.multiPart("password",data.get("password"))
		.multiPart("title",data.get("title"))
		.multiPart("birth_date",data.get("day"))
		.multiPart("birth_month",data.get("Month"))
		.multiPart("birth_year",data.get("year"))
		.multiPart("firstname",data.get("first_name"))
		.multiPart("lastname",data.get("last_name"))
		.multiPart("company",data.get("company"))
		.multiPart("address1",data.get("address_1"))
		.multiPart("address2",data.get("address_2"))
		.multiPart("country",data.get("country"))
		.multiPart("zipcode",data.get("zipcode"))
		.multiPart("state",data.get("state"))
		.multiPart("city",data.get("city"))
		.multiPart("mobile_number",data.get("mobile_number"))
		.when().post(Routes.create_user);
		
		return resp;
	}
	public static Response putMethodToUpdateUserAccount() throws Exception {
		HashMap<String, String> data = ExcelUtility.mapData();
		Response resp = given()
				.accept(ContentType.JSON)
				.contentType(ContentType.MULTIPART)
				.multiPart("name",data.get("name"))
				.multiPart("email",data.get("email"))
				.multiPart("password",data.get("password"))
				.multiPart("title",data.get("title"))
				.multiPart("birth_date",data.get("day"))
				.multiPart("birth_month",data.get("Month"))
				.multiPart("birth_year",data.get("year"))
				.multiPart("firstname",data.get("first_name"))
				.multiPart("lastname",data.get("last_name"))
				.multiPart("company",data.get("company"))
				.multiPart("address1",data.get("updated_address_1"))
				.multiPart("address2",data.get("updated_address_2"))
				.multiPart("country",data.get("country"))
				.multiPart("zipcode",data.get("zipcode"))
				.multiPart("state",data.get("state"))
				.multiPart("city",data.get("city"))
				.multiPart("mobile_number",data.get("mobile_number"))
				.when().put(Routes.update_account);
		return resp;
	}
	
	public static Response getUserAccountDetailByEmail() throws Exception {
		HashMap<String, String> data = ExcelUtility.mapData();
		Response resp = given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.queryParam("email",data.get("email"))
				.when().get(Routes.get_user_account_detail);
		return resp;
	}
}
