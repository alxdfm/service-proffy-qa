package br.com.proffy;

import br.com.proffy.builder.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import static br.com.proffy.caller.ProffyService.buildRequestProffy;
import static dataCenter.ProffyDataCenter.selectUser;
import static org.hamcrest.CoreMatchers.is;

public class ProffyUserTest {

    @Test
    public void sholShowUserWithResponseRestAssured() {
        buildRequestProffy()
                .then()
                .statusCode(200)
                .body("name[0]", is("Luciano Moraes Jr."));
    }

    @Test
    public void sholShowUserWithResponseRestAssured2() {
        User usuarioBancoDeDados = selectUser();

        User[] userResponse = buildRequestProffy()
                .then()
                .statusCode(200)
                .extract().as(User[].class);

        Assert.assertEquals(usuarioBancoDeDados, userResponse[0]);

    }
}