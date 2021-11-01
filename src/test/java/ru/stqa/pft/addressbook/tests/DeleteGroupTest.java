package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class DeleteGroupTest extends TestBase {


  @Test
  public void testDeleteGroup() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isGroupPresent()){
      app.getGroupHelper().createGroup(new GroupData("test_change", null, null));
    }
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().selectGroup(before -1);
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returnGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before - 1);
  }

}