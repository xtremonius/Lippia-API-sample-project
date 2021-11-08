package ar.steps;

import api.model.project.ProjectResponse;
import ar.validator.ProjectValidator;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.BaseService;
import services.ProjectModificarService;
import services.ProjectService;
import services.WorkspaceService;

public class ProjectSteps extends PageSteps {

    @And("^un nombre de proyecto (.*)$")
    public void unNombreDeProyectoName(String name) {
        BaseService.NAME.set(name);
    }

    @Then("^Obtengo los datos de mi Proyecto (.*)$")
    public void obtengoLosDatosDeMiProyectoName(String name) {
        ProjectValidator.validate(name);
    }

    @And("un id workspace valido")
    public void unIdWorkspaceValido() {
        WorkspaceService.ID_WORKSPACE.set("618154b36dfb2f271e0ebc6f");
    }

    @And("guardo el id del proyecto")
    public void guardoElIdDelProyecto() {
        ProjectResponse response = (ProjectResponse) APIManager.getLastResponse().getResponse();
        ProjectService.ID_P.set(response.getId());
    }

    @And("un id project valido")
    public void unIdProjectValido() {
        ProjectService.ID_PROJECT.set("618194f0f2b31e2d3274c95a");
    }
}
