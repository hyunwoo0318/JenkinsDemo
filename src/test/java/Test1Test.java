// Generated by Selenium IDE
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Test1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test1() throws InterruptedException {
    // Test name: test1
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://mvnrepository.com/");
    Thread.sleep(1000);
    // 2 | setWindowSize | 1008x875 | 
    driver.manage().window().setSize(new Dimension(1008, 875));
    Thread.sleep(1000);
    // 3 | click | linkText=Flapdoodle Embedded Process Util | 
    driver.findElement(By.linkText("Flapdoodle Embedded Process Util")).click();
    Thread.sleep(1000);
    // 4 | click | linkText=4.7.0 | 
    driver.findElement(By.linkText("4.7.0")).click();
    Thread.sleep(1000);
    // 5 | mouseOver | linkText=Java Specifications | 
    {
      WebElement element = driver.findElement(By.linkText("Java Specifications"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
      Thread.sleep(1000);
    }
    // 6 | mouseOver | linkText=Logging Frameworks | 
    {
      WebElement element = driver.findElement(By.linkText("Logging Frameworks"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
      Thread.sleep(1000);
    }
    // 7 | click | linkText=Logging Frameworks | 
    driver.findElement(By.linkText("Logging Frameworks")).click();
    Thread.sleep(1000);
    // 8 | click | linkText=Testing Frameworks & Tools | 
    driver.findElement(By.linkText("Testing Frameworks & Tools")).click();
    Thread.sleep(1000);
    // 9 | mouseOver | linkText=Popular Categories | 
    {
      WebElement element = driver.findElement(By.linkText("Popular Categories"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
      Thread.sleep(1000);
    }
    // 10 | mouseOver | css=.box-content > a > img | 
    {
      WebElement element = driver.findElement(By.cssSelector(".box-content > a > img"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
      Thread.sleep(1000);
    }
    // 11 | mouseOut | css=.box-content > a > img | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
      Thread.sleep(1000);
    }
    // 12 | type | id=query | junit
    driver.findElement(By.id("query")).sendKeys("junit");
    Thread.sleep(1000);
    // 13 | sendKeys | id=query | ${KEY_ENTER}
    driver.findElement(By.id("query")).sendKeys(Keys.ENTER);
    Thread.sleep(1000);
    // 14 | click | linkText=JUnit | 
    driver.findElement(By.linkText("JUnit")).click();
    Thread.sleep(1000);
    // 15 | click | css=.tabs > li:nth-child(2) > a | 
    driver.findElement(By.cssSelector(".tabs > li:nth-child(2) > a")).click();
    Thread.sleep(1000);
  }
}
