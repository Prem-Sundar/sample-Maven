package TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTextbox {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		//To enter text in the textbox
		WebElement enterText = driver.findElement(By.id("j_idt88:name"));
		enterText.sendKeys("Prem Sundar");
		
		//To append the text inside the textbox
		WebElement appendText = driver.findElement(By.id("j_idt88:j_idt91"));
		appendText.sendKeys("City");
		
		//To check whether the textbox is enabled or disabled
		WebElement enableTextBox = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean enabled = enableTextBox.isEnabled();
		System.out.println(enabled);
		
		//To clear the contents inside the textbox
		WebElement clearText = driver.findElement(By.name("j_idt88:j_idt95"));
		clearText.clear();
		
		//To get the values present inside the textbox
		WebElement getText = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]"));
		String value = getText.getAttribute("value");
		System.out.println(value);
		
		//Tab key pressing after entering the text inside the textbox
		WebElement pressTab = driver.findElement(By.name("j_idt88:j_idt99"));
		pressTab.sendKeys("premsundr@gmail.com");
		pressTab.sendKeys(Keys.TAB);
		
		//Enter key pressing after entering the text inside the textbox
		WebElement pressEnter = driver.findElement(By.name("j_idt106:thisform:age"));
		pressEnter.sendKeys(Keys.ENTER);
		
		//Slider to slide after entering the number inside the text box
		WebElement slider = driver.findElement(By.id("j_idt106:slider"));
		slider.sendKeys("25");
		
		//To click and confirm the place holder
		WebElement clickandconfirm = driver.findElement(By.id("j_idt106:float-input"));
		clickandconfirm.click();
		
	}

}
