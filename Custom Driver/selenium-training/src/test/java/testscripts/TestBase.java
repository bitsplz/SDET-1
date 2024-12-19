package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import utils.ConfigReader;

import java.io.File;
import java.time.Duration;


public class TestBase {
    protected WebDriver driver;
    protected ConfigReader configReader;

    @BeforeTest
    public void initializeReader() {
        // Initialize ConfigReader
        configReader = new ConfigReader("src/main/resources/properties/Config.Properties");
    }
    @BeforeClass
    public void setUp(){
        String browserType = configReader.getProperty("Browser");
        String osName = System.getProperty("os.name");
        System.out.println(osName);
        String driverPath = getDriverPath(browserType, osName);

        System.setProperty(getDriverPropertyKey(browserType), driverPath);

        switch (browserType.toLowerCase()) {
            case "mozilla":
                driver = new FirefoxDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browserType);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        if (driver == null) {
            throw new RuntimeException("Driver not initialized. Check the driver path and configuration.");
        }
        driver.manage().window().maximize();
        driver.get(configReader.getProperty("SwagLabs_URL"));


    }
        private String getDriverPath(String browserType, String osName) {
            String driverFolder = browserType.equalsIgnoreCase("mozilla") ? "geckoDriver" : "chromeDriver";
            String driverName;

            if (osName.equals("Linux")) {
                driverName = browserType.equalsIgnoreCase("mozilla") ? "geckodriver" : "chromedriverli";
            } else if (osName.contains("Windows")) {
                driverName = browserType.equalsIgnoreCase("mozilla") ? "geckodriver.exe" : "chromedriver.exe";
            } else {
                driverName = browserType.equalsIgnoreCase("mozilla") ? "geckodriver" : "chromedriver";
            }

            System.out.println(driverFolder + File.separator + driverName);
            return driverFolder + File.separator + driverName;
        }

        private String getDriverPropertyKey(String browserType) {
            switch (browserType.toLowerCase()) {
                case "mozilla":
                    return "webdriver.gecko.driver";
                case "chrome":
                    return "webdriver.chrome.driver";
                default:
                    throw new IllegalArgumentException("Unsupported browser: " + browserType);
            }

    }

    @AfterClass
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }
}
