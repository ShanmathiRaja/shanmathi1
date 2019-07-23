package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case1 {
	WebDriver driver=null;
	@Given("the home page is opened")
	public void the_home_page_is_opened() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		driver.get(url);
		driver.manage().window().maximize();
	   
	}

	@When("user click the signup")
	public void user_click_the_signup() {
		driver.findElement(By.linkText("SignUp")).click();
	   
	}

	@When("user enters username as shanmathi")
	public void user_enters_username_as_shanmathi() {
		driver.findElement(By.id("userName")).sendKeys("shanmathi");
	    
	}

	@When("user enters firstname as shanmathi")
	public void user_enters_firstname_as_shanmathi() {
		driver.findElement(By.id("firstName")).sendKeys("shanmathi");
	  
	}

	@When("user enters lastname as Raja")
	public void user_enters_lastname_as_Raja() {
		driver.findElement(By.id("lastName")).sendKeys("Raja");
	   
	}

	@When("user enters password as {int}")
	public void user_enters_password_as(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("123456789");
	    
	}

	@When("user enters confirm password as {int}")
	public void user_enters_confirm_password_as(Integer int1) {
		driver.findElement(By.name("confirmPassword")).sendKeys("123456789");
	    
	}

	@When("user clicks gender as female")
	public void user_clicks_gender_as_female() {
		WebElement radio1=driver.findElement(By.xpath("//input[@value='Female']"));
				radio1.click();
	    
	}

	@When("user enters email as shanmathiraja{int}@gmail.com")
	public void user_enters_email_as_shanmathiraja_gmail_com(Integer int1) {
		driver.findElement(By.id("emailAddress")).sendKeys("shanmathiraja2112@gmail.com");
	    
	}

	@When("user enters mobile number as {int}")
	public void user_enters_mobile_number_as(Integer int1) {
		driver.findElement(By.id("mobileNumber")).sendKeys("9788351565");
	    
	}

	@When("user enters date of birth as {int}\\/{int}\\/{int}")
	public void user_enters_date_of_birth_as(Integer int1, Integer int2, Integer int3) {
		driver.findElement(By.id("dob")).sendKeys("21/12/1998");
	   
	}

	@When("user enters address as {int},Desi Chettty Street")
	public void user_enters_address_as_Desi_Chettty_Street(Integer int1) {
		driver.findElement(By.id("address")).sendKeys("41,Desi Chetty Street");
	    	}

	@When("user security question as what is your favour color?")
	public void user_security_question_as_what_is_your_favour_color() {
		Actions act1=new Actions(driver);
		act1.moveToElement(driver.findElement(By.id("securityQuestion"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		
		
	    
	}

	@When("user enters answer as black")
	public void user_enters_answer_as_black() {
		driver.findElement(By.id("answer")).sendKeys("Black");
	    
	}

	@When("user clicks Register button")
	public void user_clicks_Register_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("user will directed to login page")
	public void user_will_directed_to_login_page() {
	    
	}



}
