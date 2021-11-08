package services;

import api.model.Data;
import api.model.UserCreated;
import api.model.user.UserloggedResponse;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;


public class UserloggedService extends MethodsService {

    public static final ThreadLocal<String> ID_USER = new ThreadLocal<String>();

    public static Response get(String jsonName) { return get(jsonName, UserloggedResponse.class, setParams()); }


    private static Map<String, String> setParams(){
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key", BaseService.API_KEY.get());
        return params;
    }


}
