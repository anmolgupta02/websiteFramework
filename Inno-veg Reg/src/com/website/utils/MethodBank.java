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

	
	//Helper Method to enter data into a field	
	public void enterbox(WebElement textBox, String textToBeEntered) {
		textBox.sendKeys(textToBeEntered);
	}

	//Helper Method to Click on the element 
	public void clickOnElement(WebElement Clicked) {
		Clicked.click();

	}

	//Helper Method for making the webdriver wait for a element.
	public void WaitForElement(WebElement element, String Path) {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Path)));
	}

	
	//Helper Method to return content of any element 
	public String getText(WebElement element) {

		return element.getText();

	}

	//Helper Method to handle the click using Actions class
	public void HandleClickAction(WebElement element) {

		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}

	//Helper Method to Handle Dropdowns
	public void HandleDropdownVisibleText(WebElement Element, String visibleText) {

		Select sel = new Select(Element);
		sel.selectByVisibleText(visibleText);

	}
	
	
	//Helper Method to handle dropdown using the index of the element 
	public void HandleDropdownByIndex(WebElement Element, int index) {

		Select sel = new Select(Element);
		sel.selectByIndex(index);

	}
	
	
	//Helper Method to get content of element containing any error message 
	public String getErrorMsg(WebElement ErrorDiv) {
		return ErrorDiv.getText();
	}

	//Helper Method to check the presence of element
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
	
	
	//Helper Method to clear a text field first and then write something
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
	
	//Helper Method to verify a text against the expected text 
	public boolean verifyText(WebElement element, String ExpectedText) {
		flag=false;
		
		if(element.getText().equalsIgnoreCase(ExpectedText))
			flag=true;
		
		
		return flag;
		
	}
	
	//Helper Method to handle keyboard actions 
	public void HandleKeyBoardEvent(WebElement element, String text) {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().sendKeys(element, text).build().perform();
	}
	
	
	//Helper Method to scrolling down a page by 250px. 
	public void javaScriptScroll(WebElement Element) {
		try{ 
			System.out.println("Scrolling the web");
		javascript.executeScript("window.scrollBy(0,250)");
		}
		catch(Exception ex) {
			
		}
	}
	

	//Helper Method to scrolling up a page by 250px
	public void javaScriptScrollUp(WebElement Element) {
		try{ 
			System.out.println("Scrolling the web");
		javascript.executeScript("window.scrollBy(0,-250)");
		}
		catch(Exception ex) {
			
		}
	}

}
