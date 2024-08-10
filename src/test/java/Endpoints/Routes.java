package Endpoints;

public class Routes {
	static String base_url = "https://automationexercise.com";
	
	//Product List
	public static String get_all_product_list  = base_url+"/api/productsList";
	public static String post_to_all_product_list = base_url+"/api/productsList";
	
	//Brand List
	public static String get_all_brand_List = base_url+"/api/brandsList";
	public static String put_to_all_brand_List = base_url+"/api/brandsList";
	
	//SearchProduct
	public static String post_to_search_product = base_url+"/api/searchProduct";
	public static String post_to_search_product_without_parameter = base_url+"/api/searchProduct";
	
	//Create User
	public static String create_user = base_url+"/api/createAccount";
	
	//Login
	public static String login_with_valid_details = base_url+"/api/verifyLogin";
	//Update Account
	public static String update_account = base_url+"/api/updateAccount";
	//User Account Detail By Email
	public static String get_user_account_detail = base_url+"/api/getUserDetailByEmail";
	
	//Delete Account
	public static String delete_account = base_url+"/api/deleteAccount";
}

