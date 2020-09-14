/*Using TestNG and WebDriver script Please try to cover the following. This question
carries 15 marks. You are free to use any of the browsers (Chrome or Firefox)
a. Open the website https://www.rediff.com/ (1/2 mark)
b. Click on the menu for News (1/2 mark)
c. Take a screenshot (showing that the News is clicked) (1/2 mark)
d. Get the Href’s of all the submenu items (e.g headlines, defence etc) (2 marks)
e. Assert that the tool tip of the adjacent menu item Business is “Business
Headlines” (1.5 marks)
f. Hover the mouse on the adjacent menu item (Business) showing the tool tip
“Business Headlines”. Take a screenshot showing the tooltip (4 marks)
g. Assert that the background colour of the submenu items for News is having the
following RGB (188, 62, 49) value. ( 2 Marks)
h. Assert that the value of RGB in above step maps to the following colour name
(Grenadier) – Hint use the following website to get the colour name from RGB
values https://www.color-blindness.com/color-name-hue/ (4 Marks)*/

package CPSAT_javaSoln;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;


public class Q1_RediffSoln{
	WebDriver driver;
	

@Test
public  void Q1_Rediff() {
	
	driver.get("https://www.rediff.com/");
	
  }

  @BeforeTest
  public void beforeTest() {
		driver = utils.HelperFunctions.createAppropriateDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }
}

