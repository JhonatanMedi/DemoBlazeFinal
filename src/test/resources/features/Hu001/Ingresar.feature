#lo creo jhontan
#19/02/2022
# se va loguear los usuario con rol pruebas
Feature: ingresar a pagina demoblaze
@ingreso
  Scenario Outline: ingreso
    Given abrir el navegador
    And diligenciar los campos usuario <userName> y contraseña <password>

    Examples: 
      | userName       | password |
      | AdminJhonatan1 |     1234 |
