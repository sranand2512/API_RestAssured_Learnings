package thetestingacadmy.ex_27_july_2024.Gson.Serialization;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import thetestingacadmy.ex_27_july_2024.Gson.Serialization.Generated.Booking;
import thetestingacadmy.ex_27_july_2024.Gson.Serialization.Generated.BookingDates;

public class L292 {
    // Payload - string, map
    // Mostly used - classes ans object
    // Swagger API - document, file IO binary file payload
    // Non BDD suite - framework - cucumber BDD(feature file, glue other)

    // Payload -> RA-> Class and Object -> JsonString(Who help, lib)- Serialization
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

        Booking booking = new Booking();
        booking.setFirstname("Saurabh");
        booking.setLastname("Kumar");
        booking.setTotalprice(500);
        booking.setDepositpaid(true);

        BookingDates bookingDates = new BookingDates();
        bookingDates.setCheckin("2024-02-01");
        bookingDates.setCheckout("2024-02-10");
        booking.setBookingdates(bookingDates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking.toString());

        RequestSpecification r = RestAssured.given();
        Response response;
        ValidatableResponse validatableResponse;


        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH);
        r.contentType(ContentType.JSON).log().all();
        r.body(booking);

        response = r.when().log().all().post();

        String s_resp = response.asString();
        System.out.println(s_resp);

        validatableResponse = response.then();
        validatableResponse.statusCode(200);
   }

}
