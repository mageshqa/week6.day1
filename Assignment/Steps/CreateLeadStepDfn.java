package week6.day1.stepdefn;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDfn extends W6D1BaseClass {

	/*
	 * @Given("User Enters User name as {string} and Password as {string}") public
	 * void user_enters_user_name_as_and_password_as(String string, String string2)
	 * {
	 * 
	 * }
	 * 
	 * @And("User Click on Logon Button") public void user_click_on_logon_button() {
	 * // Write code here that turns the phrase above into concrete actions throw
	 * new io.cucumber.java.PendingException(); }
	 */

	@When("User clicks on Lead tab")
	public void user_clicks_on_lead_tab() {
		driver.findElement(By.linkText("Leads")).click();

	}

	@When("User Clicks on Create Lead link under Shortcuts section")
	public void user_clicks_on_create_lead_link_under_shortcuts_section() {
		driver.findElement(By.linkText("Create Lead")).click();

	}

	/*
	 * @Then("User lands on {string} page") public void user_lands_on_page(String
	 * string) { System.out.println(driver.getTitle()); }
	 */

	/*
	 * @Then("User lands on Create Lead page") public void
	 * user_lands_on_create_lead_page() { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 */
	@When("Enters Company Name as {string}")
	public void enters_company_name_as(String compName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);

	}

	@And("Enters First Name as {string}")
	public void enters_first_name_as(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);

	}

	@And("Enters Last Name as {string}")
	public void enters_last_name_as_last_name(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}

	@And("Clicks Create Lead Button")
	public void clicks_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("User comes to Lead Summary page")
	public void user_comes_to_lead_summary_page() {
		System.out.println(driver.getTitle());
	}

}
