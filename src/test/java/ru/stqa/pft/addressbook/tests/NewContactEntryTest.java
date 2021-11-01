package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class NewContactEntryTest extends TestBase{

    @Test
        public void testNewContactCreate() throws Exception {
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().createNewContact(new ContactData("name1", "lastname", "adress", "+79888880", "email@mail.ru", "test1"), true);
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }



}
