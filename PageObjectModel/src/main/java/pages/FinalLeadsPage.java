package pages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import libraries.Annotations;

public class FinalLeadsPage extends Annotations {
	

	@And("User clicks on FirstName")
	public FinalLeadsPage clickfName() {
		
		driver.findElementByXPath("(//input[@name=\"firstName\"])[3]").sendKeys("Babu");
		
		return this ;
	}

	@And("User clicks on LastName")
public FinalLeadsPage clickLName() {
		
		driver.findElementByXPath("(//input[@name=\"lastName\"])[3]").sendKeys("M");
		
		return this ;
	}

	@And("User clicks on CompanyName")
public FinalLeadsPage clickcName() {
	
	driver.findElementByXPath("(//input[@name=\"companyName\"])[2]").sendKeys("TestLeaf");
	
	return this ;
}

	@And("User clicks on FindLeads Button")
public FinalLeadsPage clickfLeads() {
	
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	
	return this ;
}

	@And("User clicks on FindLeads Button2")
	public FinalLeadsPage userclicksonFindLeadsButton2() {
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		return this ;
	}

	@And("User clicks on the First RESULT")
  public ViewLeadPage clickResult() {
	
	driver.findElementByXPath("(//a[@href=\"/crmsfa/control/viewLead?partyId=11143\"])[1]").click();
	
	return new ViewLeadPage();
	
}
	
	@And("The User inputs the LeadID")
 public FinalLeadsPage inputID() {
	
	 driver.findElementByXPath("(//input[@name=\"id\"])").sendKeys("11143");
	
	 return this;
	
}

	
	@Then("User verifies the Error message")
  public FinalLeadsPage checkLeads() {
	
	  
      String check= driver.findElementByXPath("//div[@id=\"ext-gen437\"]").getText();
      System.out.println(check);
     return this ;
}
	
	
	
	
	

}
