package com.benchmark.pages.elements;

import com.benchmark.core.constants.FindByTypeConstants;
import com.benchmark.framework.ui.controls.MSGenericElement;
/**
 * ReportPageElementsORR - Class which contains all Report page related to elements
 */

public class ReportPageElementsORR {

	/**
	 * --ORR tab XPath
	 */
	public MSGenericElement getORRtab() {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//li[contains(text(),'Oral Reading Records')]");
	}
	
	public String getORRtabXpath() {
		return "//li[contains(text(),'Oral Reading Records')]";
	}
	
	/**
	 * --Filter button XPath
	 */
	public MSGenericElement getFilterButton() {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//span[text()='Filter']");
	}
	
	public String getFilterButtonXpath() {
		return "//span[text()='Filter']";
	}
	/**
	*--Default Ribbon Selected options--
	*/
	
	public MSGenericElement getAppliedFilterRibbon(String expected) {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//div[@class='apply-filter-result']//*[text()='"+expected+"']");
	}
	
	public MSGenericElement getFilterOptions(String expected) {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//div[contains(@class,'collapse slide-shadow')]//button[text()='"+expected+"']");
	}
	
	public String getFilterOptionsXpath(String expected) {
		return "//div[contains(@class,'collapse slide-shadow')]//button[text()='"+expected+"']";
	}
	
	
	/**
	 * -Click on FLuency button in chart-
	 */
	public MSGenericElement getChartFluencyOptions() {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//span[text()='Fluency']");
	}
	
	public String getChartFluencyOptionsXpath() {
		return "//span[text()='Fluency']";
	}
	
	
	/**
	 * Apply Button
	 */
	public MSGenericElement getApplyButton() {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//div[a[contains(text(), 'Apply')]]");
	}
	
	/**
	*--RHO or Reading History tab XPath--
	*/
	public MSGenericElement getRHOTab() {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//li[contains(text(),'Reading History')]");
	}
	
	public String getRHOTabXpath() {
		return "//li[contains(text(),'Reading History')]";
	}
	/**
	*--RHO Header row elements--
	*/
	public MSGenericElement getHeadersOfRHO(String expected) {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//div[@class='student-list-header rho-header']//span[contains(text(),'"+expected+"')]");
	}
	
	public String getHeadersOfRHOXpath(String expected) {
		return "//div[@class='student-list-header rho-header']//span[contains(text(),'"+expected+"')]";
	}
	/**
	*--Click on Student--
	*/
	public MSGenericElement getStudentButton() {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//div[@class='single-filter-text' and text()='Student']");
	}
	public String getStudentButtonXpath() {
		return "//div[@class='single-filter-text' and text()='Student']";
	}
	/**
	*--Click on Student--
	*/
	public MSGenericElement getSpinner() {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//div[@class='display-loading-main' and @style='display: none;']");
	}
	public String getSpinnerXpath() {
		return "//div[@class='display-loading-main' and @style='display: none;']";
	}
	
	/**
	*--Date column elements--
	*/
	public MSGenericElement getDateColumn() {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//div[@class='student-list-row'][*]/div[1]/span[1]");
	}
	public String getDateColumnXpath() {
		return "//div[@class='student-list-row'][*]/div[1]/span[1]";
	}
	public MSGenericElement getRowData() {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//div[@class='student-list-body scroll-body']");
	}
	public MSGenericElement getSortDateColumn() {
		return new MSGenericElement(FindByTypeConstants.XPATH, "//div[@class='student-list-body scroll-body']");
	}
}
