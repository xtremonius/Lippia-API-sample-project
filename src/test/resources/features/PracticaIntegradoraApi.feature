Feature: Integrador
  COMO alumno de Crowdar
  QUIERO resolver los 5 puntos del Ejercicio Integrador


  @IntegradorApi
  Scenario Outline: 1) Consultar las horas registradas en el workspace del usuario logueado.
    Given un X-Api-Key valido
    And un id workspace valido
    When I perform a 'GET' to 'USER_LOGGED' endpoint with the 'users/rq' and ''
    Then se obtuvo el status code <status>
    And valido que el campo id no sea nulo
    And guardo el id del usuario
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>
    @Integrador
    Examples:
      | operation | entity                    | jsonName           | status |
      | GET       | TIME_ENTRIES_ON_WORKSPACE | time_entry/rq      | 200    |


  @IntegradorApi
  Scenario Outline: 2) Agregar horas al proyecto elegido.
    Given un X-Api-Key valido
    And un id workspace valido
    And un id project valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>
    And guardo el id de la hora cargada al proyecto
    @Integrador
    Examples:
      | operation  | entity                      | jsonName               | status |
      | POST       | ADD_TIME_ENTRY_TO_WORKSPACE | time_entry/rq_add      | 201    |


  @IntegradorApi
  Scenario Outline: 3) Editar la hora registrada en el item anterior.
    Given un X-Api-Key valido
    And un id workspace valido
    And un id project valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>
    @Integrador
    Examples:
      | operation  | entity                         | jsonName               | status |
      | PUT        | UPDATE_TIME_ENTRY_TO_WORKSPACE | time_entry/rq_put      | 200    |


  @IntegradorApi
  Scenario Outline: 4) Consultar las horas registradas en el workspace del usuario logueado.
    Given un X-Api-Key valido
    And un id workspace valido
    When I perform a 'GET' to 'USER_LOGGED' endpoint with the 'users/rq' and ''
    Then se obtuvo el status code <status>
    And valido que el campo id no sea nulo
    And guardo el id del usuario
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>
    @Integrador
    Examples:
      | operation | entity                    | jsonName           | status |
      | GET       | TIME_ENTRIES_ON_WORKSPACE | time_entry/rq      | 200    |


  @IntegradorApi
  Scenario Outline: 5) Eliminar hora registrada en el ítem 2.
    Given un X-Api-Key valido
    And un id workspace valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>
    @Integrador
    Examples:
      | operation  | entity                           | jsonName               | status |
      | DELETE     | DELETE_TIME_ENTRY_FROM_WORKSPACE | time_entry/rq_del      | 204    |
