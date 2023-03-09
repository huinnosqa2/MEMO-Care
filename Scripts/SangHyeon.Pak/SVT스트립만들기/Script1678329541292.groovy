import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.security.KeyFactory as KeyFactory
import java.util.concurrent.ConcurrentHashMap.KeySetView as KeySetView
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://partner-qa.memopatch.care/login')

WebUI.setText(findTestObject('Object Repository/test/Page_MEMO Care/Page_MEMO Care/Page_MEMO Care/input__sc-ieecCq icKGXT'), 
    'sangyhyeon.park+qa2@huinno.com')

WebUI.setEncryptedText(findTestObject('Object Repository/test/Page_MEMO Care/Page_MEMO Care/Page_MEMO Care/input__sc-ieecCq icKGXT_1'), 
    'MSZn4fS/R/qEuowV0kSsuQ==')

WebUI.sendKeys(findTestObject('Object Repository/test/Page_MEMO Care/Page_MEMO Care/Page_MEMO Care/input__sc-ieecCq icKGXT_1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/test/Page_MEMO Care/Page_MEMO Care/Page_MEMO Care/div__1'))

WebUI.click(findTestObject('Object Repository/test/Page_MEMO Care/Page_MEMO Care/Page_MEMO Care/td_11e6e389'))

WebUI.click(findTestObject('Object Repository/test/Page_MEMO Care/Page_MEMO Care/Page_MEMO Care/div_Event Review'))

WebUI.click(findTestObject('Object Repository/test/Page_MEMO Care/Page_MEMO Care/Page_MEMO Care/div_141400'))
WebUI.click(findTestObject('Object Repository/test/Page_MEMO Care/Page_MEMO Care/Page_MEMO Care/div_SVT'))

WebDriver driver = DriverFactory.getWebDriver()

Actions builder = new Actions(driver)

WebElement sourceElement = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/test/Page_MEMO Care/Page_MEMO Care/Page_MEMO Care/div_141400'), 
    20)

WebElement destElement = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/test/Page_MEMO Care/Page_MEMO Care/Page_MEMO Care/div_141400'), 
    20)

builder.moveToElement(destElement, 200, 0).click().keyDown(Keys.SHIFT).release().build().perform()

WebUI.delay(2)

builder.moveToElement(destElement, 400, 0).click().keyDown(Keys.SHIFT).release().build().perform()

WebUI.delay(2)

builder.moveToElement(WebUiCommonHelper.findWebElement(findTestObject('Object Repository/test/Page_MEMO Care/Page_MEMO Care/Page_MEMO Care/div_S beatW'), 20)).doubleClick ().keyDown(Keys.SHIFT).release().build().perform()



WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/test/Page_MEMO Care/Page_MEMO Care/Page_MEMO Care/div_SVT'))

WebUI.delay(10)