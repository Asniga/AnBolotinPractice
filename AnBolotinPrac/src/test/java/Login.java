import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends TestBase{

    @Test
    public void trello() throws InterruptedException {
        login();
        click(By.xpath("//span[contains(text(),'Создать команду')]"));
        Thread.sleep(3000);
        type("//input[@id='org-display-name']", "MyTeam");
        click(By.xpath("//input[@value='Создать']"));
        Thread.sleep(6000);
    }


}
