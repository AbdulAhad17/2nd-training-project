Feature: submit a Registration from with valid data

@Registration
  Scenario Outline: Fill Registration Form
    Given I am on Ecommerce website
    When I click on Registration link
    And I filled the Registration with "<email>", "<typeyouremailagain>", "<password>" and "<typeYourPasswordagain>"
    Then User Registration successfully created

    Examples:
      | email                    | typeyouremailagain  | password |  typeYourPasswordagain |
      | abc@mailinator.com       | abc@mailinator.com | 12345678a | 12345678a              |
