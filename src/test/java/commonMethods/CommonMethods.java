package commonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePackage.BaseClass;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;

public class CommonMethods extends BaseClass {
	


	@Step
	@Screenshots(forEachAction=true)
	public static void clickMethods(WebElement element) {
		element.click();

	}
	@Step
	@Screenshots(forEachAction=true)
	public static void actionMethods(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("")));
	}
	@Step
	@Screenshots(forEachAction=true)
	public static void selectMethod(WebElement elements, String value) throws InterruptedException {
		Select sel = new Select(elements);
		Thread.sleep(2000);
		sel.selectByValue(value);
	}
	@Step
	@Screenshots(forEachAction=true)
	public static void clickMethodBy(By xpath) {
		driver.findElement(xpath).click();

	}
	@Step
	@Screenshots(forEachAction=true)
	public static void selectMethodindex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	@Step
	@Screenshots(forEachAction=true)
	public static void selectMethodtext(WebElement element, String visableText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visableText);
	}
	@Step
	@Screenshots(forEachAction=true)
	public static void ExplicitWaitClick(By xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath)).click();
	}
	@Step
	@Screenshots(forEachAction=true)
	public static void ExplicitWaitText(By xpath, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until( ExpectedConditions.visibilityOfElementLocated(xpath)).sendKeys(text);

	}
	@Step
	@Screenshots(forEachAction=true)
	public static void enterText(By by, String a) throws InterruptedException {
		// Thread.sleep(2000);
		// text.wait(3000);
		driver.findElement(by).sendKeys(a);
	}
//		text.sendKeys(texts);
//	}
	@Step
	@Screenshots(forEachAction=true)
	public static void enterText(WebElement text) {

	}
	@Step
	@Screenshots(forEachAction=true)
	public static void WebdriverWait(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	@Step
	@Screenshots(forEachAction=true)
	public static void WebdriverWait(By locator, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
		;
	}
	@Step
	@Screenshots(forEachAction=true)
	public static void enterText(Object sendKeys) {
		// WebElement text;
		// sendKeys=text;
		// sendKeys

	}
	@Step
	@Screenshots(forEachAction=true)
	public void hello() {
		Serenity.takeScreenshot();
	}
	@Step
	@Screenshots(forEachAction=true)
	public static void selectMethodtextByVisableText(By element, String visableText) {
		Select sel = new Select(driver.findElement(element));
		sel.selectByVisibleText(visableText);
	}
	// ---------^^^^Selecting by Visable Visable Text^^^^----------------
	@Step
	@Screenshots(forEachAction=true)
	public static void selectMethodtextByValue(By elements, String Value) {
		Select sel = new Select(driver.findElement(elements));
		sel.selectByValue(Value);
	}
	// ---------^^^^Selecting by Visable Value^^^^----------------
	@Step
	@Screenshots(forEachAction=true)
	public static void selectMethodtextByIndex(By elements, int index) {
		Select sel = new Select(driver.findElement(elements));
		sel.selectByIndex(index);
	}
	// ---------^^^^Selecting by Visable Index^^^^----------------
	@Step
	@Screenshots(forEachAction=true)
	public static void explicitWaitByClick(By xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath)).click();
	}
	// --------^^^^^Using Explicit Wait to click^^^^^^^----------------
	@Step
	@Screenshots(forEachAction=true)
	public static void explicitWaitBySendingKeys(By xpath, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath)).sendKeys(text);

	}
	// ---------^^^^Using Explicit Wait for sending keys^^^^^^--------------
	@Step
	@Screenshots(forEachAction=true)
	public static void explicitWaitByNoAction(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	// ---------^^^^^Using Explicit Wait to locate element without any
	// actions^^^^^^^------------------
	@Step
	@Screenshots(forEachAction=true)
	public static void actionMethodByHover(By element) {
		Actions action = new Actions(driver);
		Action a = action.moveToElement(driver.findElement(element)).build();
		a.perform();

		// action.moveToElement(driver.findElement(By.xpath("")));
	}
	// ----------^^^^This action class is just using hover over
	// element^^^^-----------
	@Step
	@Screenshots(forEachAction=true)
	public static void actionMethodByHoverTwoElements(By InitialElement, By TargetElement) {
		Actions action = new Actions(driver);
		Action a = action.moveToElement(driver.findElement(InitialElement))
				.moveToElement(driver.findElement(TargetElement)).build();
		a.perform();
	}
	// -------This is an action class moving to one element to the second element
	// ------- ^^^^^^But performing no action^^^^^^^^------------
	@Step
	@Screenshots(forEachAction=true)
	public static void actionMethodByHoverTwoElementsClick(By InitialElement, By TargetElement) {
		Actions action = new Actions(driver);
		Action a = action.moveToElement(driver.findElement(InitialElement))
				.moveToElement(driver.findElement(TargetElement)).click().build();
		a.perform();
	}
	// -------- This is using action class moving to one element then to the second
	// element
	// --------^^^ then adding a click this is mainly used for a dropdown
	// ^^^^---------
	@Step
	@Screenshots(forEachAction=true)
	public static void actionMethodBySendingKeysUsingKeys(By InitialElement, String text) {
		Actions action = new Actions(driver);
		Action a = action.moveToElement(driver.findElement(InitialElement)).sendKeys(text).sendKeys(Keys.ENTER).build();
		a.perform();
	}
	// ---------^^^^This is using action class to send keys and then using the enter
	// key^^^--------
	@Step
	@Screenshots(forEachAction=true)
	public static void actionMethodBySendingKeysUsing(By InitialElement, String text) {
		Actions action = new Actions(driver);
		Action a = action.moveToElement(driver.findElement(InitialElement)).sendKeys(text).build();
		a.perform();
	}
	// ----------^^^^^^This is Using action class to send keys^^^^^-------------
	@Step
	@Screenshots(forEachAction=true)
	public static void actionMethodByDragAndDropSlider(By slider, int Destination,int oneThousand) {
		Actions action = new Actions(driver);
		Action a = action.dragAndDropBy(driver.findElement(slider), Destination, oneThousand).build();
		a.perform();
		// 0 =20, 2=21, 10=23, 15=25
		// 20=26, 30=29, 40=32 50=36
		// 60=39 100=59 200=82
	}
	//This is for the slider on Dashboard
	
	// ------------^^^^^Page Object Model^^^^^^---------------------------------
	@Step
	@Screenshots(forEachAction=true)
	public static String getTextofElement(By text) {
		return driver.findElement(text).getText();
	}
	// ----------------------------------------------------------------------------------------------------------------
	// These are Helper Methods for me
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("arguments[0].click();", loginButton);
	// js.executeScript("arguments[0].scrollIntoView(true);",
	// ManifestLandingPage.manifestNumber);
	// ----------------------------------------------------------------------------------------------------------------
}
