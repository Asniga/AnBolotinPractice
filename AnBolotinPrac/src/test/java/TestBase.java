import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void openSite(String url) {
        wd.navigate().to(url);
    }

    public void type(String element, String sendKeys) {
        click(By.xpath(element));
        wd.findElement(By.xpath(element)).clear();
        wd.findElement(By.xpath(element)).sendKeys(sendKeys);
    }

    @AfterClass
    public void tearDown(){
    wd.quit();
    }

    public void login() throws InterruptedException {
        openSite("https://trello.com/");
        click(By.xpath("//a[@class='btn btn-sm btn-link text-white']"));
        type("//input[@id='user']", "Asniga");
        type("//input[@id='password']", "12345678");
        click(By.xpath("//input[@id='login']"));
        Thread.sleep(3000);
    }
}
