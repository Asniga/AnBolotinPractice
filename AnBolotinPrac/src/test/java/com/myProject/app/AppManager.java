package com.myProject.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppManager {
    private ProjectsHelper projects;
    private JobHelper job;
    WebDriver wd;

    public void start() {
        wd = new ChromeDriver();
        projects  = new ProjectsHelper(wd);
        job = new JobHelper(wd);
            }


    public void stop() {
        wd.quit();
    }


    public ProjectsHelper getProjects() {
        return projects;
    }

    public JobHelper getJob() {
        return job;
    }
}
