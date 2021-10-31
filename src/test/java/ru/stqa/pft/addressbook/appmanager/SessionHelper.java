package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver driver) {
        super(driver);
    }
    public void login(String admin, String password) {
        type(By.name("user"),admin);
        type(By.name("pass"),password);
        click(By.xpath("//input[@value='Login']"));
    }
}
