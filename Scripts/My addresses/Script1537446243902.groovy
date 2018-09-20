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

WebUI.click(findTestObject('Object Repository/My adresses/Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/My adresses/Page_Login - My Store/input_Email address_email'), 'guillaume.troget@outlook.com')

WebUI.setEncryptedText(findTestObject('Object Repository/My adresses/Page_Login - My Store/input_Password_passwd'), a)

WebUI.click(findTestObject('Object Repository/My adresses/Page_Login - My Store/span_Sign in'))

WebUI.click(findTestObject('Object Repository/My adresses/Page_My account - My Store/span_My addresses'))

WebUI.click(findTestObject('Object Repository/My adresses/Page_Addresses - My Store/span_Update'))

WebUI.setText(findTestObject('Object Repository/My adresses/Page_Address - My Store/input__firstname'), 'Guillaume2')

WebUI.click(findTestObject('Object Repository/My adresses/Page_Address - My Store/span_Save'))

WebUI.setText(findTestObject('Object Repository/My adresses/Page_Address - My Store/input__firstname'), 'Guillaume')

WebUI.click(findTestObject('Object Repository/My adresses/Page_Address - My Store/span_Save'))

WebUI.click(findTestObject('Object Repository/My adresses/Page_Addresses - My Store/span_Back to your account'))

WebUI.closeBrowser()

