package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver driver) {
        super(driver);

    }

    public void submitNewContact() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void contactFormFill(ContactData contactData) {
        type(By.name("firstname"), contactData.name());
        type(By.name("lastname"), contactData.lastname());
        type(By.name("address"), contactData.address());
        type(By.name("mobile"), contactData.phone());
        type(By.name("email"), contactData.email());
    }

    public void initAddNewContact() {
        click(By.linkText("add new"));
    }

    public void returnHome() {
        click(By.linkText("home page"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }
    public void deleteContact() {
        click(By.xpath("//input[@value='Delete']"));
    }
    public void allertDec() {
        driver.switchTo().alert().accept();
    }

    public void editContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void updateContact() {
        click(By.xpath("//div[@id='content']/form/input[22]"));
    }
    public void contactFormModify(ContactData contactData) {
        type(By.name("firstname"), contactData.name());
        type(By.name("lastname"), contactData.lastname());
        type(By.name("address"), contactData.address());
        type(By.name("mobile"), contactData.phone());
        type(By.name("email"), contactData.email());
    }



}