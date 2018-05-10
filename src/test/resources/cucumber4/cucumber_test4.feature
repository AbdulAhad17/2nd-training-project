Feature: Submit a valid contact form

  Scenario: Submit a form with valid data
    Given I am on Facebook registration form
    When I navigate to the Registration page
    And I submit the form with valid data
      | Field            | Value                 |
      | First Name       | test18                |
      | Last Name        | test18                |
      | Email            | test18@mailinator.com |
      | Mobile Number    | 03453356678           |
      | Password         | 12345678a             |
      | Confirm Password | 12345678a             |

    Then I check the form has been submitted



