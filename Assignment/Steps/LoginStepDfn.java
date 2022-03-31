package week6.day1.stepdefn;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDfn extends W6D1BaseClass {

	@Given("User Enters User name as {string} and Password as {string}")
	public void user_enters_user_name_as_username_and_password_as_password(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@And("User Click on Logon Button")
	public void user_click_on_logon_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@Then("User lands on {string} page")
	public void user_lands_on_page(String pageText) {
		boolean pgTxt = driver.findElement(By.xpath("//div[text()='" + pageText + "']")).isDisplayed();
		System.out.println(pageText + " is " + pgTxt);
	}

	/*
	 * @But("Username or Password is incorrect") public void
	 * Username_or_Password_is_incorrect() {
	 * System.out.println("Username or Password is incorrect"); }
	 */

}
