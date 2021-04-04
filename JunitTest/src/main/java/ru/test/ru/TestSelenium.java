package ru.test.ru;

import io.cucumber.java.ru.Если;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class TestSelenium {

    @Если("открыть страницу")
    public void getPage() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "/Users/andrei/testrepository2/JunitTest/src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://yandex.ru/");
        driver.findElement(By.xpath("//a[@href='https://passport.yandex.ru/auth?origin=home_desktop_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F&backpath=https%3A%2F%2Fyandex.ru']")).click();
        Thread.sleep(2000);
        String window1 = driver.getWindowHandle();
        Set<String> currentWindows = driver.getWindowHandles();
        String window2 = null;
        for (String window : currentWindows){
            if (!window.equals(window1)){
                window2=window;
                break;
            }
        };
        driver.switchTo().window(window2);

        WebElement login = driver.findElement(By.xpath("//*[@id='passp-field-login']"));
        login.click();
        login.sendKeys("asdcfg98@ya.ru", Keys.ENTER);

        WebElement password = driver.findElement(By.xpath("//*[@id='passp-field-passwd']"));
        password.click();
        password.sendKeys("WrongPassword", Keys.ENTER);
        Thread.sleep(2000);

//        WebElement elementError = driver.findElement(By.xpath("//div[@class='Textinput-Hint Textinput-Hint_state_error']"));
//        String parr = elementError.getText();
//        System.out.println(parr);

        WebElement elementBack = driver.findElement(By.xpath("//a[@href='/auth/add?origin=home_desktop_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F&backpath=https%3A%2F%2Fyandex.ru']"));
        elementBack.click();
        Thread.sleep(1000);

        WebElement elementRoll = driver.findElement(By.xpath("//button[@class='AuthSocialBlock-provider']"));
        elementRoll.click();


//        WebElement selectElem = driver.findElement(By.xpath("//span[@class='AuthSocialBlock-secondaryProviderName']"));
//        Select select = new Select(selectElem);
//        List options = select.getOptions();
//        List selectedOptions = select.getAllSelectedOptions();
//        WebElement selectedOption = select.getFirstSelectedOption();
        Thread.sleep(5000);
        driver.quit();
    }
}
