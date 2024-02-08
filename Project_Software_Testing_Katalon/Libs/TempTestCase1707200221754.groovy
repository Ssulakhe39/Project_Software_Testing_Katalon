import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/8q/jlctx72j4sn44snzr8_t_r7h0000gn/T/Katalon/20240206_114701/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://www.amazon.in/\')\n\nWebUI.click(findTestObject(\'Page_Online Shopping site in India Shop Onl_10c5f3/span_All\'))\n\nWebUI.click(findTestObject(\'Page_Online Shopping site in India Shop Onl_10c5f3/div_nav-sprite hmenu-close-icon\'))\n\nWebUI.click(findTestObject(\'Page_Online Shopping site in India Shop Onl_10c5f3/a_Electronics\'))\n\nWebUI.doubleClick(findTestObject(\'Page_Electronics Store Buy Electronics prod_1485cf/i_Next page\'))\n\nWebUI.click(findTestObject(\'Page_Electronics Store Buy Electronics prod_1485cf/i_Next page\'))\n\nWebUI.click(findTestObject(\'Page_Electronics Store Buy Electronics prod_1485cf/i_Next page\'))\n\nWebUI.click(findTestObject(\'Page_Electronics Store Buy Electronics prod_1485cf/i_Next page\'))\n\nWebUI.click(findTestObject(\'Page_Electronics Store Buy Electronics prod_1485cf/i_Next page\'))\n\nWebUI.click(findTestObject(\'Page_Electronics Store Buy Electronics prod_1485cf/i_Next page\'))\n\nWebUI.click(findTestObject(\'Page_Electronics Store Buy Electronics prod_1485cf/img_a-dynamic-image sl-sobe-carousel-sub-card-img\'))\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

