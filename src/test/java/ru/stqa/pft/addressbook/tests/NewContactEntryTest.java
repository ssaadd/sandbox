package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class NewContactEntryTest extends TestBase{

    @Test
        public void testNewContactCreate() throws Exception {
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().createNewContact(new ContactData("name1", "lastname", "adress", "+79888880", "email@mail.ru", "test1"), true);
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);
    }



}
