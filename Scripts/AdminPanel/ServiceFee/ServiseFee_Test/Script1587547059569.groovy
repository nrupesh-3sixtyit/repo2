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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://pre-prod.emtrip.solutions/Admin')

WebUI.setText(findTestObject('Object Repository/Admin_ServiseFee_Obj/Page_EmTrip/input_Username_UserName'), 'devAdmin')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin_ServiseFee_Obj/Page_EmTrip/input_Password_Password'), 'PBcz0Z3Mvwo05TOG3o1JjQ==')

WebUI.click(findTestObject('Object Repository/Admin_ServiseFee_Obj/Page_EmTrip/input_Forgot your password_button-orange lo_051760'))

WebUI.click(findTestObject('Object Repository/Admin_ServiseFee_Obj/Page_Welcome to Admin Panel/a_Services'))

WebUI.click(findTestObject('Object Repository/Admin_ServiseFee_Obj/Page_Welcome to Admin Panel/a_Flights'))

WebUI.click(findTestObject('Object Repository/Admin_ServiseFee_Obj/Page_Welcome to Admin Panel/a_Flight                                   _1118c9'))

WebUI.click(findTestObject('Object Repository/Admin_ServiseFee_Obj/Page_Welcome to Admin Panel/input_SubAgency _submit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin_ServiseFee_Obj/Page_Welcome to Admin Panel/select_---Select Journey Type ---OneWayRetu_bb8adc'), 
    'OneWay', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin_ServiseFee_Obj/Page_Welcome to Admin Panel/select_--Select Supplier--AirArabiaAirIndia_a3f384'), 
    'AirArabia', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin_ServiseFee_Obj/Page_Welcome to Admin Panel/select_---Select Rule ---AirlinesCountryCit_127fa7'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Admin_ServiseFee_Obj/Page_Welcome to Admin Panel/input_Fee _IsAmountPercentage'))

WebUI.setText(findTestObject('Object Repository/Admin_ServiseFee_Obj/Page_Welcome to Admin Panel/input_Fee _TxtAmountPercentage'), 
    '0')

WebUI.click(findTestObject('Object Repository/Admin_ServiseFee_Obj/Page_Welcome to Admin Panel/input_Execution Sequence _button-orange but_3f598b'))

WebUI.click(findTestObject('Object Repository/Admin_ServiseFee_Obj/Page_Welcome to Admin Panel/a_Logout'))

WebUI.closeBrowser()

