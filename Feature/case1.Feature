Feature: Registration Feature


Scenario: users register the TestMeApp 

Given the home page is opened
When user click the signup
And user enters username as shanmathi
And user enters firstname as shanmathi
And user enters lastname as Raja
And user enters password as 123456789
And user enters confirm password as 123456789
And user clicks gender as female
And user enters email as shanmathiraja2112@gmail.com
And user enters mobile number as 9788351565
And user enters date of birth as 21/12/1998
And user enters address as 41,Desi Chettty Street
And user security question as what is your favour color? 
And user enters answer as black
And user clicks Register button
Then user will directed to login page