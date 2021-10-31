package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class NewGroupTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().initNewGroup();
        app.getGroupHelper().fillNewGroup(new GroupData("test1", null, null));
        app.getGroupHelper().submitGroupCreate();
        app.getGroupHelper().returnGroupPage();

    }

}
