package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class NewGroupTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.goToGroupPage();
    app.getGroupHelper().initNewGroup();
    app.getGroupHelper().fillNewGroup(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupCreate();
    app.getGroupHelper().returnGroupPage();

  }

}