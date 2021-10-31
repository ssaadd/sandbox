package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class NewgroupTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.goToGroupPage();
    app.initNewGroup();
    app.fillNewGroup(new GroupData("test1", "test2", "test3"));
    app.submitGroupCreate();
    app.returnGroupPage();

  }

}
