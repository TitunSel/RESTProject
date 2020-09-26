package pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import libraries.Annotations;

public class MyHomePage extends Annotations {
	
	@Given("The User is on HomePage and clicks on Leads Button")
	public MyLeadsPage clickLeadsTab() {
		driver.findElementByXPath("//a[@href=\"/crmsfa/control/leadsMain\"]").click();
		return new MyLeadsPage();
	}

	
}
