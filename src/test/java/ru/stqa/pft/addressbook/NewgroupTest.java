package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class NewgroupTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    goToGroupPage();
    initNewGroup();
    fillNewGroup(new GroupData("test1", "test2", "test3"));
    submitGroupCreate();
    returnGroupPage();

  }

}
