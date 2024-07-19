package thetestingacadmy.ex_22_july_2024.Crud.Put;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class L273 {


    RequestSpecification rs = RestAssured.given();
    Response res ;
    ValidatableResponse vr;
    String token = "8e28f713b6cc862";
    String BookingId = "/07";

    String BASE_URL = "https://restful-booker.herokuapp.com";
    String BASE_PATH = "/booking";


    @Test
    public void testPutRequestNonBDD(){
        String BASE_PATH_up = BASE_PATH + BookingId;
        System.out.println(BASE_PATH_up);

        String payload = "{\n" +
                "    \"firstname\" : \"Saurabh\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 15000,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2014-01-01\",\n" +
                "        \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        rs.baseUri(BASE_URL);
        rs.basePath(BASE_PATH_up);
        rs.contentType(ContentType.JSON);
        rs.cookie("token",token);
        rs.body(payload).log().all();

        res = rs.when().log().all().put();

        vr = res.then().log().all();
        vr.statusCode(200);
        vr.body("firstname", Matchers.equalTo("Saurabh"));
        vr.body("lastname", Matchers.equalTo("Brown"));



    }



}
