package com.benchmark.testcases.home;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.benchmark.common.Global;
import com.benchmark.common.Helper;
import com.benchmark.managers.Pages;
import com.benchmark.testcases.BaseUITest;

public class VerifyOralReadingRecordReportsORR extends BaseUITest {
	
	private final static String DESCRIPTION = "Validate ORR";
	private final static String TESTSTEPS = "Report Page Validation(Filter,RLP,RHO)";
	
	
	private final static String DESCRIPTION_TC1 = "Validate Filters ";
	private final static String DESCRIPTION_TC2 = "Validate Reading Level Progress ";
	private final static String DESCRIPTION_TC3 = "Validate Reading History ";
	
	
	public VerifyOralReadingRecordReportsORR() {
		super(DESCRIPTION , TESTSTEPS);
	}
	@Test(description = DESCRIPTION_TC1)
	public void verifyFilter_TC1() {
		Global.TEST_CASE_ERROR_MESSAGES = new StringBuilder();
		m_isTestPassed = Pages.LoginORR().validation.loginPageOperation();
		Assert.assertTrue(m_isTestPassed, "Login Functionality : Fail");
		Reporter.log("1---->>>>Login Functionality :"+m_isTestPassed);
		m_isTestPassed = Pages.ReportORR().oRRValidation.reachToORR();
		Assert.assertTrue(m_isTestPassed, "Reach to ORR Functionality : Fail");
		 Reporter.log("2---->>>>Reach to ORR Functionality :"+m_isTestPassed);
		 m_isTestPassed = Pages.ReportORR().oRRValidation.filterOperations();
		Assert.assertTrue(m_isTestPassed, "Filter Functionality : Fail");
		 Reporter.log("3---->>>>Filter Functionality :"+m_isTestPassed);
	}
	@Test(description = DESCRIPTION_TC2)
	public void verifyRLP_TC2() {
		Global.TEST_CASE_ERROR_MESSAGES = new StringBuilder();
		m_isTestPassed = Pages.LoginORR().validation.loginPageOperation();
		Assert.assertTrue(m_isTestPassed, "Login Functionality : Fail");
		Reporter.log("1---->>>>Login Functionality :"+m_isTestPassed);
		m_isTestPassed = Pages.ReportORR().oRRValidation.reachToORR();
		Assert.assertTrue(m_isTestPassed, "Reach to ORR Functionality : Fail");
		 Reporter.log("2---->>>>Reach to ORR Functionality :"+m_isTestPassed);
		 m_isTestPassed = Pages.ReportORR().oRRValidation.readingLevelProgressOperations();
		Assert.assertTrue(m_isTestPassed, "Reading Level Progress Functionality : Fail");
		 Reporter.log("3---->>>>Reading Level Progress Functionality :"+m_isTestPassed);
	}
	@Test(description = DESCRIPTION_TC3)
	public void verifyRHO_TC3() {
		Global.TEST_CASE_ERROR_MESSAGES = new StringBuilder();
		m_isTestPassed = Pages.LoginORR().validation.loginPageOperation();
		Assert.assertTrue(m_isTestPassed, "Login Functionality : Fail");
		Reporter.log("1---->>>>Login Functionality :"+m_isTestPassed);
		m_isTestPassed = Pages.ReportORR().oRRValidation.reachToORR();
		Assert.assertTrue(m_isTestPassed, "Reach to ORR Functionality : Fail");
		Reporter.log("2---->>>>Reach to ORR Functionality :"+m_isTestPassed);
		m_isTestPassed = Pages.ReportORR().oRRValidation.readingHistoryOperations();
		Assert.assertTrue(m_isTestPassed, "Reading History Functionality : Fail");
		Reporter.log("3---->>>>Reading History Functionality :"+m_isTestPassed);
		
	}
	

}

