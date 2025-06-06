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

WebUI.navigateToUrl('http://localhost:5173/')

WebUI.click(findTestObject('Object Repository/Page_Vite  React/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Vite  React/input_email'), 'farah.tarek1111@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vite  React/input_password'), '9NLz+4tGZcQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vite  React/input_password_1'), 'XiAF17oJDGI=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vite  React/input_password_1_2'), 'swD4Ytp13vg=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vite  React/input_password_1_2_3'), 'VcHV+REQKxE=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vite  React/input_password_1_2_3_4'), 'jy4+IaZb2aQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vite  React/input_password_1_2_3_4_5'), 'lvyzabSiJvk=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vite  React/input_password_1_2_3_4_5_6'), 'TOB6LhZr9Os=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vite  React/input_password_1_2_3_4_5_6_7'), 'NQCSeeLB4G8=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vite  React/input_password_1_2_3_4_5_6_7_8'), 'qcbjT3Xj/inj8IGhYZHETw==')

WebUI.click(findTestObject('Object Repository/Page_Vite  React/button_Login_1'))

WebUI.click(findTestObject('Object Repository/Page_Vite  React/div_'))

WebUI.click(findTestObject('Object Repository/Page_Vite  React/a_Profile'))

WebUI.click(findTestObject('Object Repository/Page_Vite  React/button_Edit Profile'))

WebUI.setText(findTestObject('Object Repository/Page_Vite  React/input_Phone_phone'), '01012241')

WebUI.click(findTestObject('Object Repository/Page_Vite  React/button_Save'))

