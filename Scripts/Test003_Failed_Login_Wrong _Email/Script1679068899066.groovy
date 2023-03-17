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

Mobile.startApplication('C:\\Users\\Lenovo\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\UKE594XW\\Sample_Android_App_-_Login_Tes_4.0_Apkpure[1].apk', 
    true)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - test001mailnesia.com'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (6)'), 'test01@mailnesia.com')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText (7)'), 0)

Mobile.sendKeys(findTestObject(''), 'test001')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/android.widget.Button - LOGIN (3)'), 0)

WebUI.getText(findTestObject('android.widget.TextView - Wrong Email or Password'))

Mobile.closeApplication()

