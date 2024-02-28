import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestsLeanWare {
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
        webDriver.get("https://www.leanware.co/");


    }

    @Test
    public static void functionalityTest() {
        boolean webElement = webDriver.findElement(By.xpath("(//*[@data-testid='stylablebutton-label'])[1]")).isEnabled();
        Assert.assertEquals(webElement, true);

    }

    @Test
    public static void urlTest() {
        webDriver.findElement(By.xpath("(//*[@data-testid='stylablebutton-label'])[1]")).click();
        String urlReal = webDriver.getCurrentUrl();
        String urlExpect = "https://www.leanware.co/contact";
        Assert.assertEquals(urlReal, urlExpect);
    }


    @Test
    public static void companyEmailTest() throws InterruptedException {
        webDriver.findElement(By.xpath("(//*[@data-testid='stylablebutton-label'])[1]")).click();
        webDriver.findElement(By.xpath("//*[@id='form-field-input-8eb302eb-d1d1-4784-ab0c-b043820d0576']")).
                sendKeys("Juan Pablo Guzman");
        webDriver.findElement(By.xpath("//*[@id='form-field-input-37274bb7-95a4-40a5-430b-fe940c1ffac1']")).
                sendKeys("x123");
        webDriver.findElement(By.xpath("//*[@class='s__0c1NSl sCVLU6l sr0W15L ovm4o4v--upgrade sE_4aJI o__36GnUj--upgrade s__2eE7BN']")).
                click();
        Thread.sleep(7000);
        WebElement webElement = webDriver.findElement(By.xpath("//*[@id='form-field-error-37274bb7-95a4-40a5-430b-fe940c1ffac1']"));
        String expectedMsg = "Enter an email address like example@mysite.com.";
        String realMsg = webElement.getText();
        Assert.assertEquals(realMsg, expectedMsg);

    }

    @Test
    public static void tellUs() throws InterruptedException {
        webDriver.findElement(By.xpath("(//*[@data-testid='stylablebutton-label'])[1]")).click();
        webDriver.findElement(By.xpath("//*[@id='form-field-input-8eb302eb-d1d1-4784-ab0c-b043820d0576']")).
                sendKeys("Juan Pablo Guzman");
        webDriver.findElement(By.xpath("//*[@id='form-field-input-37274bb7-95a4-40a5-430b-fe940c1ffac1']")).
                sendKeys("x123@gmail.com");
        webDriver.findElement(By.xpath("//*[@id='form-field-input-ec56f152-7a85-4f85-d098-ebe96cc55048']")).
                click();
        webDriver.findElement(By.xpath("//*[@class='s__0c1NSl sCVLU6l sr0W15L ovm4o4v--upgrade sE_4aJI o__36GnUj--upgrade s__2eE7BN']")).
                click();
        Thread.sleep(7000);
        WebElement webElement = webDriver.findElement(By.xpath("//*[@id='form-field-error-ec56f152-7a85-4f85-d098-ebe96cc55048']"));
        String expectedMsg = "Enter an answer.";
        String realMsg = webElement.getText();
        Assert.assertEquals(realMsg, expectedMsg);

    }

    @AfterMethod
    public static void close() {
        webDriver.close();
    }

}