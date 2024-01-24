package com.daft.pages;

import org.testng.annotations.Test;

import com.daft.init.Base;
import com.daft.init.Common;
import com.daft.init.ConfigFileReader;

public class SearchPage extends Base {
	Common common = new Common(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();

	@Test()
	public void searchByKeywordAndVerify() throws InterruptedException {
		String url = configFileReader.getURL();
		daftAllMethodsPage.openURL(url);
		daftAllMethodsPage.searchByKeyword();
		daftAllMethodsPage.verifySearchdKeywordPresentInPropertyDescription();
	}

}
