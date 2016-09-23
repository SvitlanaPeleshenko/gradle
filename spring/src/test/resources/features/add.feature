   Feature: Calculator operations 1
   Scenario: Call wsdl operation name='add' with params x = 1, y = 1 Verify response from service endpoint Expected is 2
    Given I get calculator client
    When I call wsdl operation name='add' with params x=1 y=1
    Then I verify response from service endpoint for add operation Expected result 2

