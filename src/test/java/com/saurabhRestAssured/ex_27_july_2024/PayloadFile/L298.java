package com.saurabhRestAssured.ex_27_july_2024.PayloadFile;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.io.File;

public class L298 {
    @Test
    public void testPostReq() {

        RequestSpecification r = RestAssured.given();
        Response response;
        ValidatableResponse validatableResponse;

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";

        File file = new File("C:\\Users\\sanan\\IdeaProjects\\ATB6xRestAssured\\src\\test\\java\\thetestingacadmy\\ex_27_july_2024\\PayloadFile\\paylod.json");

        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH);
        r.contentType(ContentType.JSON).log().all();
        r.body(file);

        response = r.when().log().all().post();

        String s_resp = response.asString();
        System.out.println(s_resp);

        validatableResponse = response.then();
        validatableResponse.statusCode(200);
    }

}
