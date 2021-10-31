package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
     WebDriver driver;
    private GroupHelper groupHelper;
    public String baseUrl;
    public boolean acceptNextAlert = true;
    public StringBuffer verificationErrors = new StringBuffer();

    public void init() {
        System.setProperty("webdriver.gecko.driver", "/WebDriver/geckodriver.exe");

        driver = new FirefoxDriver();
        baseUrl = "http://localhost/addressbook/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
        groupHelper = new GroupHelper(driver);
        login("admin", "secret");
    }

    public void login(String admin, String password) {
      driver.findElement(By.name("user")).clear();
      driver.findElement(By.name("user")).sendKeys(admin);
      driver.findElement(By.name("pass")).clear();
      driver.findElement(By.name("pass")).sendKeys(password);
      driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void goToGroupPage() {
      driver.findElement(By.linkText("groups")).click();
    }

    public void quit() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
          Assert.fail(verificationErrorString);
        }
    }

    public boolean isElementPresent(By by) {
      try {
        driver.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    public boolean isAlertPresent() {
      try {
        driver.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    public String closeAlertAndGetItsText() {
      try {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        if (acceptNextAlert) {
          alert.accept();
        } else {
          alert.dismiss();
        }
        return alertText;
      } finally {
        acceptNextAlert = true;
      }
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
}
