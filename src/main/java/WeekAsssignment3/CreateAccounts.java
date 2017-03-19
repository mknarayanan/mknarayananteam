package WeekAsssignment3;

import org.junit.Test;

import wrappers.LeafTapsWrappers;


	
	public class CreateAccounts extends LeafTapsWrappers{
		@Test
		public void UpdateLead() throws Exception{
		
		//LeafTapsLogin();
		clickByLink("CRM/SFA");	
		clickByLink("Create Account");
		enterById("accountName","66672");
		selectVisibileTextByName("industryEnumId", "Computer Software");
		selectVisibileTextById("currencyUomId","AUD - Australian Dollar");
		selectVisibileTextById("dataSourceId","Employee");
		selectVisibileTextById("marketingCampaignId","Automobile");
		selectVisibileTextById("generalStateProvinceGeoId","Texas");
		enterById("primaryPhoneNumber","9025620099");
		enterById("generalCity", "Kanchipuram");
		enterById("primaryEmail","mdlogan1346@gmail.com");
		clickByClassName("smallSubmit");
		clickByLink("Find Accounts");
		enterByName("id","17482" );
		//clickByXpath("//button[contains(text(),'Find Leads')]");
		//clickByClassName("x-btn-text");
		clickByXpath("//button[contains(text(),'Find Accounts')]");
		Thread.sleep(2000);
		verifyTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a", "17482");
		//verifyTextByClassName("tabletext", "17482");
		closeBrowser();
		
	
}
}
	