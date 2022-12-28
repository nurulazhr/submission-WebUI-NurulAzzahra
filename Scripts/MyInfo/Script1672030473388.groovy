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

//WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/sideMyInfo'))

WebUI.verifyElementText(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/verifViewPersonalDetails'), 'Personal Details') //verif masuk ke view personal details

WebUI.click(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/sideContactDetails')) 

WebUI.verifyElementText(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/verifViewContactDetails'), 'Contact Details') //verif masuk ke view contact details

WebUI.setText(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/inputStreet1'), '1Street123')

WebUI.setText(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/inputStreet2'), '2Street123')

WebUI.setText(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/inputCity'), 'Testcity123')

WebUI.setText(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/inputStateProvince'), 'Testprovince123')

WebUI.setText(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/inputZipPostalCode'), '123')

WebUI.click(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/ddCountry'))

WebUI.click(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/selectCountry'))

WebUI.setText(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/inputTelpHome'), '0812345')

WebUI.setText(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/inputTelpMobile'), '02123456')

WebUI.setText(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/inputTelpWork'), '90203040')

WebUI.setText(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/inputWorkEmail'), 'testemailwork@gmail.com')

WebUI.setText(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/inputOtherEmail'), 'testotheremail@gmail.com')

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/button_Save'))

WebUI.delay(10)

WebUI.takeScreenshot()


//Upload file
WebUI.click(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/button_Add'))

WebUI.uploadFile(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/generateUploadFile'), file)

WebUI.setText(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/inputComment'), 'test')

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/button_Save1'))

WebUI.delay(10)

WebUI.takeScreenshot()


//LOGOUT
WebUI.click(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/ddLogout'))

WebUI.click(findTestObject('Object Repository/MyInfo/Page_OrangeHRM/a_Logout'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_OrangeHRM/verifAccessWeb'), 'Login') //verif berhasil kembali ke landing page

WebUI.takeScreenshot()





