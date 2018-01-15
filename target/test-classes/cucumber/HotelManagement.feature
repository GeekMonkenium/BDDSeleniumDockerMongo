@HotelManagement
Feature: As a Hotel Management Platform User, I want to perform CRUD operations

  Background:
    Given the user go to the Hotel Management Platform

  @CreateHotel
  Scenario Outline: Verify admin can register a hotel
    Given the user go to the Hotel Management Platform
    And user logs in as <UserName> into the system with password <Password>
    And user logs in successfully
    When the user creates a hotel as hotel
        | Hotel Name  | <Hotel Name>  |
        | Address     | <Address>     |
        | Owner       | <Owner>       |
        | Phone number| <PhoneNumber> |
        | Email       | <Email>       |
    And the user selects create
    Then <Hotel Name> is created successfully
    When the user deletes <Hotel Name>
    And the user logs out

    Examples:
      |UserName|Password|Hotel Name   |Address        | Owner	    |PhoneNumber	|Email	     |
      |admin   |password|Hotel 1  |London City| Parveen	    | 0208571000    |abc@abc.com |

  @DeleteHotel
  Scenario Outline: Verify admin can register a hotel
    Given the user go to the Hotel Management Platform
    And user logs in as <UserName> into the system with password <Password>
    And user logs in successfully
    When the user creates a hotel as hotel
        | Hotel Name  | <Hotel Name>  |
        | Address     | <Address>     |
        | Owner       | <Owner>       |
        | Phone number| <PhoneNumber> |
        | Email       | <Email>       |
    And the user selects create
    When the user deletes <Hotel Name>
    Then the <Hotel Name> is deleted successfully
    And the user logs out

    Examples:
      |UserName|Password|Hotel Name   |Address        | Owner	    |PhoneNumber	|Email	     |
      |admin   |password|Hotel 2  |London Heathrow| Chris	    | 0208571000    |abc@abc.com |

  @CreateMultipleHotel
  Scenario Outline: Verify admin can register a hotel
    Given the user go to the Hotel Management Platform
    And user logs in as <UserName> into the system with password <Password>
    And user logs in successfully
    When the user creates a hotel as hotel
      | Hotel Name  | <Hotel Name>  |
      | Address     | <Address>     |
      | Owner       | <Owner>       |
      | Phone number| <PhoneNumber> |
      | Email       | <Email>       |
    And the user selects create
    Then <Hotel Name> is created successfully
    And the user logs out

    Examples:
      |UserName|Password|Hotel Name   |Address        | Owner	    |PhoneNumber	|Email	     |
      |admin   |password|Hotel 3  |Reading| Richard	    | 0208571000    |abc@abc.com |
      |admin   |password|Hotel 4     |Croydon| Satish	    | 0208234000    |def@def.com |

