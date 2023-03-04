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

Windows.callTestCase(findTestCase('login page - qa partner'), [('email') : email, ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/td_4efdf310'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_HR Review'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/rect'))

WebUI.rightClick(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/span_250 bpm, 4 beats'))

WebUI.verifyElementText(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/span_Max 250 bpm'), 'Max 250 bpm')

WebUI.verifyElementText(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/span_250 bpm, 4 beats'), 
    '250 bpm, 4 beats')

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Next Beat'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Lower HR'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Higher HR'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Lower HR'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Lower HR'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Next Beat'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Prev Beat'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Next Beat'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Lower HR'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Lower HR'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Lower HR'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Set Max'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/button_'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Lower HR'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Lower HR'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Lower HR'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Set Min'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/button_'))

WebUI.click(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/div_Revert'))

WebUI.verifyElementText(findTestObject('Object Repository/HR Review - QA partner/Page_MEMO Care/span_Min 6 bpm'), 'Min 6 bpm')

WebUI.openBrowser('')

