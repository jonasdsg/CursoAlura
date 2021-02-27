package leilao;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		WebDriver browser = new ChromeDriver();
		browser.navigate().to("http://localhost:8080/login");
		browser.findElement(By.name("username")).sendKeys("fulano");
		browser.findElement(By.name("password")).sendKeys("pass");
		browser.findElement(By.id("login-form")).submit();
	}
}
