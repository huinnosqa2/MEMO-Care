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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://partner-qa.memopatch.care/login')

WebUI.setText(findTestObject('Object Repository/test/Page_MEMO Care/input__sc-ieecCq icKGXT'), 'sangyhyeon.park+qa2@huinno.com')

WebUI.setEncryptedText(findTestObject('Object Repository/test/Page_MEMO Care/input__sc-ieecCq icKGXT_1'), 'MSZn4fS/R/qEuowV0kSsuQ==')

WebUI.sendKeys(findTestObject('Object Repository/test/Page_MEMO Care/input__sc-ieecCq icKGXT_1'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/test/Page_MEMO Care/div__1'))

WebUI.click(findTestObject('Object Repository/test/Page_MEMO Care/td_11e6e389'))

WebUI.click(findTestObject('Object Repository/test/Page_MEMO Care/div_Event Review'))

WebUI.click(findTestObject('Object Repository/test/Page_MEMO Care/div_141400'))

WebUI.clickOffset(findTestObject('Object Repository/test/Page_MEMO Care/div_141400'), 500, 0)

try {
    WebUI.sendKeys(WebUI.clickOffset(findTestObject('Object Repository/test/Page_MEMO Care/div_141400'), 500, 0), Keys.chord(
            Keys.SHIFT, 'a'))

    WebUI.clickOffset(findTestObject('Object Repository/test/Page_MEMO Care/div_141400'), 700, 0)

    Thread.sleep(5000)
}

