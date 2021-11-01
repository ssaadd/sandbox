package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);

    }

    public void submitNewContact() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void contactFormFill(ContactData contactData, boolean creating) {
        type(By.name("firstname"), contactData.name());
        type(By.name("lastname"), contactData.lastname());
        type(By.name("address"), contactData.address());
        type(By.name("mobile"), contactData.phone());
        type(By.name("email"), contactData.email());
        if (creating) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.group());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void initAddNewContact() {
        click(By.linkText("add new"));
    }

    public void returnHome() {
        click(By.linkText("home"));
    }

    public void selectContact(int index) {
        driver.findElements(By.name("selected[]")).get(index).click();
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

    public void createNewContact(ContactData contact, boolean b) {
        initAddNewContact();
        contactFormFill(contact, b);
        submitNewContact();
        returnHome();
    }

    public boolean isContactPresent() {

        return isElementPresent(By.name("selected[]"));

    }

    public int getContactCount() {
        return driver.findElements(By.name("selected[]")).size();
    }
}