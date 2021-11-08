package ar.steps;

import api.model.time_entry.TimeEntriesResponse;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.And;
import services.TimeEntriesService;

public class TimeEntrySteps {
    @And("guardo el id de la hora cargada al proyecto")
    public void guardoElIdDeLaHoraCargadaAlProyecto() {
        TimeEntriesResponse response = (TimeEntriesResponse) APIManager.getLastResponse().getResponse();
        TimeEntriesService.ID_TIME_ENTRIES.set(response.getId());

    }


}
