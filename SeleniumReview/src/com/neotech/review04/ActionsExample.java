package com.neotech.review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class ActionsExample extends CommonMethods {
	
	public static void main(String[] args) {
		//http://webdriveruniversity.com/Actions/index.html
		
		setUp();
		
		Actions act = new Actions(driver);
		
//		drag and drop
//		WebElement draggable = driver.findElement(By.id("draggable"));
//		WebElement droppable = driver.findElement(By.id("droppable"));
//		
//		act.dragAndDrop(draggable,droppable).perform();
//		
//		act.clickAndHold(draggable).moveToElement(droppable).pause(1000).release().perform();

		//Double click
		
		//WebElement dblClickButton = driver.findElement(By.id("double-click"));
		
		//Does clicking 2 time work?----NO
		//dblClickButton.click();
		//dblClickButton.click();
		
		//act.doubleClick(dblClickButton).perform();
		
		
		
//		//Mouse Hover
//		List <WebElement>hoverButtons = driver.findElements(By.cssSelector("button.dropbtn"));
//		
//		for (WebElement hover : hoverButtons) {
//		act.moveToElement(hover).perform();
//		wait(1);
//		}
		
		//Click and Hold
		WebElement div=driver.findElement(By.id("click-box"));
		act.clickAndHold(div).pause(2000).release().pause(1000).clickAndHold().pause(1000).perform();
		
		wait(2);
	
		tearDown();

	}
}