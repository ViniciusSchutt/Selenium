#Author: viniciuschutt@gmail.com

@tag
Feature: desafio Selenium Accenture

  @tag1
  Scenario: Preencher todo o formulário e checar a mensagem 'Sending e-mail success!' na tela
    Given the user access Tricentis SampleApp web page and click in the 'Automobile' option
    And fill the form on tab 'Enter Vehicle Data' and press 'Next'
    And fill the form on tab 'Enter Insurant Data' and press 'Next'
    And fill the form on tab 'Enter Product Data' and press 'Next'
    And fill the form on tab 'Select Price Option' and press 'Next'
    When he fills the form on tab 'Send Quote' and press 'Send'
    Then the message 'Sending e-mail success!' should appear on screen