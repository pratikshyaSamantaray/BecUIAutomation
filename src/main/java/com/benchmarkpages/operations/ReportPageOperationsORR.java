package com.benchmarkpages.operations;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.benchmark.common.Helper;
import com.benchmark.core.constants.FindByTypeConstants;
import com.benchmark.framework.ui.BaseSelenium;
import com.benchmark.framework.ui.SeleniumWrapper;
import com.benchmark.framework.ui.controls.BaseControl;
import com.benchmark.framework.ui.controls.MSGenericElement;
import com.benchmark.pages.elements.ConstantValueORR;
import com.benchmark.pages.elements.ReportPageElementsORR;
import com.google.common.collect.ObjectArrays;

public class ReportPageOperationsORR {
	
	ReportPageElementsORR reportPage;
	WebDriverWait wait;
	WebDriver d;
	WebElement basewebelement;
	String[] expectedFilter= {"Instructional","English","Fiction","Nonfiction","Unseen"};
	String[] filterOptions= {"Independent","Frustrational","Spanish","Seen"};
	String[] allFilterOptions = ObjectArrays.concat(expectedFilter, filterOptions, String.class);
	String[] headerOfRHO= {"Date","Reading Level","Proficiency","Last Passage","Category","Accuracy",
			"Self-correction","Fluency","Re-telling","Comprehension"};
	
	private final static String ReportCLASSNAME = ReportPageOperationsORR.class.getSimpleName();

	public void commonInitialization() throws IOException {
			reportPage = new ReportPageElementsORR();
			wait=new WebDriverWait(SeleniumWrapper.webDriver(), 20);
			
		
	}
	
	public boolean reportPageOperation() {
		
		try {
			commonInitialization();
			JavascriptExecutor js = (JavascriptExecutor) SeleniumWrapper.webDriver();
			
			
			
			/*
			 * ---Click on Oral Reading Record Tab---
			 */
			Thread.sleep(10000);
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(reportPage.getStudentButtonXpath())));
			reportPage.getStudentButton().click();
			Thread.sleep(10000);
			reportPage.getORRtab().click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(reportPage.getFilterButtonXpath())));
			Reporter.log("***********Defult value for filter validation***************");
			for(String filterVarify: expectedFilter) {
				boolean flag=reportPage.getAppliedFilterRibbon(filterVarify).isVisible();
				Reporter.log("By defult "+filterVarify +" is selected :"+ flag);
			}
			/*reportPage.getFilterButton().click();
			//Thread.sleep(5000);
			for (String filterOptionSelect : filterOptions) {
				reportPage.getFilterOptions(filterOptionSelect).click();
			}
			
			//Thread.sleep(5000);
			reportPage.getApplyButton().click();
			//Thread.sleep(5000);
			Reporter.log("***********All values for filter validation***************");
			for (String filterOption : allFilterOptions) {
				boolean flag=reportPage.getAppliedFilterRibbon(filterOption).isVisible();
				Reporter.log("After applying all fiter "+filterOption+ " is visible :"+flag);
			}
			//Thread.sleep(5000);
			reportPage.getFilterButton().click();
			for (String filterOptionDeSelect : allFilterOptions) {
				reportPage.getFilterOptions(filterOptionDeSelect).click();
			}
			//Thread.sleep(5000);
			reportPage.getApplyButton().click();
			Reporter.log("***********Validation after removing filters***************");
			for (String filterDeselectOption : allFilterOptions) {
				boolean flag=!(reportPage.getAppliedFilterRibbon(filterDeselectOption).isVisible());
				Reporter.log("After removing all applied fiter "+filterDeselectOption+ " is not visible :"+flag);
			}*/
			/**
			 * ---Click on Fluency option in the chart---
			 */
			//reportPage.getChartFluencyOptions().click();
			
			/**
			 * ---Click on Accuracy option in the chart---
			 */
			
			/**
			 * ---Click on Reading History Tab--- 
			 */
			reportPage.getRHOTab().click();
			Thread.sleep(5000);
			/*Reporter.log("***********All Headers of Reading History***************");
			for (String readingHistoryHeaders : headerOfRHO) {
				boolean flag=reportPage.getHeadersOfRHO(readingHistoryHeaders).isVisible();
			}
			*/
			/*Check sort in date column:*/
			//Retrieve the List of Items in the Table before Sorting and Store into Array
			List<WebElement> List = d.findElements(By.xpath("//div[@class='student-list-body scroll-body]"));
			String strArray[] = new String[List.size()];
			for (int i = 1; i < List.size(); i++) {
				System.out.println(List.get(div[i]).getText());
				strArray[i]=List.get(i).getText();
			}
			
			//basewebelement = SeleniumWrapper.webDriver().findElements(createBy(FindByTypeConstants.XPATH, "//div[@class='student-list-body scroll-body]"));
			
			
			
			
			
			return true;
		} catch (Exception e) {
			Helper.appendErrorMessage(ReportCLASSNAME, "Validate Report Page", e);
			e.printStackTrace();
		}
		return false;
		
	}

}








































































































