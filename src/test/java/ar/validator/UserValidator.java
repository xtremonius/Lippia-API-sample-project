package ar.validator;

import api.model.project.ProjectResponse;
import api.model.user.UserloggedResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class UserValidator {

    public static void validateNotNullID(){
        UserloggedResponse response = (UserloggedResponse) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response.getId(), "El id del usuario es nulo");

    }
}
