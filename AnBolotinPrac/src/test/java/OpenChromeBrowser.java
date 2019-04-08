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
       wd.findElement(By.xpath("//input[@id='user']")).click();
       wd.findElement(By.xpath("//input[@id='user']")).clear();
       wd.findElement(By.xpath("//input[@id='user']")).sendKeys("Asniga");
       wd.findElement(By.xpath("//input[@id='password']")).click();
       wd.findElement(By.xpath("//input[@id='password']")).clear();
       wd.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
       wd.findElement(By.xpath("//input[@id='login']")).click();


    }

    @AfterClass
    public void tearDown(){
    wd.quit();
    }
}
