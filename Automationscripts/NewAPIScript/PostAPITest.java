package APItests;


import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class PostAPITest {
//https://reqres.in/api/users?page=2

    @Test
    public void test2(){


        JSONObject jsondata = new JSONObject();

        jsondata.put("name","prachi");
        jsondata.put("job","QA");

        baseURI ="https://reqres.in/api/users";
        given().header("Content-Type","application/json")
                .contentType(ContentType.JSON)
                .body(jsondata.toJSONString()).when().
                post().then()
               .statusCode(201);

    }

}
