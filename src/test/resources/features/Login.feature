Feature: Login Automation Test
  Validate the different scenarios of the login screen

  Scenario Outline: Verify user login with offer
    Given I enter the "<email>" email and "<password>" password
    When  I press LOGIN button
    Then I verify the response exists on the page

    Examples:
      | email                                           | password          |
      | conoferta20201119-03001@sso.tapit.conoferta.com | Prueba1234        |
      | conoferta20201119-03002@sso.tapit.conoferta.com | Prueba1234        |
      | conoferta20201119-03003@sso.tapit.conoferta.com | Prueba1234        |
      | conoferta20201119-03004@sso.tapit.conoferta.com | Prueba1234        |
      | conoferta20201119-03005@sso.tapit.conoferta.com | Prueba1234        |
      | conoferta20201119-03006@sso.tapit.conoferta.com | Prueba1234        |
      | conoferta20201119-03007@sso.tapit.conoferta.com | Prueba1234        |
      | conoferta20201119-03008@sso.tapit.conoferta.com | Prueba1234        |
      | conoferta20201119-03009@sso.tapit.conoferta.com | Prueba1234        |
      | conoferta20201119-03010@sso.tapit.conoferta.com | Prueba1234        |