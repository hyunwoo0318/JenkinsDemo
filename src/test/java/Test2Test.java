// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Test2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test2() throws InterruptedException {
    driver.get("https://github.com/");Thread.sleep(2000);
    driver.manage().window().setSize(new Dimension(1440, 875));Thread.sleep(2000);
    driver.findElement(By.cssSelector(".HeaderMenu-item:nth-child(3) > .HeaderMenu-link")).click();Thread.sleep(2000);
    driver.findElement(By.cssSelector(".border-bottom:nth-child(2) > .list-style-none .color-fg-default")).click();Thread.sleep(2000);
    driver.findElement(By.cssSelector(".d-flex:nth-child(1) > .col-8 span")).click();Thread.sleep(2000);
    driver.findElement(By.cssSelector("p:nth-child(3) > a:nth-child(2) > u")).click();Thread.sleep(2000);
    driver.findElement(By.linkText("Privacy")).click();Thread.sleep(2000);
  }
}
