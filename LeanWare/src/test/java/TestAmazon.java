import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAmazon {
    public static ChromeOptions options;
    public static WebDriver webDriver;

    @BeforeMethod
    public static void setUp() {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver(options);
        webDriver.get("https://repost.aws/questions/QUndEqT6iPSvSLRQOw38r9Ow/1-6-problem-with-vegetation-applied-via-terrain-layers");

    }
    @Test
    public static void companyEmailTest() throws InterruptedException {
        webDriver.findElement(By.xpath("//*[@data-test='language-dropdown']")).
                click();
        webDriver.findElement(By.xpath("//*[@data-test='language-select-es']")).
                click();
        Thread.sleep(2000);
        WebElement webElement = webDriver.findElement(By.xpath("//*[@data-test='menu-questions']"));
        String expectedLanguage = "Preguntas";
        String realLanguage = webElement.getText();
        Assert.assertEquals(realLanguage, expectedLanguage);
    }
    @AfterMethod
    public static void close() {
        webDriver.close();
    }
}
