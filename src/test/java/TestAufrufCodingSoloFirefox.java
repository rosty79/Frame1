import static org.junit.Assert.*;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAufrufCodingSoloFirefox {

	WebDriver driver;
	@Before
	public void initTests(){
		System.out.println("Testcases initialisieren");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://codingsolo.de");
	}
	
	@After
	public void afterTest() {
		System.out.println("Der Test vergleich ist abgeschlossen");
		driver.close();
	}
	@Test
	public void Testabschluss(){
		System.out.println("Starte Test Vergleich Title");
		String expect = "coding blog - Coding Solo | programmierblog | tutorials | Videos";
		assertEquals(expect,driver.getTitle());
	}

}
