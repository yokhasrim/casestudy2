package packnew1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepdef {
	WebDriver driver;
	@Given("open the url")
	public void url(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\DRIVER1\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");	
	}
	@And("click the signin button")
	public void signin(){
		driver.findElement(By.linkText("SignIn")).click();
	}
	@And("enter the {word}")
	public void username(String a){
		driver.findElement(By.name("userName")).sendKeys(a);

	}
	@And("enter the password {word}")
	public void password(String b){
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(b);

	}
	@Then("click login")
	public void login(){
		driver.findElement(By.name("Login")).click();
	}

}

