package thetestingacadmy.ex_22_july_2024.Crud.Get;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class L270 {

    @Test
    public void getRequestPositive(){

        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/2002").log().all();
        r.when().get();
        r.then().log().all().statusCode(200);

    }
    @Test
    public void getRequestNegative(){

        RequestSpecification r1 = RestAssured.given();
        r1.baseUri("https://restful-booker.herokuapp.com");
        r1.basePath("/booking/-1").log().all();
        r1.when().get();
        r1.then().log().all().statusCode(404);

    }




}
