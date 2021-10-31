package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ModifyContactTest extends TestBase{
    @Test
    public void testModifyContact(){
    app.getContactHelper().selectContact();
    app.getContactHelper().editContact();
    app.getContactHelper().contactFormModify((new ContactData("name2", "lastname2", "address", "+79888881", "email@mail.ru")));
    app.getContactHelper().updateContact();
    app.getContactHelper().returnHome();
    }
}
