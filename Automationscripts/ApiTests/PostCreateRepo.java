package APItests;


import org.testng.annotations.Test;

import com.testingsumo.endpoints.APIConstants;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class PostCreateRepo extends BaseTest {

	//private static Logger Log = (Logger) LogManager.getLogger(PostCreateRepo.class.getName());

	@Test()
	@Owner("Promode")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify that Status code is 200 when we Create a new GitHub RequestPayloads of User")
	public void testPostCreateRepoOfUser() {
		Response response = RestAssured.given().spec(repoSpec).when().body(requestPayload.getRepoCreatePayLoad())
				.post(APIConstants.createRepo);

		response.getBody().asString();
		 assertActions.verifyResponseBody(apiActions.getDataFromJsonPath(response,
		  "a"), "null", "verify body data");
		  assertActions.verifyStatusCode(response);
	}

}
