Feature: Delete Lead

Scenario: TC001 Delete Lead

Given The User is on HomePage and clicks on Leads Button 

When The User clicks on FindLeads Link1

And User clicks on FirstName

And User clicks on LastName

And User clicks on CompanyName

And User clicks on FindLeads Button

And User clicks on the First RESULT

And Verifies the First Name

And Clicks on the Delete Button
    
And The User clicks on FindLeads Link3

And The User inputs the LeadID

And User clicks on FindLeads Button2

Then User verifies the Error message
