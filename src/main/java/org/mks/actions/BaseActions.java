package org.mks.actions;

import org.mks.runInitilization.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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

    public  void waitForPageLoadComplete(){
        WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(),20000);
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }
}
