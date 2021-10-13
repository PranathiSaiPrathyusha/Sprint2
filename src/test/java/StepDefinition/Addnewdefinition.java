package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksclass;

public class Addnewdefinition {
	WebDriver driver = hooksclass.driver;

	@Given("User is on Uniform Application")
	public void user_is_on_Uniform_Application() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@When("User enter Username {string} and Password {string}")
	public void user_enter_Username_and_Password(String string, String string2) {
		try {
			driver.findElement(By.xpath("//*[@id=\'input-username\']")).sendKeys(string);
			driver.findElement(By.xpath("//*[@id=\'input-password\']")).sendKeys(string2);
		} catch (Exception e) {
			System.out.println("Not Able to enter the login details " + e);
		}
	}

	@When("click on Login button")
	public void click_on_Login_button() {
		try {
			driver.findElement(By.xpath("//button[@type='submit']")).click();

		} catch (Exception e) {
			System.out.println("Not able to click on login button" + e);
		}
	}

	@Then("User navigate to the Dashboard")
	public void user_navigate_to_the_Dashboard() {
		try {
			System.out.println("You are able  to navigate to the welcome page");

		} catch (Exception e) {
			System.out.println("Not able to navigate to the welcome page" + e);
			Assert.fail();
		}
	}

	@Given("User click on Customers icon")
	public void user_click_on_Customers_icon() {
		try {
			driver.findElement(By.xpath("//*[@id='customer']/a")).click();
		} catch (Exception e) {
			System.out.println("Not able to click on Customers icon" + e);
		}
	}

	@When("User click on Cutomers option")
	public void user_click_on_Cutomers_option() {
		try {
			driver.findElement(By.xpath("//*[@id=\'customer\']/ul/li[1]/a")).click();
		} catch (Exception e) {
			System.out.println("Not able to click on Customers option" + e);
		}
	}

	@Then("User click on Add symbol")
	public void user_click_on_Add_symbol() {
		try {
			driver.findElement(By.xpath("//*[@id=\'content\']/div[1]/div/div/a")).click();
		} catch (Exception e) {
			System.out.println("Not able to click on add symbol" + e);
		}
	}

	@When("User enter {string},{string},{string},{string},{string},{string}")
	public void user_enter(String string, String string2, String string3, String string4, String string5,
			String string6) {
		try {
			driver.findElement(By.xpath("//*[@id=\'input-firstname\']")).sendKeys("ramk");
			driver.findElement(By.xpath("//*[@id=\'input-lastname\']")).sendKeys("kamala");
			driver.findElement(By.xpath("//*[@id=\'input-email\']")).sendKeys("k@gmail.com");
			driver.findElement(By.xpath("//*[@id=\'input-telephone\']")).sendKeys("9492862376");
			driver.findElement(By.xpath("//*[@id=\'input-password\']")).sendKeys("vasavich1nn@");
			driver.findElement(By.xpath("//*[@id=\'input-confirm\']")).sendKeys("vasavich1nn@");
		} catch (Exception e) {
			System.out.println("Not able to enter the values" + e);
		}
	}

	@When("User will save the details")
	public void User_will_save_the_details() {
		try {
			driver.findElement(By.xpath("//*[@id=\'content\']/div[1]/div/div/button")).click();
		} catch (Exception e) {
			System.out.println("Not able to save the detils" + e);
		}
	}

	@Then("User will go to dashboard")
	public void user_will_go_to_dashboard() {
		try {

			System.out.println("You are able  to navigate to the welcome page");

		} catch (Exception e) {
			System.out.println("Not able to navigate to the welcome page" + e);
			Assert.fail();
		}
	}

	@When("User enters the {string} to search")
	public void user_enters_the_to_search(String string) {
		try {
			driver.findElement(By.xpath("//*[@id=\'input-name\']")).sendKeys("kamala");

		} catch (Exception e) {
			System.out.println("Not able to enter details" + e);
		}
	}

	@When("User click on filter button")
	public void user_click_on_filter_button() {
		try {
			driver.findElement(By.xpath("//*[@id=\'button-filter\']")).click();
		} catch (Exception e) {
			System.out.println("Not able to click the button" + e);
		}
	}

	@When("User enters the {string},{string} to search")
	public void user_enters_the_to_search(String string, String string2) {
		try {
			driver.findElement(By.xpath("//*[@id=\'input-name\']")).sendKeys("pranathi");
			driver.findElement(By.xpath("//*[@id=\'input-email\']")).sendKeys("pranathi4567@gmail.com");
		} catch (Exception e) {
			System.out.println("Not able to enter the details to filter" + e);
		}
	}

	@Then("User click on Check box")
	public void user_click_on_Check_box() {
		try {
			driver.findElement(By.xpath("//*[@id=\'form-customer\']/div/table/tbody/tr/td[1]/input")).click();
		} catch (Exception e) {
			System.out.println("not able to click the Check box" + e);
		}
	}

	@Then("click on edit option")
	public void click_on_edit_option() {
		try {
			driver.findElement(By.xpath("//*[@id=\'form-customer\']/div/table/tbody/tr[1]/td[8]/a")).click();
		} catch (Exception e) {
			System.out.println("Not able to click the edit option" + e);
		}
	}

