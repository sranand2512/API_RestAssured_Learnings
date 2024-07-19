package com.saurabhRestAssured.ex_22_july_2024.Crud.Get.NonBDDStyle;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class L270 {

    @Test
    public void getRequestNonBDDStyle(){
        RequestSpecification rs = RestAssured.given();
        rs.baseUri("https://api.zippopotam.us");
        rs.basePath("/IN/843314");

        rs.when().log().all().get();

        rs.then().log().all().statusCode(200);

    }
}
