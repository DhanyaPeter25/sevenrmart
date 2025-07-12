package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	WebDriver driver;

	public void selectByVisibleText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);

	}

	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void dragAndDrop(WebElement element1, WebElement element2) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(element1, element2);
	}

	public void contextClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element);
	}

	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element);
	}

	public void click(WebElement element) {
		Actions actions = new Actions(driver);
		actions.click(element);
	}

	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element);
	}

	public void javaScriptExecutorSendKeys(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='';", element);
	}

	public void javaSriptClick(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public void scrollBy(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}

}
