import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logout extends TestBase {
    @BeforeMethod
    public void preconditionLoguot() throws InterruptedException {
        login();
    }

    @Test
    public void testLogout() throws InterruptedException {
    click(By.xpath("//span[@title='Asniga (asniga)']"));
    click(By.xpath("//a[@class='js-logout']"));
    Thread.sleep(3000);
    }
}
