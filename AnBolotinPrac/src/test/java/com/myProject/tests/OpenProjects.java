package com.myProject.tests;

import com.myProject.app.TestBase;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class OpenProjects extends TestBase {
    Logger logger = LoggerFactory.getLogger(OpenProjects.class);
    @Test
    public void projectsOpen(){
        logger.info("Start Test");
        app.getProjects().openSite();
        app.getProjects().openProjects();

        if (countElement()) {
            app.getProjects().assertGetCountProjects();
            System.out.println("-------4islo proectov 14!!!------");
        }
        else {
            System.out.println("-------4islo proectov ne sovpadaet!------");
        }
        logger.info("Stop Test");
    }

    public boolean countElement() {
        return app.getProjects().isElementPresent(By.cssSelector("figure.figure"));
        }

}
