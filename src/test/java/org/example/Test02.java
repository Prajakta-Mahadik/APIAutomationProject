package org.example;

import io.restassured.RestAssured;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("REST ASSURE GET Request Demo");

        // Gherkins Syntax
//        given() - url, headers, body or payload
//        when() - http methods - get, post, patch, put, delete
//        then() - verify the response - expected result == actual result

        RestAssured
                .given()
                  .baseUri("https://restful-booker.herokuapp.com")
                  .basePath("/booking/1").log().all()
                .when()
                   .get()
                .then().log().all()
                   .statusCode(200);
    }
}
