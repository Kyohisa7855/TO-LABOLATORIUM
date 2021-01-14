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

WebUI.navigateToUrl('https://www.morele.net/')

WebUI.click(findTestObject('Object Repository/Page_Sklep komputerowy Morele.net/main_Pobierz nasz aplikacj mobiln WYPRZEDA _ed58d4'))

WebUI.click(findTestObject('Object Repository/Page_Sklep komputerowy Morele.net/img'))

WebUI.setText(findTestObject('Object Repository/Page_Sklep komputerowy Morele.net/input_Firma_name_1'), 'Jan')

WebUI.setText(findTestObject('Object Repository/Page_Sklep komputerowy Morele.net/input_nazwa_name_2'), 'Kowalski')

WebUI.setText(findTestObject('Object Repository/Page_Sklep komputerowy Morele.net/input_NIP_street'), 'Warszawa')

WebUI.setText(findTestObject('Object Repository/Page_Sklep komputerowy Morele.net/input_ulica_home_number'), '12')

WebUI.setText(findTestObject('Object Repository/Page_Sklep komputerowy Morele.net/input_kod pocztowy_city'), 'Warszawa')

WebUI.setText(findTestObject('Object Repository/Page_Sklep komputerowy Morele.net/input_Warszawa_phone'), '+48 123 456 789')

WebUI.setText(findTestObject('Object Repository/Page_Sklep komputerowy Morele.net/input_nr telefonu komrkowego_email'), 
    'email.@ema')

WebUI.switchToWindowTitle('Sklep komputerowy Morele.net')

WebUI.setText(findTestObject('Object Repository/Page_Sklep komputerowy Morele.net/input_nr telefonu komrkowego_email'), 
    'email.@email')

WebUI.switchToWindowTitle('Sklep komputerowy Morele.net')

WebUI.setText(findTestObject('Object Repository/Page_Sklep komputerowy Morele.net/input_nr telefonu komrkowego_email'), 
    'email.@email..comm')

WebUI.switchToWindowTitle('Sklep komputerowy Morele.net')

WebUI.setText(findTestObject('Object Repository/Page_Sklep komputerowy Morele.net/input_nr telefonu komrkowego_email'), 
    'email.@email..comm')

WebUI.closeBrowser()

