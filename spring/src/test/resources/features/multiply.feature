Feature: Calculator operations 3
  Scenario: Call wsdl operation name='multiply' with params x = 6, y = 2 Verify response from service endpoint Expected is 12
    Given I get calculator client
    When I call wsdl operation name='multiply' with params x=6 y=2
    Then I verify response from service for multiply operation Expected result 12


