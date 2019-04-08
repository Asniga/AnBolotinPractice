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
    public void trello() throws InterruptedException {
       wd.navigate().to("https://trello.com/");
       wd.findElement(By.xpath("//a[@class='btn btn-sm btn-link text-white']")).click();
       clickClearSend("//input[@id='user']", "Asniga");
       clickClearSend("//input[@id='password']", "12345678");
       wd.findElement(By.xpath("//input[@id='login']")).click();
       Thread.sleep(1000);
       wd.findElement(By.xpath("//span[contains(text(),'Создать команду')]")).click();
       Thread.sleep(3000);
       clickClearSend("//input[@id='org-display-name']", "MyTeam");
       wd.findElement(By.xpath("//input[@value='Создать']")).click();

    }

    public void clickClearSend(String element, String sendKeys) {
        wd.findElement(By.xpath(element)).click();
        wd.findElement(By.xpath(element)).clear();
        wd.findElement(By.xpath(element)).sendKeys(sendKeys);
    }

    @AfterClass
    public void tearDown(){
    wd.quit();
    }
}
