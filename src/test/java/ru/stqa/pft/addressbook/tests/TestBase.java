package ru.stqa.pft.addressbook.tests;



import org.testng.annotations.*;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;


public class TestBase {

    protected final ApplicationManager applicationManager = new ApplicationManager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        applicationManager.init();
    }

    @AfterClass(alwaysRun = true)
        public void tearDown() throws Exception {
        applicationManager.quit();
    }

}
