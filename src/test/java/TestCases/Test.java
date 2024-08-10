package TestCases;

import java.util.HashMap;

import Utilities.ExcelUtility;

public class Test {
	public static void main(String[] args) throws Exception {
		HashMap<String, String> data = mapData();
		System.out.println(data);
	}
	public static HashMap<String, String> mapData() throws Exception {
		String path = "C:\\Users\\Rawat\\eclipse-workspace\\Swagger_API_Automation\\data\\user.xlsx";
		ExcelUtility xlutil = new ExcelUtility(path);
		int totalrows = xlutil.getRowCount("Sheet1");
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i = 2;i<=totalrows;i++) {
			map.put(xlutil.getCellData("Sheet1", i, 0),xlutil.getCellData("Sheet1", i, 1));
		}
		return map;
	}
}
