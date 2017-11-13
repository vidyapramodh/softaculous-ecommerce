Feature: check that items can be searched in search bar


  Background: Given user is Home Page
  @search
  Scenario: check items can be searched in search bar

    When  User enters in search bar "men"
    And   User clicks on search button
    Then  user should navigate to that page

  @cart
  Scenario: Verify User can add a product to the cart

    Given user is on product detail page
    When  User selects a product
    And   user clicks on add to cart
    Then  User should successfully add the product to his cart

    @links
    Scenario:  Major links are visible

      When User clicks on APPAREL & ACCESSORIES link
      Then he should be landed on that page with text "APPAREL & ACCESSORIES"
      When User navigates back
      And  he clicks on Books link
      Then he should be landed on page with text "Find the Items You'd Like to read"


 @subscribe
 Scenario: Subscribe to News Letter

   When  user enters valid Email as"sri@gmail.com"
   And clicks on subscribe button
   Then he should navigate to subscribe page successfully

   @logo

   Scenario: Check the  Login or register logo is visible on Home page

        When User looks for a Login or register is present
        Then he should see the Login or register is on home page

     @dropdown
     Scenario: verify the dropdown button functionality

       When User clicks on Fragrance
       And  User navigates to Fragrance product page
       And  he clicks on Women
       And  user selects price High to Low
       Then User should see the products displayed from High to Low











