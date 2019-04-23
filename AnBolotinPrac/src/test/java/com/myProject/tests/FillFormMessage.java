package com.myProject.tests;

import com.myProject.model.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FillFormMessage extends TestBase {

    @DataProvider

    public Iterator<Object[]> myDataProvider() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/myDataProvider.csv")));
        String line = reader.readLine();
        while (line != null) {
            String[] split = line.split(";");

            list.add(new Object[] {new User().setName(split[0]).setEmail(split[1])});

            line = reader.readLine();
        }

        return list.iterator();
    }

    @Test(dataProvider = "myDataProvider")
    public void fillFormMessage(User user) throws InterruptedException {
        app.getProjects().openSite();
        app.getProjects().type(By.className("input-name"), user.getName());
        app.getProjects().type(By.className("input-email"), user.getEmail());
        app.getProjects().click(By.xpath("//div[@class='btn rounded-corners whited ng-binding']"));
        Assert.assertTrue(app.getProjects().isSearchResultPresent());
        Thread.sleep(5000);
    }
}
