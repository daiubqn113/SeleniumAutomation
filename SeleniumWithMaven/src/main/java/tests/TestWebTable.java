package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;
import pages.WebTablesPage;

public class TestWebTable extends TestCase{
	@Test(description = "TC1 - Submit successfully", dataProvider = "InputData")
	public void submitSuccessfully(String inputFullName, String inputEmail, String inputCurrentAddress,
			String inputPermanentAddress) {

		openWebsite();
		HomePage homePage = new HomePage(testBase.driver);
		ElementsPage elementsPage = homePage.clickOnElementsMenu();
		WebTablesPage webTablesPage = WebTablesPage.clickOnElementsMenu();
		textBoxPage.testBase.inputText(testBase.driver, inputFullName, textBoxPage.locFullName);
		textBoxPage.testBase.inputText(testBase.driver, inputEmail, textBoxPage.locEmail);
		textBoxPage.testBase.inputText(testBase.driver, inputCurrentAddress, textBoxPage.locCurrentAddress);
		textBoxPage.testBase.inputText(testBase.driver, inputPermanentAddress, textBoxPage.locPermanentAddress);
		textBoxPage.testBase.click(testBase.driver,textBoxPage.locSubmit);

		assertEquals(textBoxPage.getTextAfterSubmit(textBoxPage.locName_Displayed), inputFullName);
		assertEquals(textBoxPage.getTextAfterSubmit(textBoxPage.locEmail_Displayed), inputEmail);
		assertEquals(textBoxPage.getTextAfterSubmit(textBoxPage.locCurrentAddress_Displayed), inputCurrentAddress);
		assertEquals(textBoxPage.getTextAfterSubmit(textBoxPage.locPermananetAddress_Displayed), inputPermanentAddress);

	}

	@DataProvider(name = "InputData")
	public String[][] inputTestData() {
		String[][] testData = new String[1][4];
		testData[0][0] = "Đại";
		testData[0][1] = "dai@gmail.com";
		testData[0][2] = "Uông Bí";
		testData[0][3] = "Uông Bí Quảng Ninh";
		return testData;
	}
}
