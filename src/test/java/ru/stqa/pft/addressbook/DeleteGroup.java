package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class DeleteGroup extends TestBase {


  @Test
  public void testDeleteGroup() throws Exception {
    goToGroupPage();
    selectGroup();
    deleteSelectedGroup();
    returnGroupPage();
  }

}