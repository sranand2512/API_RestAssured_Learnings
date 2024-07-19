package com.saurabhRestAssured.TestNG;

import io.qameta.allure.Description;
import io.restassured.RestAssured;

import org.testng.annotations.Test;

public class L261 {
    // if you have 1000+ tet cases then we can group these
    // based on type like smoke, sanity,
    // Before , after we can add the things accordingly
    @Description("261 - 1st")
    @Test
    public void getRequest(){
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")

                .when()
                .get().

                then()
                .statusCode(201);

    }
    @Description("261 - 2nd")
    @Test
    public void getRequest2(){
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
