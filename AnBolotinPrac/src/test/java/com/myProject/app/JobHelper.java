package com.myProject.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobHelper extends HelperBase {

    public void openJob() throws InterruptedException {
        Thread.sleep(5000);
        click(By.xpath("//*[@href='/JoinUs']"));
    }

    public JobHelper(WebDriver wd) {
        super(wd);
    }
}
