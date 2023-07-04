package APItests;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class getAPITest {
//https://reqres.in/api/users?page=2

    @Test
    public void test2(){

    baseURI ="https://reqres.in/api/users";
     given().queryParam("page","2")
        .when()
        .get()
        .then()
        .statusCode(200);

    }

}
