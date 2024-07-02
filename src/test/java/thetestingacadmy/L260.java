package thetestingacadmy;

import io.restassured.RestAssured;

public class L260 {
    public static void main(String[] args) {

        // Rest assured Hello world program

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")

                .when()
                .get().

                then()
                .statusCode(201);

    }

}
