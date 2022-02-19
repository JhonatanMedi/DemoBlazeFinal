#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
@Regresion
Feature: Registro en la pagina demo blaze

  @Caso1
  Scenario Outline: registrarme
    Given abrir el navegador
    And al diligenciar los campos usuario <userName>

    Examples: 
      | userName |
      | Hola     |
      | chao     |

  @Caso2
  Scenario Outline: registrarme
    Given abrir el navegador
    And al diligenciar los campos usuario <userName> y contraseña <password>

    Examples: 
      | userName       | password |
      | AdminJhonatan1 |     1234 |
