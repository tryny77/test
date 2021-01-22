
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BuyProduct {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		
		WebDriver navegador= new FirefoxDriver();
		
		navegador.get("http://automationpractice.com/index.php");
		
		navegador.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor) navegador;
		
		jse.executeScript("window.scrollBy(0,1000)");
		
		WebElement objeto= navegador.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[5]/div/div[2]/h5/a"));
		
		objeto.click();
		
		jse.executeScript("window.scrollBy(0,500)");
		
		WebElement objeto2= navegador.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button"));
		
		objeto2.click();
		


		
	
		
		
	}

}
