import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstBrowser {
	public static void main(String[] args) throws InterruptedException {
		//without system.setProprty() method also we can run browser if we are using maven 
//		dependencies for selenium
		// push to new repo
		WebDriver driver = new ChromeDriver();
//		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.close();
	}
}
