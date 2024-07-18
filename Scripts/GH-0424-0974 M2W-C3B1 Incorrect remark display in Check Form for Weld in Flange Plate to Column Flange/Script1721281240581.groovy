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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Windows.startApplicationWithTitle('C:\\Program Files\\GIZA\\GIZA.exe', 'GIZA')

Windows.clearText(findWindowsObject('Object Repository/GH-0424-0974 M2W-C3B1/Edit'))

Windows.setText(findWindowsObject('Object Repository/GH-0424-0974 M2W-C3B1/Edit'), 
    '28080@192.168.0.148')

Windows.click(findWindowsObject('Object Repository/GH-0424-0974 M2W-C3B1/Button'))

Windows.switchToWindowTitle('GIZA™ 24')

Windows.click(findWindowsObject('Object Repository/GH-0424-0974 M2W-C3B1/Button(1)'))

Windows.setText(findWindowsObject('Object Repository/GH-0424-0974 M2W-C3B1/Edit(1)'), 
    'C:\\Users\\IDS\\Downloads\\New folder\\GZA-12174.gza')

Windows.click(findWindowsObject('Object Repository/GH-0424-0974 M2W-C3B1/SplitButton'))

Windows.click(findWindowsObject('Object Repository/GH-0424-0974 M2W-C3B1/Button(2)'))

Windows.click(findWindowsObject('Object Repository/GH-0424-0974 M2W-C3B1/Button(3)'))

WebElement weldCapacitypane = Windows.findElement(findWindowsObject('Object Repository/GH-0424-0974 M2W-C3B1/Edit(2)'))

// Get the list of child elements
//List<WebElement> childElements = weldCapacitypane.findElements(By.xpath('.//*'))

if (weldCapacitypane.contains('Weld Type is eaither not applicable or not yet supported, NOT OK')) {
	KeywordUtil.markFailed(partsCheck + ' Check should not display!')
}

// Iterate over the child elements
//for (WebElement child : childElements) {
//	String partsCheck = child.getText()
//	
//}



