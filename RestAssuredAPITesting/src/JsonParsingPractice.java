import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.path.json.JsonPath;

public class JsonParsingPractice {

	public static void main(String[] args) {

		String json = "{\r\n" + "  \"dashboard\": {\r\n" + "    \"purchaseAmount\": 910,\r\n"
				+ "    \"website\": \"rahulshettyacademy.com\"\r\n" + "  },\r\n" + "  \"courses\": [\r\n" + "    {\r\n"
				+ "      \"title\": \"Selenium Python\",\r\n" + "      \"price\": 50,\r\n" + "      \"copies\": 6\r\n"
				+ "    },\r\n" + "    {\r\n" + "      \"title\": \"Cypress\",\r\n" + "      \"price\": 40,\r\n"
				+ "      \"copies\": 4\r\n" + "    },\r\n" + "    {\r\n" + "      \"title\": \"RPA\",\r\n"
				+ "      \"price\": 45,\r\n" + "      \"copies\": 10\r\n" + "    }\r\n" + "  ]\r\n" + "}";

		JsonPath jp = new JsonPath(json);

		int purchaseAmount = jp.getInt("dashboard.purchaseAmount");
		System.out.println("Purchased Amount :: " + purchaseAmount);

		int noCourses = jp.getList("courses").size();
		System.out.println("No of courses :: " + noCourses);
		System.out.println("No of courses :: " + jp.getInt("courses.size()"));

		String firstCourse = jp.getList("courses.title").get(0).toString();
		System.out.println("First course title :: " + firstCourse);
		System.out.println("First course title :: " + jp.get("courses[0].title"));

		List<Object> courses = jp.getList("courses");
		int purchasePrice = 0;
		int coursePrice = 0;
		for (int i = 0; i < courses.size(); i++) {
			coursePrice = jp.getInt("courses[" + i + "].price") * jp.getInt("courses[" + i + "].copies");
			purchasePrice += coursePrice;
			String title = jp.get("courses[" + i + "].title");
			System.out.println("Course price :: " + coursePrice);
			System.out.println("Course title :: " +  title);
			if(title.equalsIgnoreCase("RPA")) {
				System.out.println("No of copies for RPA :: "+jp.get("courses[" + i + "].copies"));
			}
		}
		System.out.println("Purchased price :: " + purchasePrice);
	}

}
