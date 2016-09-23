Feature: Calculator operations 4
   Scenario: Call wsdl operation name='division' with params x = 6, y = 2  Verify response from service endpoint Expected is 3
    Given I get calculator client
    When I call wsdl operation name='division'  with params x=6 y=2
    Then I verify response from service for division operation Expected result 3

