package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver drive;

    @BeforeClass
    public void setUp() {
        drive = new EdgeDriver();
        drive.manage().window().maximize();
        drive.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @AfterClass
    public void tearDown() {
//        drive.quit();
    }

    @Test
    public void testLoggingIntoApplication() throws InterruptedException {
        Thread.sleep(2000);
        WebElement username = drive.findElement(By.name("username"));
        username.sendKeys("Admin");

        var password = drive.findElement(By.name("password"));
        password.sendKeys("admin123");

        drive.findElement(By.tagName("button")).click();
    }
    //https://www.youtube.com/watch?v=QQliGCtqD2w&t=1290s
}
