package com.website.utils;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MethodBank extends BaseClass {

	private boolean flag;
	JavascriptExecutor javascript = (JavascriptExecutor)driver;

	public void enterbox(WebElement textBox, String textToBeEntered) {
		textBox.sendKeys(textToBeEntered);
	}

	public void clickOnElement(WebElement Clicked) {
		Clicked.click();

	}

	public void WaitForElement(WebElement element, String Path) {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path)));
	}

	public String getText(WebElement element) {

		return element.getText();

	}

	public void HandleClickAction(WebElement element) {

		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}

	public void HandleDropdownVisibleText(WebElement Element, String visibleText) {

		Select sel = new Select(Element);
		sel.selectByVisibleText(visibleText);

	}

	public void HandleDropdownByIndex(WebElement Element, int index) {

		Select sel = new Select(Element);
		sel.selectByIndex(index);

	}

	public String getErrorMsg(WebElement ErrorDiv) {
		return ErrorDiv.getText();
	}

	public boolean isElementPresent(String Path) {
		flag = false;
		
		List<WebElement> element = driver.findElements(By.xpath(Path));
		
		if(element.size()!=0) {
			flag = true;
			System.out.println("Elements are there");
		}else
			flag=false;
		
		
		return flag;
	}
	
	public void ClearAndWrite(WebElement Element, String text) {
		try {
		if(Element.isDisplayed()) {
			Element.clear();
			Element.sendKeys(text);
		}
		else
		{
			System.out.println("Element is not there");
		}
	 }catch (NoSuchElementException e) {
		 
		System.out.println("Element could not be found try again.");
	}
	}
	
	public boolean verifyText(WebElement element, String ExpectedText) {
		flag=false;
		
		if(element.getText().equalsIgnoreCase(ExpectedText))
			flag=true;
		
		
		return flag;
		
	}
	
	public void HandleKeyBoardEvent(WebElement element, String text) {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().sendKeys(element, text).build().perform();
	}
	
	public void javaScriptScroll(WebElement Element) {
		try{ 
			System.out.println("Scrolling the web");
		javascript.executeScript("window.scrollBy(0,250)");
		}
		catch(Exception ex) {
			
		}
	}
	

}
