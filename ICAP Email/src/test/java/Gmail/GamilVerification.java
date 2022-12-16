package Gmail;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GamilVerification {

//     public static void main(String[] args) {

  @Test
   public void iCapEmil() {

      String strMailId = "vasanth.icap@outlook.com";
      String strPass = "Password1234567";

      System.setProperty("webdriver.chrome.driver", "E:\\ICAP Email\\Config\\Drivers\\chromedriver.exe");

      System.out.println("\n ");
      WebDriver driver = new ChromeDriver();
      WebDriverWait wait = new WebDriverWait(driver, 20);


      // launch Chrome and direct it to the Base URL
      driver.get("https://outlook.live.com/");
      driver.manage().window().maximize();
      WebElement signin = wait
              .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Sign in'])[1]")));
      signin.isDisplayed();
      signin.click();

      WebElement email = wait
              .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
      email.click();
      email.clear();
      email.sendKeys(strMailId);

      WebElement next = wait
              .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
      next.click();

      WebElement password = wait
              .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
      password.click();
      password.clear();
      password.sendKeys(strPass);

      WebElement signinbtn = wait
              .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
      wait.until(ExpectedConditions.visibilityOf(signinbtn));
      signinbtn.click();


      WebElement yesbtn = wait
              .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
      wait.until(ExpectedConditions.visibilityOf(yesbtn));
      yesbtn.click();

      WebElement other = wait
              .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Other']")));
      other.click();

      WebElement icap = wait
              .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[.='ICAP']")));
      icap.isDisplayed();
      icap.click();

//    }
   }

}










