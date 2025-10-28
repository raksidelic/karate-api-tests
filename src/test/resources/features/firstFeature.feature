Feature: Sample API test

  Background:
    * url 'http://dental-frontend:3000'

  Scenario: Get all users
    Given path '/users'
    When method get
    Then status 200
