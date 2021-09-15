import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver chromeDriver= new ChromeDriver();

    }

    @Test
    void testSetup(){
        System.out.println("testing setup");
    }
}
