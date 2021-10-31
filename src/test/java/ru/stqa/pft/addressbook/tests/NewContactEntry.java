package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class NewContactEntry extends TestBase{

    @Test
        public void testNewgroupcreate() throws Exception {
            app.getContactHelper().initAddNewContact();
            app.getContactHelper().contactFormFill(new ContactData("name1", "lastname", "adress", "+79888880", "email@mail.ru"));
            app.getContactHelper().submitNewContact();
            app.getContactHelper().returnHome();
        }

}
