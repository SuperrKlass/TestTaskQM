package testAPI;

import io.restassured.http.ContentType;
import org.testng.annotations.*;
import static org.hamcrest.core.IsEqual.equalTo;

import static io.restassured.RestAssured.given;

public class StarshipGetTest {

    @Test
    public void getStarship() {
        given()
                .baseUri("https://swapi.dev/api/starships/9/")
                .contentType(ContentType.JSON)
                .when().get()
                .then()
                .statusCode(200)
                .body("name", equalTo("Death Star"));
    }
}
