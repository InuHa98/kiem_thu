import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Bai3Test {

    ChromeDriver chromeDriver;

    @BeforeEach
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void timKiem() throws InterruptedException {
        chromeDriver.get("https://www.vietjetair.com/vi");

        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(20));

        WebElement accepCookie = wait.until(ExpectedConditions.elementToBeClickable(chromeDriver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div/div[2]/button"))));
        accepCookie.click();

        Thread.sleep(2000);

        WebElement diemDi = wait.until(ExpectedConditions.elementToBeClickable(chromeDriver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div/div/input"))));
        diemDi.click();

        Thread.sleep(2000);

        WebElement diemDi2 = wait.until(ExpectedConditions.elementToBeClickable(chromeDriver.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div/div[1]"))));
        diemDi2.click();

        Thread.sleep(2000);

        WebElement diemDen = wait.until(ExpectedConditions.elementToBeClickable(chromeDriver.findElement(By.xpath("//*[@id=\"panel1a-content\"]/div/div[1]"))));
        diemDen.click();

        Thread.sleep(2000);

        WebElement ngay = wait.until(ExpectedConditions.elementToBeClickable(chromeDriver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div[1]/div[3]/button[8]/span[2]"))));
        ngay.click();

        Thread.sleep(2000);

        WebElement motChieu = wait.until(ExpectedConditions.elementToBeClickable(chromeDriver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div/div[3]/div/div[1]/div/div/div/div[2]/label/span[1]/span[1]/input"))));
        motChieu.click();

        Thread.sleep(2000);

        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(chromeDriver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div/div[3]/div/div/div[2]/button"))));
        submit.click();
    }

}
