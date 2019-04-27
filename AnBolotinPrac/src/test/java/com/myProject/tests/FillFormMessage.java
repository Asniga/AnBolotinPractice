package com.myProject.tests;

import com.myProject.model.User;
import org.openqa.selenium.By;
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

            list.add(new Object[]{new User().setName(split[0]).setEmail(split[1]).setTel(split[2])});

            line = reader.readLine();
        }

        return list.iterator();
    }

    @Test(dataProvider = "myDataProvider")
    public void fillFormMessage(User user) throws InterruptedException {
        app.getProjects().openSite();
        app.getProjects().type(By.className("input-name"), user.getName());
        app.getProjects().type(By.className("input-email"), user.getEmail());
        app.getProjects().type(By.className("input-phone"), user.getTel());
        app.getProjects().click(By.xpath("//div[@class='btn rounded-corners whited ng-binding']"));

        if (errorNameText()) {
            app.getProjects().assertContainName();
            System.out.println("-------Name ERROR!-------");
        }
        if (errorEmailText()) {
            app.getProjects().assertContainEmail();
            System.out.println("-------Email ERROR!-------");
        }
        if (errorTelText()) {
            app.getProjects().assertContainTel();
            System.out.println("-------PHONE ERROR!-------");
        }
    }

    public boolean errorNameText() {
        return app.getProjects().isElementPresent(By.className("input-name"));
    }

    public boolean errorEmailText() {
        return app.getProjects().isElementPresent(By.className("input-email"));
    }
    public boolean errorTelText() {
        return app.getProjects().isElementPresent(By.className("input-phone"));
    }

}

