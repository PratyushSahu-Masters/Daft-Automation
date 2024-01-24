package com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import com.daft.init.Common;
import com.daft.init.ConfigFileReader;
import com.daft.init.Base;

public abstract class AbstractPage extends Base {

	/**
	 * Initialize UserAbstractPage.
	 * 
	 * @param Driver
	 */
	public AbstractPage(WebDriver driver) {

		this.driver = driver;

	}
	ConfigFileReader configFileReader = new ConfigFileReader();
	public String HOME_PAGE_SEARCH_BOX = "//input[@id='search-box-input']";
	public String FILTERS_TAB = "//span[text()='Filters']";
	public String KEYWORD_TEXTBOX = "//input[@id='keywordtermsModal']";
	public String SHOW_BUTTON = "//button[contains(@aria-label,'Show')]";
	public String TITLE_BLOCK_ADDRESS = "(//li[contains(@class,'SearchPagestyled__Result')]//a)";
	public String PRODUCT_DESCRIPTION ="(//div[@data-testid='description'])[2]";
}