package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupModificationTest extends TestBase{
    @Test
    public void testGroupMod() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        if (! app.getGroupHelper().isGroupPresent()){
            app.getGroupHelper().createGroup(new GroupData("test_change", null, null));
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size() -1);
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillNewGroup(new GroupData("test_change", "test_change2", "test_change3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size());
    }
}