/*commonInitialization();
Thread.sleep(15000);

*//**
 * ---Click on Oral Reading Record Tab---
 *//*
reportPage.getORRtab().click();
Thread.sleep(10000);

*//**
 * ---Check for Filter Button Present---
 *//*
assertEquals(reportPage.getFilterButton().isVisible(), true, "Filter Button in Report Page");

//---Check for Default Options Selected in filter ribbon---//
assertEquals(reportPage.getRibbonOptionProficiency().isVisible(), true, 
		"Instructional option as proficiency in filter ribbon");
assertEquals(reportPage.getRibbonOptionLanguage().isVisible(), true, 
		"English option as language in filter ribbon");
assertEquals(reportPage.getRibbonOptionCategory1().isVisible(), true, 
		"Fiction option as Category in filter ribbon");
assertEquals(reportPage.getRibbonOptionCategory2().isVisible(), true, 
		"Nonfiction option as categoty in filter ribbon");
assertEquals(reportPage.getRibbonOptionType().isVisible(), true, 
		"Unseen option as type in filter ribbon");

Thread.sleep(20000);

*//**
 * ---Click on Filter Button---
 *//*
//SeleniumWrapper.scrollUp((WebElement) reportPage.getFilterButton());
//Thread.sleep(5000);
reportPage.getFilterButton().click();

*//**
 * ---Check the options/buttons Present under Filter---
 *//*
//Proficiency
assertEquals(reportPage.getProficiencylabel().isVisible(), true, "Proficiency label under Filter");
assertEquals(reportPage.getIndependentButton().isVisible(), true, "Independednt button under Proficiency"
		+ "under Filter");
assertEquals(reportPage.getInstructionalButton().isVisible(), true, "Independednt button under Proficiency" 
		+ "under Filter");
assertEquals(reportPage.getFrustrationalButton().isVisible(), true, "Frustrational button under Proficiency"
		+ "under Filter");
//Language
assertEquals(reportPage.getLanguageLabel().isVisible(), true, "Language label under Filter");
assertEquals(reportPage.getEnglishButton().isVisible(), true, "English button under language in Filter");
assertEquals(reportPage.getSpanishButton().isVisible(), true, "Spanish button under Language in Filter");

//Category
assertEquals(reportPage.getCategoryLabel().isVisible(), true, "Category label under Filter");
assertEquals(reportPage.getFictionButton().isVisible(), true, "Fiction button under Category in Filter");
assertEquals(reportPage.getNonfictionButton().isVisible(), true, "NonFiction button under Category in Filter");

//Type
assertEquals(reportPage.getTypeLabel().isVisible(), true, "Type label under Filter");
assertEquals(reportPage.getSeenButton().isVisible(), true, "Seen button under Type in Filter");
assertEquals(reportPage.getUnseenButton().isVisible(), true, "Unseen button under Type in Filter");

//Apply Button
assertEquals(reportPage.getApplyButton().isVisible(), true, "Apply button under Filter");

*//**
 * ---Select all the options and click on Apply---
 *//*

*//**
 * ---Try to Uncheck all the options and click on Apply---
 *//*

*//**
 * ---Identify the Chart---
 *//*


*//**
 * ---Validate Fluency & Accuracy---
 *//*

return true;

*/