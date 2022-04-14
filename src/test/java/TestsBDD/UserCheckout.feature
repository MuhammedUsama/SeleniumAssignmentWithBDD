Feature: Checkout Test
  As a registered user, I want to checkout a product
Background:
  Given the user is registered to the website


@SuccessfullyCheckout
Scenario: Test Successful Checkout
  Given the user is logged in the website
  When the user adds a product to cart
  And the user checkouts
  Then order shall be added to order history


