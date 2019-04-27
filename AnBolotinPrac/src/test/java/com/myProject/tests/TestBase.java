package com.myProject.tests;

import com.myProject.app.AppManager;
import org.testng.annotations.*;

public class TestBase {


    protected static AppManager app = new AppManager();

    @BeforeSuite
    public void setUp(){
        app.start();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown(){
        app.stop();
    }


}
