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

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/sideAdmin'))

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Page_OrangeHRM/verifViewAdmin'), 'Admin')  //verif view admin

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/button_AddAdmin'))

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Page_OrangeHRM/verifyviewAddUser'), 'Add User') //verif view add user

WebUI.delay(5)

WebUI.takeScreenshot()

//add data - negative case - input kosong
WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/button_Save'))

//verif negative case
WebUI.verifyElementText(findTestObject('Object Repository/Admin/Page_OrangeHRM/alertRequiredAdd'), 'Required')

WebUI.delay(5)

WebUI.takeScreenshot()


//add data - positive case
WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/selectUserRole'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/selectUserRoleAdmin'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/selectStatus'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/selectStatusEnabled'))

WebUI.setText(findTestObject('Object Repository/Admin/Page_OrangeHRM/inputEmployeeName'), 'I')

WebUI.delay(5) //untuk load data

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/selectEmployeeName'))

WebUI.setText(findTestObject('Object Repository/Admin/Page_OrangeHRM/inputUsername'), 'Admintestt12356')

WebUI.setText(findTestObject('Object Repository/Admin/Page_OrangeHRM/inputPassword'), 'TestAdmin123%')

WebUI.setText(findTestObject('Object Repository/Admin/Page_OrangeHRM/inputConfirmPassword'), 'TestAdmin123%')

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Page_OrangeHRM/verifViewAdmin'), 'Admin') //verif masuk ke list data admin lagi

WebUI.delay(5)

WebUI.takeScreenshot()


//search data - negative case
WebUI.setText(findTestObject('Object Repository/Admin/Page_OrangeHRM/searchUsername'), 'Testtest')

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/button_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Page_OrangeHRM/verifNoRecordsFound'), 'No Records Found') //verif data ditemukan

WebUI.delay(5)

WebUI.takeScreenshot()

//search data - positive case
WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/button_Reset'))

WebUI.setText(findTestObject('Object Repository/Admin/Page_OrangeHRM/searchUsername'), 'Admintestt12356')

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/button_Search'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Page_OrangeHRM/verifRecordFound'), '(1) Record Found') //verif data ditemukan

WebUI.delay(5)

WebUI.takeScreenshot()





