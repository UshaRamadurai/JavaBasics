package week3.day2.practice;
//Goal : Code to practice lists from Ajio website

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		// Importing the driver files
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Launching the Webpage
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Input bag in search box and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags\n");

		Thread.sleep(2000);

		// To the left of the screen under "Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();

		Thread.sleep(2000);

		// Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();

		Thread.sleep(2000);
		
		// Print the count of the items Found
		String noOfItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items found : " + noOfItems);

		// Get the list of brands displayed in the page
		List<WebElement> brandList = driver.findElements(By.className("brand"));
		System.out.println("The number of brands found :" + brandList.size());

		// Printing the BrandList
		System.out.println("The List of Brands are :");
		for (WebElement brandName : brandList) {
			String textList = brandName.getText();
			System.out.println(textList);
		}

		// Get the list of product names displayed in the page
		List<WebElement> nameList = driver.findElements(By.className("name"));
		
		// Printing the Name of the Product List
		System.out.println("The List of Product names are :");
		for (WebElement productName : nameList) {
			String pdtNameList = productName.getText();
			System.out.println(pdtNameList);
		}

	}

}
