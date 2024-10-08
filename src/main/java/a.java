import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a{
   public static void main(String[] args) {

      WebDriver driver = new ChromeDriver();
   
      driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
      // getTitle() to obtain page title
      System.out.println("Page title is : " + driver.getTitle());
      driver.close();
      try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      driver.quit();
   }
}