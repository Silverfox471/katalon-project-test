import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

if (true) {
    WebUI.click(findTestObject('Page_My Store/a_Sign in'))

    WebUI.verifyElementPresent(findTestObject('Signin-function/Page_Login - My Store/input_Email address_email', [('variable') : '']), 
        0)

    break
}

if (true) {
    WebUI.setText(findTestObject('Page_Login - My Store/input_Email address_email'), 'guillaume.troget@outlook.com')

    WebUI.setEncryptedText(findTestObject('Page_Login - My Store/input_Password_passwd'), 'Ja0Pxz27WxSR53LBwf/n5g==')

    break
}

if (true) {
    WebUI.click(findTestObject('Page_Login - My Store/span_Sign in'))

    while (true) {
    }
    
    continue
}

if (true) {
    WebUI.closeBrowser()

    continue
}

