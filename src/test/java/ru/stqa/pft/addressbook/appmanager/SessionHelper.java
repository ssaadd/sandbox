package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{


    public SessionHelper(WebDriver driver) {
        super(driver);


    }
    public void login(String name, String pass) {
        type(By.name("user"),name);
        type(By.name("user"),pass);
        click(By.id("LoginForm"));
    }

}
