package com.saurabhRestAssured.ex_27_july_2024.jsonschemavalidation;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import java.io.File;

public class L297 {
    @Test
    public void JSValidation(){
        RestAssured.given()
                .baseUri("https://jsonplaceholder.typicode.com/post/2")
                .when().get().then().assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(new File("C:\\Users\\sanan\\IdeaProjects\\ATB6xRestAssured\\src\\test\\java\\thetestingacadmy\\ex_27_july_2024\\jsonschemavalidation\\schema.json")));

    }
}
