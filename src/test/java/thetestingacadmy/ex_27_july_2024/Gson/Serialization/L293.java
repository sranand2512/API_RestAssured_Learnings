package thetestingacadmy.ex_27_july_2024.Gson.Serialization;

import com.google.gson.Gson;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import thetestingacadmy.ex_27_july_2024.Gson.Serialization.Generated.Booking;
import thetestingacadmy.ex_27_july_2024.Gson.Serialization.Generated.BookingDates;

import java.util.ArrayList;

public class L293 {
    // Payload - string, map
    // Mostly used - classes and object
    // Swagger API - document, file IO binary file payload
    // Non BDD suite - framework - cucumber BDD(feature file, glue other)

    // Payload -> RA-> Class and Object -> JsonString(Who help, lib) - Serialization
    // Response -> JsonString -> class and object - De-Serialization

    @Description("Verify that TC positive is working with payload")
    @Test
    public void postRequestNonBDDStylePositive() {
        // Post
        // URL
        // Payload - json
        // Header - content type

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";

        Booking booking1 = new Booking();
        booking1.setFirstname("Saurabh");
        booking1.setLastname("Kumar");
        booking1.setTotalprice(500);
        booking1.setDepositpaid(true);

        BookingDates bookingDates1 = new BookingDates();
        bookingDates1.setCheckin("2024-02-01");
        bookingDates1.setCheckout("2024-02-10");
        booking1.setBookingdates(bookingDates1);
        booking1.setAdditionalneeds("Breakfast");


        System.out.println(booking1.toString());

        // Serialization -> Java object - jsonString

        Gson gson = new Gson();
        String jsonStringPayload = gson.toJson(booking1);
        System.out.println(jsonStringPayload);


//
//            RequestSpecification r = RestAssured.given();
//            Response response;
//            ValidatableResponse validatableResponse;
//
//            r.baseUri(BASE_URL);
//            r.basePath(BASE_PATH);
//            r.contentType(ContentType.JSON).log().all();
//            r.body(booking1);
//
//            response = r.when().log().all().post();
//
//            String s_resp = response.asString();
//            System.out.println(s_resp);
//
//            validatableResponse = response.then();
//            validatableResponse.statusCode(200);
        }
    }
