package pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import libraries.Annotations;

public class MyLeadsPage extends Annotations {
	
	 public CreateLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead")
		.click();
		return new CreateLeadPage();
		
	}
	 


@And("The User clicks on FindLeads Link1")
public FinalLeadsPage clickF1() {
	driver.findElementByXPath("(//a[@href=\"/crmsfa/control/findLeads\"])").click();
	return new FinalLeadsPage();
	
} 

@And("The User clicks on FindLeads Link3")
public FinalLeadsPage clickF3() {
	driver.findElementByXPath("(//a[@href=\"/crmsfa/control/findLeads\"])").click();
	return new FinalLeadsPage();
	
} 

}
