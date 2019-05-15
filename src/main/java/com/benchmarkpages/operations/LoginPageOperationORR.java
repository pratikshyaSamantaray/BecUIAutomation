package com.benchmarkpages.operations;

import java.io.IOException;
import java.util.Properties;

import javax.xml.xpath.XPathConstants;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

import com.benchmark.common.Global;
import com.benchmark.common.Helper;
import com.benchmark.constants.CommonConstants;
import com.benchmark.core.constants.FindByTypeConstants;
import com.benchmark.core.util.FileOperations;
import com.benchmark.framework.ui.BaseSelenium;
import com.benchmark.framework.ui.SeleniumWrapper;
import com.benchmark.framework.ui.controls.BaseControl;
import com.benchmark.framework.ui.controls.MSDropDownList;
import com.benchmark.pages.elements.LoginPageElementsORR;
import org.openqa.selenium.support.ui.Select;

public class LoginPageOperationORR extends BaseControl {

	
	
	
	
	/*----Usable Class, and variable declaration----*/
	LoginPageElementsORR loginPage;
	Properties appProperties;
	MSDropDownList dropdown;
	WebElement basewebelement;
	Select select;
	
	private final static String CLASSNAME = LoginPageOperationORR.class.getSimpleName();

	public void commonInitialization() {
		try {
			loginPage = new LoginPageElementsORR();
			appProperties = FileOperations.getProperties("app.properties");
			// dropdown=new MSDropDownList(findByType, valueToFindElement, childFindByType,
			// childTag, subChildFindBy, subChildTag, isChildDiv)
		} catch (IOException e) {
			Helper.appendErrorMessage(CLASSNAME, "LoginPageValidationORR -" + "commonInitialization : fail", e);
		}
	}

	public boolean loginPageOperation() {
		commonInitialization();
		try {
			 basewebelement = SeleniumWrapper.webDriver().findElement(createBy(FindByTypeConstants.XPATH, loginPage.getSelectRealmDropdownLocator()));
			loginPage.getUserNameField().setText(appProperties.getProperty(CommonConstants.USER_NAME));
			loginPage.getPasswordField().setText(appProperties.getProperty(CommonConstants.PASSWORD));
			select = new Select(basewebelement);
			//dropdown.select(appProperties.getProperty(CommonConstants.SELECT_REALM_OPTION));
			select.selectByVisibleText("techsupport");

			loginPage.getSignInButton().click();
			
			return true;
		} catch (Exception e) {
			Helper.appendErrorMessage(CLASSNAME, "Validate Login Page", e);
		}
		return false;
	}

}
