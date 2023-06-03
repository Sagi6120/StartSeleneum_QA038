import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelfSample {

    WebDriver wd;
    String browser = "Chrome";

   @BeforeTest
    public void precondition(){
       wd = new ChromeDriver();
       wd.manage().window() .maximize();
       wd.navigate().to("https://www.saucedemo.com/");
   //WebDriverManager.chromedriver().setup();

   }

   @Test
    public void test(){
       wd.findElement(By.name("user-name")).sendKeys("standard_user");
       wd.findElement(By.name("password")).sendKeys("secret_sauce" + Keys.ENTER);
       wd.findElement(By.id("add-to-cart-sauce-labs-backpack")) .click();

   }
   @AfterTest
    public void postcondition(){
       wd.findElement(By.id("react-burger-menu-btn")).click();
       wd.findElement(By.id("logout_sidebar_link")).click();

   }

}

