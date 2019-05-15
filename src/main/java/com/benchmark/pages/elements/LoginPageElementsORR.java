package com.benchmark.pages.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import com.benchmark.core.constants.FindByTypeConstants;
import com.benchmark.framework.ui.controls.MSGenericElement;
import com.benchmark.framework.ui.controls.MSSelectOption;

/**
 * LoginPageElementsORR - Class which contains all Login page related to elements
 */

public class LoginPageElementsORR {

	
	//---------Return ELEMENT------------
	
	public MSGenericElement getUserNameField() {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//input[@name='username']");
	}
	
	public MSGenericElement getPasswordField() {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//input[@name='password']");
	}
	
	public MSGenericElement getSelectRealmDropdown() {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//select[@class='field selectBox']");
	}
	
	public MSGenericElement getSystemCheckLink() {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//a[@id='sysCheck']");
	}
	
	public MSGenericElement getForgotPasswordLink() {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//a[@id='forgotPass']");
	}
	
	public MSGenericElement getSignInButton() {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//input[@id='login']");
	}
	
	//----------Return Locator
	
	public String getSelectRealmDropdownLocator() {
		return  "//select[@class='field selectBox']";
	}
	
}
