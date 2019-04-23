package com.myProject.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProjectsHelper extends HelperBase{

    public ProjectsHelper(WebDriver wd) {
        super(wd);
    }

    public void openProjects(){
        click(By.xpath("//a[contains(text(),'פרוייקטים')]"));
    }

    public void assertGetCountProjects(){
        Assert.assertEquals(wd.findElements(By.cssSelector("figure.figure")).size(), 14);
    }

    public boolean isSearchResultPresent(){
        return isElementPresent(By.xpath("//label[@id='privacyErr']"));
    }
}
