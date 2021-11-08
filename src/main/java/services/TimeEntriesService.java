package services;

import api.model.time_entry.TimeEntriesResponse;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;


public class TimeEntriesService extends MethodsService {

    public static final ThreadLocal<String> ID_TIME_ENTRIES = new ThreadLocal<String>();

    public static Response get(String jsonName) { return get(jsonName, TimeEntriesResponse[].class, setParams("getTimes")); }
    public static Response post(String jsonName) { return post(jsonName, TimeEntriesResponse.class, setParams("postAddTime")); }
    public static Response put(String jsonName) { return put(jsonName, TimeEntriesResponse.class, setParams("putTime")); }
    public static Response delete(String jsonName) { return delete(jsonName, TimeEntriesResponse.class, setParams("delTime")); }


    private static Map<String, String> setParams(String option){
        Map<String, String> params = new HashMap<String, String>();
        switch (option){
            case "getTimes":
                params.put("base.url", PropertyManager.getProperty("base.api.url"));
                params.put("api-key", BaseService.API_KEY.get());
                params.put("workspaceId", WorkspaceService.ID_WORKSPACE.get());
                params.put("userId", UserloggedService.ID_USER.get());
                break;
            case "postAddTime" :
                params.put("base.url", PropertyManager.getProperty("base.api.url"));
                params.put("api-key", BaseService.API_KEY.get());
                params.put("workspaceId", WorkspaceService.ID_WORKSPACE.get());
                params.put("projectId", ProjectService.ID_PROJECT.get());
                break;
            case "putTime" :
                params.put("base.url", PropertyManager.getProperty("base.api.url"));
                params.put("api-key", BaseService.API_KEY.get());
                params.put("workspaceId", WorkspaceService.ID_WORKSPACE.get());
                params.put("projectId", ProjectService.ID_PROJECT.get());
                params.put("time-id", TimeEntriesService.ID_TIME_ENTRIES.get());
                break;
            case "delTime" :
                params.put("base.url", PropertyManager.getProperty("base.api.url"));
                params.put("api-key", BaseService.API_KEY.get());
                params.put("workspaceId", WorkspaceService.ID_WORKSPACE.get());
                params.put("time-id", TimeEntriesService.ID_TIME_ENTRIES.get());
                break;
        }
        return params;

    }


}
