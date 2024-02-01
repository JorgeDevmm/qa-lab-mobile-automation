Feature: Búsqueda en Airbnb

  @test
  Scenario: Búsqueda simple de hospedaje

    Given que me enuentro en el login de Airbnb
#    When busco "Cancun Mexico"
    When busco "Hoteles en Vichayito"
    And hago clic en el boton skip
    And hago clic en Search
    And hago clic en icono Map
#    Then muestra el texto "Over 1,000 places"