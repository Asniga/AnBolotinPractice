package com.myProject.tests;

import org.testng.annotations.Test;

public class OpenJob extends TestBase {
    @Test (enabled=true)
    public void jobOpen() throws InterruptedException {
        app.getJob().openSite();
        app.getJob().openJob();
    }
}
