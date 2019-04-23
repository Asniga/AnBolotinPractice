package com.myProject.tests;

import org.testng.annotations.Test;

public class OpenJob extends TestBase {
    @Test
    public void jobOpen() {
        app.getJob().openSite();
        app.getJob().openJob();
    }
}
