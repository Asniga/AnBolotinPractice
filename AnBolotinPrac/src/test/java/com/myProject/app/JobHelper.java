package com.myProject.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobHelper extends HelperBase {

    public void openJob() {
        click(By.xpath("//a[contains(text(),'קריירה')]"));
    }

    public JobHelper(WebDriver wd) {
        super(wd);
    }
}
