Feature: login
 Scenario Outline: login process
 Given open the url
 And click the signin button
 And enter the <username>
 And enter the password <password>
 Then click login
 
 Examples:
 | username  | password   |
 | Lalitha   | password123|
 | Nasreen61 | nasreen123 |
 