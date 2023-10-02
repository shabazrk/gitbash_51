package gitbash;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GitClassTest {
WebDriver driver;
	@Test(alwaysRun = true)

	public void main(String BROWSER) {
		System.out.println("1st test case");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}
