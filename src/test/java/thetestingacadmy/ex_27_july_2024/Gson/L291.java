package thetestingacadmy.ex_27_july_2024.Gson;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class L291 {
    // Payload - string, map
    // Mostly used - classes ans object
    // Swagger API - document, file IO binary file payload
    // Non BDD suite - framework - cucumber BDD(feature file, glue other)

    // Payload -> RA-> Class and Object -> JsonString(Who help, lib)- Serialization
    // Response -> JsonString -> class and object - De-Serialization


    @Test
    public void postRequestNonBDDStyleNegative() {
        // Post
        // URL
        // Payload - json
        // Header - content type

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";
        String payload = "";

        Response resp = RestAssured.given()
                .baseUri(BASE_URL)
                .basePath(BASE_PATH)
                .contentType(ContentType.JSON)
                .body(payload)
                .log().all()
                .when()
                .post();

        String s_resp = resp.asString();
        System.out.println(s_resp);

        resp.then().statusCode(500);
    }


    @Description("Verify that TC positive is working with payload")
    @Test
    public void postRequestNonBDDStylePositive() {
        // Post
        // URL
        // Payload - json
        // Header - content type

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";
        String payload = "{\n" +
                "    \"firstname\": \"Jim\",\n" +
                "    \"lastname\": \"Brown\",\n" +
                "    \"totalprice\": 111,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2018-01-01\",\n" +
                "        \"checkout\": \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"Breakfast\"\n" +
                "}";

        Response resp = RestAssured.given()
                .baseUri(BASE_URL)
                .basePath(BASE_PATH)
                .contentType(ContentType.JSON)
                .body(payload)
                .log().all()
                .when()
                .post();

        String s_resp = resp.asString();
        System.out.println(s_resp);

        resp.then().statusCode(200);
    }

}
