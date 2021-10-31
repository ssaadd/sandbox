package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ModifyContactTest extends TestBase{
    @Test
    public void testModifyContact(){
        if (! app.getContactHelper().isContactPresent()){
            app.getContactHelper().createNewContact(new ContactData("name2", "lastname2", "address", "+79888881", "email@mail.ru", "test1"), true);
        }
    app.getContactHelper().selectContact();
    app.getContactHelper().editContact();
    app.getContactHelper().contactFormFill(new ContactData("name2", "lastname2", "address", "+79888881", "email@mail.ru", null), false);
    app.getContactHelper().updateContact();
    app.getContactHelper().returnHome();
    }
}
