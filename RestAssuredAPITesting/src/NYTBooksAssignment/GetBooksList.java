package NYTBooksAssignment;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class GetBooksList {
	static String response = "";
	static JsonPath jp = null;

	@Test
	public void getBooksList() {
		RestAssured.baseURI = "https://api.nytimes.com";
		response = given().log().all().queryParam("api-key", "GRFxJsal7tZLp5GT8GfKDzVb0UKcwBrZ")
				.queryParam("list", "hardcover-fiction").when().get("svc/books/v3/lists.json")
				.then().assertThat().statusCode(200)
				.extract().response().asString();
		System.out.println("\n\nResponse :: " + response);
		jp = new JsonPath(response);
	}

	@Test
	public void noOfResultTest() {
		int noOfResult = jp.get("num_results");
		System.out.println("Number of results :: " + noOfResult);
		Assert.assertEquals(noOfResult, 15);
	}
	
	@Test
	public void processBooksList() {
		List<Object> books = jp.getList("results.book_details.title");
		for (Object object : books) {
			System.out.println("Books :: "+object.toString());
			Assert.assertNotNull(object);
		}
	}
	
	

}
