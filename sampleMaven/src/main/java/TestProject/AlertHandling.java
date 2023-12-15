package TestProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://leafground.com/alert.xhtml;jsessionid=node01o2snbrsqg5sg1asglkyxrn3c5656854.node0");
		  driver.manage().window().maximize();
		
		  //To perform a simple alert by clicking on OK button and printing the text present inside the alert box 
		  WebElement acceptAlert = driver.findElement(By.id("j_idt88:j_idt91")); 
		  acceptAlert.click();
		  Alert okAlert = driver.switchTo().alert(); 
		  String text1 = okAlert.getText();
		  System.out.println("Simple alert is :"+text1); 
		  okAlert.accept();
		  
		  //To perform a cancel operation in the alert box and printing the text present inside the alert box 
		  WebElement dismissAlert = driver.findElement(By.id("j_idt88:j_idt93")); 
		  dismissAlert.click(); 
		  Alert cancelAlert = driver.switchTo().alert(); 
		  String text2 = cancelAlert.getText(); 
		  System.out.println("Cancel alert is :"+text2);
		  cancelAlert.dismiss();
		  
		  //To enter the text inside the alert text box and printing the result in console 
		  WebElement promptAlert = driver.findElement(By.id("j_idt88:j_idt104")); 
		  promptAlert.click(); 
		  Alert alert3 = driver.switchTo().alert(); 
		  alert3.sendKeys("Prem");
		  System.out.println(alert3.getText()); 
		  alert3.accept(); 
		  String text3 = driver.findElement(By.id("confirm_result")).getText();
		  System.out.println(text3);

		  WebElement sweetAlert1 = driver.findElement(By.id("j_idt88:j_idt95"));
		  sweetAlert1.click();
		  driver.findElement(By.id("j_idt88:j_idt98")).click();
		  
		  WebElement alertConfirmation = driver.findElement(By.id("j_idt88:j_idt106"));
		  alertConfirmation.click();
		  driver.findElement(By.id("j_idt88:j_idt109")).click();
		  
		
		/*
		 * WebElement sweetAlert = driver.findElement(By.id("j_idt88:j_idt100"));
		 * sweetAlert.click(); WebElement closeButton =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a"));
		 * Actions action = new Actions(driver);
		 * action.moveToElement(closeButton).perform(); closeButton.click();
		 */
		
		
		
		}

}
