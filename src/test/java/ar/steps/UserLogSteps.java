package ar.steps;

import api.model.user.UserloggedResponse;
import ar.validator.UserValidator;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import services.BaseService;
import services.UserloggedService;

public class UserLogSteps {
    @And("valido que el campo id no sea nulo")
    public void validoQueElCampoIsNoSeaNulo() {
        UserValidator.validateNotNullID();
    }

    @Given("un X-Api-Key valido")
    public void unXApiKeyValido() {
        BaseService.API_KEY.set("NWI3NGNkOTAtYjljZi00MzM4LWI5MjMtNjI1ZDgxMDYxNzFm");
    }

    @And("guardo el id del usuario")
    public void guardoElIdDelUsuario() {
        UserloggedResponse response = (UserloggedResponse) APIManager.getLastResponse().getResponse();
        UserloggedService.ID_USER.set(response.getId());
    }
}
