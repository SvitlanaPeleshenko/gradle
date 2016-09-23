Feature: Calculator operations 2
  Scenario: Call wsdl operation name='subtract' with params x = 6, y = 2 Verify response from service endpoint Expected is 4
    Given I get calculator client
    When I call wsdl operation name='subtract' with params x=6 y=2
    Then I verify response from service for subtract operation Expected result 4

