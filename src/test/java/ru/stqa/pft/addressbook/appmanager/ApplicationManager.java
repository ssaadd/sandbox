package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.BrowserType;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver;
    private GroupHelper groupHelper;
    private NavigationHelper navigationHelper;
    private SessionHelper sessionHelper;
    private ContactHelper contactHelper;
    public String baseUrl;

    public StringBuffer verificationErrors = new StringBuffer();
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
//        System.setProperty("webdriver.gecko.driver", "/WebDriver/geckodriver.exe");
        if (browser.equals(BrowserType.FIREFOX)){
            driver = new FirefoxDriver();
        } else if (browser.equals(BrowserType.CHROME)){
            driver = new ChromeDriver();
        } else if (browser.equals(BrowserType.IE)){
            driver = new InternetExplorerDriver();
        }
        baseUrl = "http://localhost/addressbook/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
        groupHelper = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        contactHelper = new ContactHelper(driver);
        getSessionHelper().login("admin", "secret");
    }





    public void quit() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
          Assert.fail(verificationErrorString);
        }
    }



    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
