package Other_Projects.DemoProjects;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APITest_REST_Assured {
    @Test
    public void getUserList() {
        RestAssured.baseURI = "https://reqres.in/api";

        given()
                .when()
                .get("/users?page=2")
                .then()
                .statusCode(200)
                .body("data.size()", greaterThan(0))
                .log().body();
    }
}

