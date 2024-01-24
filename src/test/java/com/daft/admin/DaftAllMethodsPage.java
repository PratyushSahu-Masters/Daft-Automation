package com.daft.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.daft.init.Common;
import com.daft.init.ConfigFileReader;
import com.locators.AbstractPage;

public class DaftAllMethodsPage extends AbstractPage {

	Common common = new Common(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();

	/**
	 * Constructor
	 *
	 * @param Dashboard driver
	 */
	public DaftAllMethodsPage(WebDriver driver) {
		super(driver);

	}

	public void openURL(String urlToOpen) {

		common.logPrint("Step :: Open url :- " + urlToOpen);
		driver.get(urlToOpen);
	}

	public void searchByKeyword() throws InterruptedException {
		common.logPrint("Step :: Enter city in home page search box.");
		String cityName = getPropertyValue("cityname");
		common.pause(5);
		common.typeAndEnter(HOME_PAGE_SEARCH_BOX, cityName);

		common.logPrint("Step :: Click on filters tab.");
		common.click(FILTERS_TAB);

		common.logPrint("Step :: Enter keyword in keyword textbox.");
		String keywordToSearch = getPropertyValue("keywordtosearch");
		common.waitUntilElementsToBeVisible(By.xpath(KEYWORD_TEXTBOX));
		common.typeAndTab(KEYWORD_TEXTBOX, keywordToSearch);

		String buttonText = common.waitUntilElementTextChanged(SHOW_BUTTON).getText();
		common.logPrint("buttonText : " + buttonText);
		common.logPrint("Step :: Click on show button.");
		common.click(SHOW_BUTTON);

	}

	public void verifySearchdKeywordPresentInPropertyDescription() throws InterruptedException {
		common.logPrint("Step :: Click on any searched property.");
		int totalSearch = common.waitUntilElementsToBeVisible(By.xpath(TITLE_BLOCK_ADDRESS)).size();
		String xpath = TITLE_BLOCK_ADDRESS + "[" + common.generateRandomInteger(totalSearch) + "]";
		WebElement block = common.waitUntilElementToBeClickable(By.xpath(xpath));
		common.scroll_To_Element(block);
		block.click();

		common.logPrint("Step :: Verify searched keyword present in property description.");
		WebElement prodcutDescription = common.waitUntilElementToBeVisible(By.xpath(PRODUCT_DESCRIPTION));
		String description = prodcutDescription.getText();
		String keywordToCheck = getPropertyValue("keywordtosearch");
		Assert.assertTrue(description.contains(keywordToCheck));

		common.logPrint("Searched keyword present in property description.");
	}
}