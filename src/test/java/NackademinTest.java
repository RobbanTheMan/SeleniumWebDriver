import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NackademinTest {

	private static WebDriver driver;
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		
	}

	@AfterClass
	public static void afterclass(){
		
	}
	
	@Test
	public void test() {
		
	StartPage start = new StartPage();
	start.gotoITCourse();
	start.searchFor("Testautomatiserare");
	
	}

}
