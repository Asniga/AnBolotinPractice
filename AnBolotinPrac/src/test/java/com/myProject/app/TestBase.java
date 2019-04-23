package com.myProject.app;

import org.testng.annotations.*;

public class TestBase {


    protected AppManager app = new AppManager();

    @BeforeSuite
    public void setUp(){
        app.start();
    }

    @AfterSuite
    public void tearDown(){
        app.stop();
    }


}
