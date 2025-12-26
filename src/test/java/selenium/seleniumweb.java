package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class seleniumweb {

    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64");

        WebDriver driver = new ChromeDriver();
        //1 - Maximize browser của mình
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //2 - Đi đến 1 url

//        driver.navigate().to("https://anhtester.com");
        driver.get("https://anhtester.com/");


//        Click nuts Login
        driver.findElement(By.xpath("//a[@id='btn-login']")).click();


        //3 - Lấy Title và in ra console

//        System.out.println(driver.getTitle());

        // Thoát hẳn Browser

        driver.quit();

    }

}
