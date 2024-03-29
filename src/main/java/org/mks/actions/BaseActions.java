package org.mks.actions;

import org.mks.pageObjects.AssignmentPageObjects;
import org.mks.runInitilization.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseActions {
    public WebElement findElement(String xpath){
        return DriverUtils.getDriver().findElement(By.xpath(xpath));
    }

    public List<WebElement> findElements(String xpath){
        return DriverUtils.getDriver().findElements(By.xpath(xpath));
    }

    public void waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(),20000);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementPresence(String element){
        WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(),20000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
    }


    public void waitForElementVisiblity(String element){
        WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(),20000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
    }


    public  void waitForPageLoadComplete(){
        WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(),20000);
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void moveToElement(WebElement element){
        Actions ac = new Actions(DriverUtils.getDriver());
        ac.moveToElement(element).build().perform();
    }

    public void scrollToBotton(){
        JavascriptExecutor js = (JavascriptExecutor) DriverUtils.getDriver();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
    }

    public void scrollToTop() {
        JavascriptExecutor js = (JavascriptExecutor) DriverUtils.getDriver();
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
    }
}
