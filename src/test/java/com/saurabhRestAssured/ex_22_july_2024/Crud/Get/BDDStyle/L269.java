package com.saurabhRestAssured.ex_22_july_2024.Crud.Get.BDDStyle;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class L269 {

    // Given()
    // url-
    // header-?, cookies
    // Base url: https://api.zippopotam.us
    // basePath-/IN/843314
    // Auth- no


    // When()
    // Payload - no
    // method -get



    //then()
    // Response validation
    // Status code
    // Response body
    // Time, Header, Cookies


    @Test
    public void geyRequestBDDStyle(){

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/843314")

                .when().log().all().get()

                .then()
                .log().all()
                .statusCode(200);
    }


}
