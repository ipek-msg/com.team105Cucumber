
Feature: US1001 Kullanici amazonda test yapar

  Scenario: TC01 Kullanici amazonda Nutella yazip aratir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Nutella yazip aratir
    And arama sonuclarinin Nutella icerdigini test eder
    Then sayfayi kapatir
