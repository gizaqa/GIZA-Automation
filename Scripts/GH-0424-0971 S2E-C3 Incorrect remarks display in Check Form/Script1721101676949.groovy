import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.util.KeywordUtil
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
import org.openqa.selenium.By as By

Windows.startApplicationWithTitle('C:\\Program Files\\GIZA\\GIZA.exe', 'GIZA')

Windows.click(findWindowsObject('Object Repository/Edit'))

Windows.clearText(findWindowsObject('Object Repository/Edit'))

Windows.click(findWindowsObject('Object Repository/Edit'))

Windows.setText(findWindowsObject('Object Repository/Edit'), '28080@192.168.0.148\r\n')

Windows.click(findWindowsObject('Object Repository/Button'))

Windows.switchToWindowTitle('GIZA™ 24')

Windows.click(findWindowsObject('Object Repository/Button(2)'))

Windows.setText(findWindowsObject('Object Repository/Edit(1)'), 'C:\\Users\\IDS\\Downloads\\New folder\\S2E-C3_1B124_E.gza')

Windows.click(findWindowsObject('Object Repository/SplitButton'))

Windows.click(findWindowsObject('Object Repository/Button(3)'))

Windows.click(findWindowsObject('Object Repository/Button(4)'))

Windows.click(findWindowsObject('Object Repository/Button(5)'))

Windows.click(findWindowsObject('Object Repository/Button(6)'))

'parts>>pane'
// Define the variable to store the element
WebElement paneElement = Windows.findElement(findWindowsObject('Object Repository/Pane'))

// Get the list of child elements
List<WebElement> childElements = paneElement.findElements(By.xpath(".//*"))

// Iterate over the child elements
for (WebElement child : childElements) {
	String partsCheck = child.getText()
	if (partsCheck == "Local Buckling Capacity :") {
          KeywordUtil.markFailed(partsCheck + "Check should not display!")
    }
}


