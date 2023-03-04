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

CucumberKW.runFeatureFile('Include/features/SQA-58 3.feature')

Windows.callTestCase(findTestCase('login page - qa partner'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/말풍선 비노출확인/Page_MEMO Care/div__1 (1)'))

WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/말풍선 비노출확인/Page_MEMO Care/div__1_2 (1)'))

WebUI.setText(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/말풍선 비노출확인/Page_MEMO Care/input__sc-ieecCq icKGXT_1_2 (1)'), 'e401ab81')

WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/말풍선 비노출확인/Page_MEMO Care/svg (1)'))

WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/말풍선 비노출확인/Page_MEMO Care/td_2023-02-16 (1)'))

WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/말풍선 비노출확인/Page_MEMO Care/div_Event Review (1)'))

try {
    WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/말풍선 비노출확인/Page_MEMO Care/div_AF (1)'))

    WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/말풍선 비노출확인/Page_MEMO Care/div__1_2_3 (1)'))

    WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/말풍선 비노출확인/Page_MEMO Care/body_You need to enable JavaScript to run t_ecaf5f (1)'))

    WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/말풍선 비노출확인/Page_MEMO Care/div_Pause (1)'))

    WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/말풍선 비노출확인/Page_MEMO Care/div__1_2_3 (1)'))

    WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/말풍선 비노출확인/Page_MEMO Care/div_Notable Rhythm Strip13  Pause Detail Pa_4197b1 (1)'))

    WebUI.doubleClick(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/말풍선 비노출확인/Page_MEMO Care/div_Notable Rhythm Strip13  Pause Detail Pa_4197b1 (1)'))

    WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/말풍선 비노출확인/Page_MEMO Care/div_Notable Rhythm Strip13  Pause Detail Pa_4197b1 (1)'))

    WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/말풍선 비노출확인/Page_MEMO Care/div_Notable Rhythm Strip13  Pause Detail Pa_4197b1 (1)'))

    WebUI.click(findTestObject('Object Repository/MEMO Platform v2.3.0 - QA/말풍선 비노출확인/Page_MEMO Care/div__1_2_3_4 (1)'))
}
catch (def e) {
} 

