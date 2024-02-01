Feature: Búsqueda en Airbnb

  @test
  Scenario: Búsqueda de hospedaje

    Given me encuentro en la pagina inicio de sesion y cierro la ventana
    When se visualiza pagina principal, e ingreso el lugar o hospedaje a buscar en la ventana de texto
    And busco "Hoteles en Vichayito"
    And hago clic en el boton skip
    And hago clic en Search
    And hago clic en icono Map
    Then valido el texto "Over 1,000 places"