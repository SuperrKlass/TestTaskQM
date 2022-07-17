package testAPI;

import io.restassured.http.ContentType;
import org.testng.annotations.*;

import static constants.ApiConstants.*;
import static org.hamcrest.core.IsEqual.equalTo;

import static io.restassured.RestAssured.given;

public class StarshipGetTest {

    @Test
    public void getStarship() {
        given()
                .baseUri(STARSHIP_GET_URL)
                .contentType(ContentType.JSON)
                .when().get()
                .then()
                .statusCode(200)
                .body("name", equalTo("Death Star"));
    }
}
