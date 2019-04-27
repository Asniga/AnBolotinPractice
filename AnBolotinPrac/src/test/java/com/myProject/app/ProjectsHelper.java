package com.myProject.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProjectsHelper extends HelperBase{

    public ProjectsHelper(WebDriver wd) {
        super(wd);
    }

    public void openProjects() throws InterruptedException {
        Thread.sleep(5000);
        click(By.xpath("//*[@href='/Projects']"));
    }

    public void assertGetCountProjects(){
        Assert.assertEquals(wd.findElements(By.cssSelector("figure.figure")).size(), 14);
    }

    public void assertContainName(){
        Assert.assertEquals(wd.findElement(By.className("input-name")).getText(), "אנא הכנס שם תקין");
    }

    public void assertContainEmail(){
        Assert.assertEquals(wd.findElement(By.className("input-email")).getText(), "אנא הכנס כתובת דואר אלקטרונית תקינה");
    }

    public void assertContainTel(){
        Assert.assertEquals(wd.findElement(By.className("input-phone")).getText(), "אנא הכנס מספר טלפון תקין");
    }

}
