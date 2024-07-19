package thetestingacadmy.ex_22_july_2024.Crud.Full;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class L277 {

    String token;
    Integer bookingID;
    RequestSpecification requestSpecification = RestAssured.given();
    ValidatableResponse validatableResponse;
    Response response ;

    @BeforeTest
    public void GetToken(){

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("auth");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload);

        response = requestSpecification.post();

        validatableResponse = response.then();
        validatableResponse.statusCode(200);

        // EXTRACT THE TOKEN

        token = response.then().log().all().extract().path("token");
        Assert.assertNotNull(token);
        System.out.println("Token: "+ token);


    }


    @BeforeTest
    public void GetBookingID(){

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

        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload);

        response = requestSpecification.post();

        validatableResponse = response.then();
        String responseString = response.asString();
        System.out.println("response string: "+responseString);

        validatableResponse.statusCode(200);

        // EXTRACT THE bookingID

        bookingID = response.then().log().all().extract().path("bookingid");
        Assert.assertNotNull(bookingID);
        System.out.println("BookingID: "+ bookingID);

    }


    @Test
    public void testPUTRequestPositive(){

        System.out.println("Put Request");

        String payload = "{\n" +
                "    \"firstname\": \"Saurabh\",\n" +
                "    \"lastname\": \"Kumar\",\n" +
                "    \"totalprice\": 111,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2018-01-01\",\n" +
                "        \"checkout\": \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"Breakfast\"\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking/"+bookingID);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);

        requestSpecification.body(payload).log().all();

        response = requestSpecification.when().put();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

        String firstname = response.then().log().all().extract().path("firstname");
        Assert.assertEquals(firstname,"Saurabh");

        String fullJsonResponse = response.asString();
        System.out.println("response : " +fullJsonResponse);


        // verify the all key value pair in the response
        // firstname, lastname,, deposit, total, checkin


        // For this we have 4 ways

        // 1. RA - Matchers
        validatableResponse.body("firstname", Matchers.equalTo("Saurabh"));


        // 2. TestNG Asserts
        String firstnameResponse = response.then().log().all().extract().path("firstname");
        String lastnameResponse = response.then().log().all().extract().path("lastname");
        Integer totalPrizeResponse = response.then().log().all().extract().path("totalprice");

        Assert.assertEquals(firstnameResponse,"Saurabh");
        Assert.assertEquals(lastnameResponse,"Kumar");
        Assert.assertEquals(totalPrizeResponse,111);


        // 3. TestNG Assertion with json path lib.
        JsonPath jsonpath = new JsonPath(fullJsonResponse);
        String firstnameResponseExtracted = jsonpath.getString("firstname");
        String lastnameResponseExtracted = jsonpath.getString("lastname");
        Integer totalpriceResponseExtracted = jsonpath.getInt("totalprice");
        String checkingdateExtracted = jsonpath.getString("bookingdates.checkin");

        Assert.assertEquals(firstnameResponseExtracted,"Saurabh");
        Assert.assertEquals(lastnameResponseExtracted,"Kumar");
        Assert.assertEquals(totalpriceResponseExtracted,111);
        Assert.assertEquals(checkingdateExtracted,"2018-01-01");

//        // Json Array Response
//        String checking = jsonpath.getString("[0][\"bookingdates\"][\"checkin\"]");
//        System.out.println(checking);

        // 4.Assert J Matching

        assertThat(firstnameResponseExtracted)
                .isEqualTo("Saurabh")
                .isNotBlank()
                .isNotEmpty();
        assertThat(totalpriceResponseExtracted)
                .isNotZero()
                .isNotNegative();













    }

}
