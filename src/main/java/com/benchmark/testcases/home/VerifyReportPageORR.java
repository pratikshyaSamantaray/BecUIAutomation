package com.benchmark.testcases.home;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.benchmark.common.Global;
import com.benchmark.common.Helper;
import com.benchmark.managers.Pages;
import com.benchmark.testcases.BaseUITest;

public class VerifyReportPageORR extends BaseUITest {
	
	private final static String DESCRIPTION = "Validate Filters Report Page";
	private final static String TESTSTEPS = "Report Page Filter Validation";
	
	
	public VerifyReportPageORR() {
		super(DESCRIPTION , TESTSTEPS);
	}
	@Test(description = DESCRIPTION)
	public void verifyReport_TC2() {
		Global.TEST_CASE_ERROR_MESSAGES = new StringBuilder();
		m_isTestPassed = Pages.LoginORR().validation.loginPageOperation();
		Assert.assertTrue(m_isTestPassed, "Login Functionality : Fail");
		Reporter.log("1---->>>>Login Functionality :"+m_isTestPassed);
		m_isTestPassed = Pages.ReportORR().filterValidation.reportPageOperation();
		 Assert.assertTrue(m_isTestPassed, "Report Functionality : Fail");
		 Reporter.log("2---->>>>Report Functionality :"+m_isTestPassed);
	}
	

}

