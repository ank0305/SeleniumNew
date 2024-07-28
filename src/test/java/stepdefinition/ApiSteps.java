package stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiSteps {



        @Given("when user pings the base URL")
                public void apiPing(){
            given().
                    when().get("https://reqres.in/");

        }

    @Then("status code is 200")
            public void statusCode(){
        given().
                when().get("https://reqres.in/api/users?page=2").then().
                assertThat().statusCode(200);



            }


}