	@Then("user enter the {string} to edit")
	public void user_enter_the_to_edit(String string) {
		try {
			driver.findElement(By.xpath(("//*[@id=\'input-telephone\']"))).sendKeys("1234567890");
		} catch (Exception e) {
			System.out.println("Can't able to edit the option" + e);
		}
	}

	@Then("User save the details")
	public void user_save_the_details() {
		try {
			driver.findElement(By.xpath("//*[@id=\'content\']/div[1]/div/div/button/i")).click();
		} catch (Exception e) {
			System.out.println("Not able to Save the details" + e);
		}
	}

	@When("User enters the {string},{string} to delete")
	public void user_enters_the_to_delete(String string, String string2) {
		try {
			driver.findElement(By.xpath("//*[@id=\'input-name\']")).sendKeys("pranathi");
			driver.findElement(By.xpath("//*[@id=\'input-email\']")).sendKeys("pran4567@gmail.com");
		} catch (Exception e) {
			System.out.println("Not able to enter the details to filter" + e);
		}
	}

	@When("User click on filter button to delete")
	public void user_click_on_filter_button_to_delete() {
		try {
			driver.findElement(By.xpath("//*[@id=\'button-filter\']")).click();
		} catch (Exception e) {
			System.out.println("Not able to click the button" + e);
		}
	}

	@Then("User click on Check box to select")
	public void user_click_on_Check_box_to_select() {
		try {
			driver.findElement(By.xpath("//*[@id='form-customer']/div/table/tbody/tr/td[1]/input")).click();
		} catch (Exception e) {
			System.out.println("not able to click the Check box" + e);
			Assert.fail();
		}
	}

	@Then("User click on Delete button")
	public void user_click_on_Delete_button() {
		try {
			driver.findElement(By.xpath("//*[@id=\'content\']/div[1]/div/div/button")).click();

		} catch (Exception e) {
			System.out.println("Not able to click the delete button" + e);
		}
	}

	@Then("User click OK to the dialogue box")
	public void user_click_OK_to_the_dialogue_box() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("Not able to accept" + e);
		}
	}

	@When("User click on the Cutomers Group option")
	public void user_click_on_the_Cutomers_Group_option() {
		try {
			driver.findElement(By.xpath("//*[@id=\'customer\']/ul/li[2]/a")).click();
		} catch (Exception e) {
			System.out.println("Not able to click  the option" + e);
		}
	}

	@When("User click on Add Symbol")
	public void user_click_on_Add_Symbol() {
		try {
			driver.findElement(By.xpath("//*[@id=\'content\']/div[1]/div/div/a/i")).click();
		} catch (Exception e) {
			System.out.println("Not able to click  the  add button" + e);
		}
	}

	@When("User Enter {string}")
	public void user_Enter(String string) {
		try {
			driver.findElement(By.xpath("//*[@id=\'form-customer-group\']/div[1]/div/div/input")).sendKeys("Kamala");
		} catch (Exception e) {
			System.out.println("Not able to enter the details" + e);
		}
	}

	@When("User will save the  details")
	public void user_will_save_the_details() {
		try {
			driver.findElement(By.xpath("//*[@id=\'content\']/div[1]/div/div/button")).click();
		} catch (Exception e) {
			System.out.println("Not able to save the details" + e);
		}
	}

	@When("User click on the Cutomers Field option")
	public void user_click_on_the_Cutomers_Field_option() {
		try {
			driver.findElement(By.xpath("//*[@id=\'customer\']/ul/li[3]/a")).click();
		} catch (Exception e) {
			System.out.println("Not able to click on the Customer Field" + e);
		}
	}

	@When("User enter {string}")
	public void user_enter(String string) {
		try {
			driver.findElement(By.xpath("//*[@id=\'form-custom-field\']/div[1]/div/div/input")).sendKeys("vyshu");
		} catch (Exception e) {
			System.out.println("Not able to enter on the Customer Field Name" + e);
		}
	}

	@When("User click on add custom field")
	public void user_click_on_add_custom_field() {
		try {
			driver.findElement(By.xpath("//*[@id=\'custom-field-value\']/tfoot/tr/td[2]/button")).click();
		} catch (Exception e) {
			System.out.println("Not able to click on custom field" + e);
		}
	}

	@When("User enter {string}, {string}")
	public void user_enter(String string, String string2) {
		try {
			driver.findElement(By.xpath("//*[@id=\'custom-field-value-row0\']/td[1]/div/input")).sendKeys("Vyshnavi");
			driver.findElement(By.xpath("//*[@id=\'custom-field-value-row0\']/td[2]/input")).sendKeys("100");
		} catch (Exception e) {
			System.out.println("Not able to enter on the custom field" + e);
		}
	}

	@When("click on save button")
	public void click_on_save_button() {
		try {
			driver.findElement(By.xpath("//*[@id=\'content\']/div[1]/div/div/button")).click();
		} catch (Exception e) {
			System.out.println("Not able to click the save button" + e);
		}
	}

	@Then("User will navigate go to Dashboard")
	public void user_will_navigate_go_to_Dashboard() {
		try {

			System.out.println("You are able  to navigate to the welcome page");

		} catch (Exception e) {
			System.out.println("Not able to navigate to the welcome page" + e);
			Assert.fail();
		}
	}

}
