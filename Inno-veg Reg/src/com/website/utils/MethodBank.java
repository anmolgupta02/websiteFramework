package com.website.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MethodBank extends BaseClass {
	
	
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
		
}
