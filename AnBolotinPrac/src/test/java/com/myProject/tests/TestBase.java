package com.myProject.tests;

import com.myProject.app.AppManager;
import org.testng.annotations.*;

public class TestBase {


    protected static AppManager app = new AppManager();

    @BeforeSuite
    public void setUp(){
        app.start();
    }

    @AfterSuite
    public void tearDown(){
        app.stop();
    }


}
