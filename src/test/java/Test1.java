import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver chromeDriver= new ChromeDriver();

    }
    @Parameters("browser")
    @Test
    void testSetup(String browser){
        System.out.println("testing setup for " + browser);
        System.out.println("adding to test jenkin schedule");
    }
}
