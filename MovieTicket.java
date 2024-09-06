package week2.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class MovieTicket {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
			
		wait.until(ExpectedConditions.elementToBeClickable(By.className("p-dropdown-trigger"))).click();
		//driver.findElement(By.className("p-dropdown-trigger")).click();

		
		//driver.findElement(By.xpath("//div/h6[@class='cities-name pointer'][6]")).click();
		WebElement chennaiOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h6[text()='Chennai'])")));
		chennaiOption.click();
		
		WebElement cinema = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/span[@class='cinemas-inactive']")));
		cinema.click();
		
		WebElement cinemaElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='cinema']")));
		cinemaElement.click();
		

		WebElement selectElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='INOX Luxe Phoenix Market City, Velachery  (formerly Jazz Cinemas)Chennai']")));
		selectElement.click();
		
		WebElement ddDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='Today']")));
		ddDate.click();
	
		
		WebElement ddMovie = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='VAAZHAI']")));
		ddMovie.click();
	
		WebElement ddTime = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span/span[text()='07:00 PM']")));
		ddTime.click();
		
		WebElement ddBook = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/button/span[text()='Book']")));
		ddBook.click();
		
		WebElement ddAgree = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/button[text()='Accept']")));
		ddAgree.click();
		
		WebElement ddSeat = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr/td/span[text()='12']")));
		ddSeat.click();
		
		WebElement ddProceed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/button[text()='Proceed']")));
		ddProceed.click();
		
		
		
		WebElement seatInfo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("seat-info")));
		System.out.println(seatInfo.getText());

		
		
		WebElement grandTotal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("seat-bottom-btn")));
		System.out.println(grandTotal.getText());
		
		
		
		WebElement ddProceed1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/button[text()='Proceed']")));
		ddProceed1.click();
		
		
		WebElement ddClose = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='cross-icon mx-2'])[2]")));
		ddClose.click();
		
		System.out.println(driver.getTitle());
		
	driver.close();
		
		
		
		

	}

}
