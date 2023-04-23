package Test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Common.TestBase;

public class PracticeForm {
	public static void TestTC1() {
		TestBase testB = new TestBase();
		testB.openWebBrowser();
		// Nhập text
		String inputFirstName = "Cao Trần";
		String inputLastName = "Đại";
		String inputEmail = "abc@gmai.com";
		String inputMobile = "0393364446";
		String inputYear = "2022";
		String inputMonth = "6";
		String inputDays = "19";
		String inputSalary = "Maths";
		String inputCurrentAddress= "UBQN";
		
		//Các bước thực hiện
		((JavascriptExecutor) testB.dr) .executeScript("window.scrollTo(0, document.body.scrollHeight)" );
		testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]")).click();
		testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul")).click();
		((JavascriptExecutor) testB.dr) .executeScript("window.scrollTo(0, document.body.scrollHeight)" );
		testB.dr.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(inputFirstName); 
		testB.dr.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(inputLastName);
		testB.dr.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys(inputEmail);
		testB.dr.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]")).click();
		testB.dr.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys(inputMobile);
		((JavascriptExecutor) testB.dr) .executeScript("window.scrollTo(0, document.body.scrollHeight)" );
		testB.dr.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div/div")).click();
		Select drpYear = new Select(testB.dr.findElement(By.className("react-datepicker__year-select")));
		drpYear.selectByValue(inputYear);
		
		Select drpMonth = new Select(testB.dr.findElement(By.className("react-datepicker__month-select")));
		drpMonth.selectByValue(inputMonth);
		
		testB.inputDay(inputDays);
		
//		testB.dr.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys(inputSalary);
//		Select drpSalary = new Select(testB.dr.findElement(By.className("subjects-auto-complete__control")));
//		drpSalary.selectByValue(inputSalary);
		
		
		
//		testB.dr.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys(inputSalary);
		testB.dr.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]")).click();
		testB.dr.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys(inputCurrentAddress);
//		testB.dr.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]")).click();
//		testB.dr.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]")).click();
		
//		testB.dr.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]")).click();
//		Select drpDay = new Select(testB.dr.findElement(By.className("react-datepicker__year-select")));
//		drpDay.selectByValue(inputDay);
		
//		testB.dr.findElement(By.xpath("//*[@id=\"//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]\"]")).sendKeys(inputMobile);
//		testB.dr.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")).sendKeys(inputYear);
//		testB.dr.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]")).sendKeys(inputDay);
//		testB.dr.findElement(By.xpath("//*[@id=\"department\"]")).sendKeys(inputDepartment);
		
		
//		WebElement submit = testB.dr.findElement(By.xpath("//*[@id=\"submit\"]"));
//		((JavascriptExecutor) testB.dr) .executeScript("window.scrollTo(0, document.body.scrollHeight)" );
		
//		submit.click();	
		
//		--------- Test Case ---------
		
//		String actualFirstName = testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]")).getText();
//		System.out.println(actualFirstName.equals(inputFirstName) ? "TC1 - Pass : First Name"
//				: "TC1 - Fail");
//		
//		String actualLastName = testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[2]")).getText();
//		System.out.println(actualLastName.equals(inputLastName) ? "TC1 - Pass : Last Name"
//				: "TC1 - Fail");
//		
//		String actualAge = testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[3]")).getText();
//		System.out.println(actualAge.equals(inputAge) ? "TC1 - Pass : Age"
//				: "TC1 - Fail");
//		
//		String actualEmail = testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[4]")).getText();
//		System.out.println(actualEmail.equals(inputEmail) ? "TC1 - Pass : Email"
//				: "TC1 - Fail");
//		
//		String actualSalary = testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[5]")).getText();
//		System.out.println(actualSalary.equals(inputSalary) ? "TC1 - Pass : Salary"
//				: "TC1 - Fail");
//		
//		String actualDepartment = testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[6]")).getText();
//		System.out.println(actualDepartment.equals(inputDepartment) ? "TC1 - Pass : Department"
//				: "TC1 - Fail");
	}
}
