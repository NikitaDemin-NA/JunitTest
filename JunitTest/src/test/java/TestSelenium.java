import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestSelenium {

    @Test
    public void main() throws InterruptedException{
    System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.get("https://yandex.ru/");
        driver.findElement(By.xpath("//a[@class ='button desk-notif-card__login-enter-expanded button_theme_gray i-bem button_js_inited']")).click();
    }
}
