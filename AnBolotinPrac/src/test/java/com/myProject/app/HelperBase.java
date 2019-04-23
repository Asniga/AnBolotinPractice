package com.myProject.app;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void click(By by){
        wd.findElement(by).click();
    }
    public void openSite(){
        wd.navigate().to("https://www.yit.co.il/");
    }
    public boolean isElementPresent(By login3) {
        try {
            wd.findElement(login3);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void type(By by, String text){
        if(text!=null) {
            click(by);
            wd.findElement(by).clear();
            wd.findElement(by).sendKeys(text);
        }
    }
}
