package br.com.proffy.caller;

import br.com.proffy.requestSpecification.ProffyRequestSpecification;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ProffyService {
    public static Response buildRequestProffy(){
        return  given()
                .spec(ProffyRequestSpecification.get())
                .queryParam("weekday", 1)
                .queryParam("subject", "Matemática")
                .queryParam("time", "9:00")
                .when()
                .get();
    }
}
