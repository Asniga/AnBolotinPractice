import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenChromeBrowser {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
    }

    @Test
    public void trello(){
        wd.navigate().to("https://trello.com/");
       wd.findElement(By.xpath("//a[@class='btn btn-sm btn-link text-white']")).click();

    }

    @AfterClass
    public void tearDown(){
    wd.quit();
    }
}
