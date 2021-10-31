package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper {
     private WebDriver driver;

    public GroupHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void fillNewGroup(GroupData groupData) throws Exception {
      driver.findElement(By.name("group_name")).click();
      driver.findElement(By.name("group_name")).clear();
      driver.findElement(By.name("group_name")).sendKeys(groupData.name());
      driver.findElement(By.name("group_header")).click();
      driver.findElement(By.name("group_header")).clear();
      driver.findElement(By.name("group_header")).sendKeys(groupData.header());
      driver.findElement(By.name("group_footer")).click();
      driver.findElement(By.name("group_footer")).clear();
      driver.findElement(By.name("group_footer")).sendKeys(groupData.footer());
    }

    public void returnGroupPage() {
      driver.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreate() {
      driver.findElement(By.name("submit")).click();
    }

    public void initNewGroup() {
      driver.findElement(By.name("new")).click();
    }

    public void deleteSelectedGroup() {
      driver.findElement(By.xpath("//div[@id='content']/form/input[5]")).click();
    }

    public void selectGroup() {
      driver.findElement(By.name("selected[]")).click();
    }
}
