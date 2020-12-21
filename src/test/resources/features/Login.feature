@Login
Feature: Login Automation Test
  Validate the different scenarios of the login screen

  @useTagTest
  Scenario Outline: Verify user login with offer
    Given I enter the "<email>" email and "<password>" password
    When  I press LOGIN button
    Then I verify the response exists on the page

    Examples:
      | email                                           | password          |
      | conoferta20201119-03001@sso.tapit.conoferta.com | Prueba1234        |
      | conoferta20201119-03002@sso.tapit.conoferta.com | Prueba1234        |
      | conoferta20201119-03002@sso.tapit.conoferta.com | Prueba1234        |