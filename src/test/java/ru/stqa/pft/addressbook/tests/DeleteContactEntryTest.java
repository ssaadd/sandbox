package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteContactEntryTest extends TestBase{
    @Test
    public void testDeleteContact(){
        app.getNavigationHelper().goToContactPage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().allertDec();
//        app.getContactHelper().returnHome();
    }
}
