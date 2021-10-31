package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class DeleteContactEntryTest extends TestBase{
    @Test
    public void testDeleteContact(){
        app.getNavigationHelper().goToContactPage();
        if (! app.getContactHelper().isContactPresent()){
            app.getContactHelper().createNewContact(new ContactData("name2", "lastname2", "address", "+79888881", "email@mail.ru", "test1"), true);
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().allertDec();
//        app.getContactHelper().returnHome();
    }
}
