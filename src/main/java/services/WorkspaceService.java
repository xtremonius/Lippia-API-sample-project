package services;

import api.model.workspace.WorkspacesResponse;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class WorkspaceService extends MethodsService {

    public static final ThreadLocal<String> API_KEY = new ThreadLocal<String>();


    public static Response get(String jsonName) {
        return get(jsonName, WorkspacesResponse[].class,setParams());
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("api-key",API_KEY.get());
        return params;
    }

}
