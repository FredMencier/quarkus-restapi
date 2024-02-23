package org.test;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class GreetingResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
            .queryParam("contractRef", 1234)
            .when().post("/admin/treasury/pushforward")
            .then().statusCode(204);
    }

}