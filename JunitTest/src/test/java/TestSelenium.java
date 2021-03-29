import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class TestSelenium {

    @Test
    public void main() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "/Users/andrei/testrepository2/JunitTest/src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://passport.yandex.ru/auth?origin=home_yandexid&retpath=https%3A%2F%2Fyandex.ru&backpath=https%3A%2F%2Fyandex.ru/");
//        driver.get("https://yandex.ru/");
//        driver.findElement(By.xpath("//a[@href='https://passport.yandex.ru/auth?origin=home_desktop_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F&backpath=https%3A%2F%2Fyandex.ru']")).click();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
//        WebElement element = driver.findElement(By.xpath("//a[@href='https://yandex.ru/support/passport/']"));
//        WebElement element = driver.findElement(By.xpath("//span[@class='Textinput Textinput_focused Textinput_hovered Textinput_view_floating-label Textinput_size_l']"));
        WebElement element = driver.findElement(By.xpath("//*[@id='passp-field-login']"));
        element.click();
//        action.moveToElement(element).build().perform();
        element.sendKeys("asdcfg98@ya.ru", Keys.ENTER);

    }
}
