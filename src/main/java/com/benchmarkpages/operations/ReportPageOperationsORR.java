package com.benchmarkpages.operations;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.benchmark.common.Helper;
import com.benchmark.framework.ui.SeleniumWrapper;
import com.benchmark.pages.elements.ReportPageElementsORR;
import com.google.common.collect.ObjectArrays;

public class ReportPageOperationsORR {
	
	ReportPageElementsORR reportPage;
	WebDriverWait wait;
	WebElement basewebelement;
	String[] expectedFilter= {"Instructional","English","Fiction","Nonfiction","Unseen"};
	String[] filterOptions= {"Independent","Frustrational","Spanish","Seen"};
	String[] allFilterOptions = ObjectArrays.concat(expectedFilter, filterOptions, String.class);
	String[] headerOfRHO= {"Date","Reading Level","Proficiency","Last Passage","Category","Accuracy",
			"Self-correction","Fluency","Re-telling","Comprehension"};
	
	private final static String ReportCLASSNAME = ReportPageOperationsORR.class.getSimpleName();

	public void commonInitialization() throws IOException {
			reportPage = new ReportPageElementsORR();	
			wait=new WebDriverWait(SeleniumWrapper.webDriver(), 60);
	}
	
	
	public boolean filterOperations() {
		try {
			commonInitialization();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(reportPage.getFilterButtonXpath())));
			Reporter.log("***********Defult value for filter validation***************");
			for(String filterVarify: expectedFilter) {
				boolean flag=reportPage.getAppliedFilterRibbon(filterVarify).isVisible();
				Reporter.log("By defult "+filterVarify +" is selected :"+ flag);
				
			}
			reportPage.getFilterButton().click();
			for (String filterOptionSelect : filterOptions) {
				SeleniumWrapper.waitTillElementToBeClickableAndClick("XPATH", reportPage.getFilterOptionsXpath(filterOptionSelect));
			}
			reportPage.getApplyButton().click();
			Reporter.log("***********All values in filter Ribbon validation***************");
			for (String filterOption : allFilterOptions) {
				boolean flag=reportPage.getAppliedFilterRibbon(filterOption).isVisible();
				Reporter.log("After applying all fiter "+filterOption+ " is visible in Ribbon :"+flag);
			}
			return true;
		} catch (Exception e) {
			Helper.appendErrorMessage(ReportCLASSNAME, "Validate Filters", e);
			e.printStackTrace();
		}
		
		
		
		return false;
		
	}
	public boolean readingLevelProgressOperations() {
		try {
			commonInitialization();
			SeleniumWrapper.waitTillElementToBeClickableAndClick("XPATH", reportPage.getChartFluencyOptionsXpath());
			return true;
			
		} catch (Exception e) {
			Helper.appendErrorMessage(ReportCLASSNAME, "Validate RLP", e);
			e.printStackTrace();
		}
		return false;
		
	}
	public boolean readingHistoryOperations() {
		try {
			commonInitialization();
			reportPage.getFilterButton().click();
			for (String filterOptionSelect : filterOptions) {
				SeleniumWrapper.waitTillElementToBeClickableAndClick("XPATH", reportPage.getFilterOptionsXpath(filterOptionSelect));
			}
			reportPage.getApplyButton().click();
			SeleniumWrapper.waitTillElementToBeClickableAndClick("XPATH", reportPage.getRHOTabXpath());
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(reportPage.getHeadersOfRHOXpath(headerOfRHO[1]))));
			Reporter.log("***********All Headers of Reading History***************");
			for (String readingHistoryHeaders : headerOfRHO) {
				boolean flag=reportPage.getHeadersOfRHO(readingHistoryHeaders).isVisible();
				Reporter.log(readingHistoryHeaders+" is displayed for Reading History ===> "+flag);
			}
			//Check sort in date column:
			//List<WebElement> list = driver.findElements(By.xpath(reportPage.getDateColumnXpath()));
			List<WebElement> list = SeleniumWrapper.webDriver().findElements(By.xpath(reportPage.getDateColumnXpath()));
			String strArray[] = new String[list.size()];
			for (int i=0; i< list.size(); i++) {
				System.out.println(list.get(i).getText());
				strArray[i]=list.get(i).getText();
			}
			reportPage.getSortDateColumn().click();
			for (int i = 1; i < list.size(); i++) {
				System.out.println(list.get(i).getText());
				strArray[i]=list.get(i).getText();
			}
			
			return true;
			
		} catch (Exception e) {
			Helper.appendErrorMessage(ReportCLASSNAME, "Validate RHO", e);
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean reachToORR() {
		try {
			commonInitialization();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(reportPage.getSpinnerXpath())));
			SeleniumWrapper.waitTillElementToBeClickableAndClick("XPATH", reportPage.getStudentButtonXpath());
			SeleniumWrapper.waitTillElementToBeClickableAndClick("XPATH", reportPage.getORRtabXpath());
			return true;
		} catch (Exception e) {
			Helper.appendErrorMessage(ReportCLASSNAME, "Reach to ORR", e);
			e.printStackTrace();
		}
		return false;
	}

}







































































































