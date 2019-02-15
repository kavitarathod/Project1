import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String new1=System.getProperty("user.dir")+"\\Drivers";
		System.out.println(new1);
		System.setProperty("webdriver.chrome.driver",new1+"\\chromedriver.exe");
		driver=new ChromeDriver();
		//navigating to url
		driver.get("https://www.google.com/");
		//clsing the browser
		driver.close();
	}

}
