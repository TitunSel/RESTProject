package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import libraries.Annotations;
import pages.MyHomePage;

public class TC001_CreateLead extends Annotations {
	
	@BeforeClass
	public void setData() {
		excelFileName = "TC001";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createLeadTest(String cName, String fName, String lName) {
		new MyHomePage().clickLeadsTab().clickF1().clickfName().clickLName().clickcName().clickfLeads().clickResult().verifyFirstName().verifydelete().clickF3().inputID().userclicksonFindLeadsButton2().checkLeads();
	}
	
	
	
	
	
	
	
	
	

}
