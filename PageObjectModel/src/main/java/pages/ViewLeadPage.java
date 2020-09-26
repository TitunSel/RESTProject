package pages;

import cucumber.api.java.en.And;
import libraries.Annotations;

public class ViewLeadPage extends Annotations {
	
	
	@And("Verifies the First Name")
	public ViewLeadPage verifyFirstName() {
		String text = driver.findElementById("viewLead_firstName_sp")
		.getText();
		if(text.equals("Babu")) {
			System.out.println("First name matches with input data");
		}else {
			System.err.println("First name not matches with input data");
		}
		return this;
	}
	
	@And("Clicks on the Delete Button")
	public MyLeadsPage verifydelete() {
		
		driver.findElementByLinkText("Delete").click();
		return new MyLeadsPage();
	
		
	}
	

	
	
	
	
	
	
}
