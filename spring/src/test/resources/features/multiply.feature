Feature: Calculator operations

   Scenario: Call wsdl operation name='add' with params x = 1, y = 1 Verify response from service endpoint Expected is 2
    Given I get calculator client
    When I call wsdl operation name='add' with params x=1 y=1
    Then I verify response from service endpoint for add operation Expected result 2

   Scenario: Call wsdl operation name='subtract' with params x = 6, y = 2 Verify response from service endpoint Expected is 4
    Given I get calculator client
    When I call wsdl operation name='subtract' with params x=6 y=2
    Then I verify response from service for subtract operation Expected result 4


   Scenario: Call wsdl operation name='multiply' with params x = 6, y = 2 Verify response from service endpoint Expected is 12
    Given I get calculator client
    When I call wsdl operation name='multiply' with params x=6 y=2
    Then I verify response from service for multiply operation Expected result 12


   Scenario: Call wsdl operation name='division' with params x = 6, y = 2  Verify response from service endpoint Expected is 3
    Given I get calculator client
    When I call wsdl operation name='division'  with params x=6 y=2
    Then I verify response from service for division operation Expected result 3

