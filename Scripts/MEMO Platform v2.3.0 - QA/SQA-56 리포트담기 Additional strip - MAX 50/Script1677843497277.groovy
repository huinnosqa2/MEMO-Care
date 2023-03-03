import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

CucumberKW.runFeatureFile('Include/features/SQA-56 Additional Stirip MAX 50.feature')

Windows.callTestCase(findTestCase('MEMO Platform v2.3.0 - QA/login page - qa partner'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div_'))

WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/td_2022-11-25'))

WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div_Event Review'))

try {
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div_AF'))

	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div__1_2'))

	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div_050'))

	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div__1_2_3_4_5'))
	
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div_VT'))
	
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div__1_2'))
	
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div_050'))
	
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div__1_2_3_4_5'))
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div_Couplet VPC'))
	
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div__1_2'))
	
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div_050'))
	
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div__1_2_3_4_5'))
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div_Iso VPC'))
	
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div__1_2'))
	
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div_050'))
	
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div__1_2_3_4_5'))
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div_Patient Events'))
	
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div__1_2'))
	
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div_050'))
	
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div__1_2_3_4_5'))
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div_Iso APC'))
	
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div__1_2'))
	
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div_Others'))
	
	WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/리포트담기 - Additional_Strip/div__1_2_3_4_5'))
}
catch (def e) {
}


