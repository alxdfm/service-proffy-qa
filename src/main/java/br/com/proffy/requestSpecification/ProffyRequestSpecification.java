package br.com.proffy.requestSpecification;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class ProffyRequestSpecification {
    private static final String BASEURI = "http://localhost:3333";
    private static final String BASEPATH = "/classes";

    public static RequestSpecification get(){
        return new RequestSpecBuilder().setConfig(
                new RestAssuredConfig().sslConfig(new SSLConfig().relaxedHTTPSValidation())
        )
        .setContentType(ContentType.JSON)
        .setBaseUri(BASEURI)
        .setBasePath(BASEPATH)
        .log(LogDetail.ALL)
        .addFilter(new ResponseLoggingFilter())
        .build();
    }
}
