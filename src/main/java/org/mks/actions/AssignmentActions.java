package org.mks.actions;

import org.json.simple.JSONObject;
import org.mks.applicationUtils.Reporting;
import org.mks.applicationUtils.Status;
import org.mks.pageObjects.AssignmentPageObjects;
import org.mks.runInitilization.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

import java.util.List;

public class AssignmentActions extends BaseActions {

	JSONObject testData;
	public AssignmentActions(){
		this.testData = (JSONObject) DriverUtils.getPageData().get(this.getClass().getSimpleName());
	}

	public void openURL() throws InterruptedException {
		System.out.println("open url");

		DriverUtils.getDriver().get("http://demowebshop.tricentis.com/");
	}

	public void clickButton() {
		findElement(AssignmentPageObjects.login_link).click();
	}


	public void loginByCredentials() {
		String emailId = testData.get("emailId").toString();
		String password = testData.get("password").toString();
		findElement(AssignmentPageObjects.email_textbox).sendKeys(emailId);
		findElement(AssignmentPageObjects.password_textbox).sendKeys(password);
		findElement(AssignmentPageObjects.login_button).click();
	}

	@SuppressWarnings("deprecation")
	public void validateAccountId() {
		String emailId = testData.get("emailId").toString();
		String expectedId=findElement(AssignmentPageObjects.accountId).getText();
		Assert.assertEquals("Vaidated Account Id successfully", expectedId, emailId);
	}

	@SuppressWarnings("deprecation")
	public void clearShoppingCart() {
		String ExpectedCartEmptyText = testData.get("EmptyText").toString();
		waitForPageLoadComplete();
		WebElement cart_item = findElement(AssignmentPageObjects.ShoppingCart_itemcount_link);
		if(!cart_item.getText().contains("0")){
			Reporting.addStepLog("Removing items");
			findElement(AssignmentPageObjects.ShoppingCart_link).click();
			List<WebElement> remove_check_list = findElements(AssignmentPageObjects.remove_checkbox);
			for (WebElement checkboxes: remove_check_list) {
				checkboxes.click();
			}
			findElement(AssignmentPageObjects.updateShoppingCartbutton).click();
			Assert.assertEquals(findElement(AssignmentPageObjects.ShoppingCartEmptyMessage).getText(),ExpectedCartEmptyText);
			Reporting.addStepScreenShot("Cart item is removed");
		}else{
			Reporting.addStepScreenShot("Cart is already empty");
		}
	}

	public void mouseHover() {
		Actions ac = new Actions(DriverUtils.getDriver());
		ac.moveToElement(findElement(AssignmentPageObjects.computers_link)).build().perform();
	}

	public void selectProduct() {
		findElement(AssignmentPageObjects.desktop).click();
		String desktopType = testData.get("desktopType").toString();
		String price = DriverUtils.getDriver().findElement(By.xpath("//a[contains(text(),'"+desktopType+"')]//following::div[6]/span")).getText();
		testData.put("Price", price);
		DriverUtils.getDriver().findElement(By.xpath("//a[contains(text(),'"+desktopType+"')]//following::div[7]/input")).click();
	}

	public void selectQuantity() throws InterruptedException {
		String quantity = testData.get("quantity").toString();
		waitForPageLoadComplete();
		JavascriptExecutor js = (JavascriptExecutor) DriverUtils.getDriver();
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		waitForElementPresence(AssignmentPageObjects.quantity_texbox);
		findElement(AssignmentPageObjects.quantity_texbox).clear();
		findElement(AssignmentPageObjects.quantity_texbox).sendKeys(quantity);
	}

	public void getPriceDetails() {
		String price = testData.get("Price").toString();
	}

	public void clickOnAddToCart() throws InterruptedException {
		findElement(AssignmentPageObjects.addToCartButton).click();
		Thread.sleep(4000);
	}

	public void validateMessageForProductsAddition() {
		waitForElementVisiblity(AssignmentPageObjects.barNotification);
		System.out.println(findElement(AssignmentPageObjects.barNotification).getText());
		String actual = findElement(AssignmentPageObjects.barNotification).getText();
		String expected = testData.get("productAdditionSuccessMsg").toString();
		System.out.println(expected);
		if(actual.trim().equals(expected.trim())){
			Reporting.addHardStepWithScreenShot("Text Matches", Status.PASS);
		}else{
			Reporting.addHardStepWithScreenShot("Text  does not Match", Status.FAIL);
		}
	}

	public void validateSubTotalPrice() {
		findElement(AssignmentPageObjects.ShoppingCart_link).click();
		int quantity= Integer.parseInt(testData.get("quantity").toString());
		String price = findElement(AssignmentPageObjects.checkoutprice).getText();
		String pr=price.substring(0, 3);
		int price1= Integer.parseInt(pr);
		int total = price1 * quantity;
		String subTotalAmount = String.valueOf(total);
		//testData.put("subTotal", subTotalAmount);
		Assert.assertEquals(subTotalAmount, findElement(AssignmentPageObjects.subTotal).getText().substring(0,4));
	}

	public void click_CheckOut() {
		findElement(AssignmentPageObjects.termsCheckbox).click();
		findElement(AssignmentPageObjects.checkoutButton).click();
	}

	public void selectBillingAddress() {
		if(findElement(AssignmentPageObjects.billingAddressText).isDisplayed()) {
			Select select = new Select(findElement(AssignmentPageObjects.billingAddressDropdown));
			select.selectByIndex(1);
		}else {

		}
	}

	public void clickContinue() {
		findElement(AssignmentPageObjects.continueButton).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectShippingAddress() {
		findElement(AssignmentPageObjects.pickupCheckbox).click();
		findElement(AssignmentPageObjects.continueButton1).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectPaymentMethod() {
		String paymentMethod = testData.get("PaymentMethod").toString();
		DriverUtils.getDriver().findElement(By.xpath("//label[contains(text(),'"+paymentMethod+"')]//preceding-sibling::input")).click();
		findElement(AssignmentPageObjects.continueButton2).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void validateMessageForCOD() {
		String ActualCODMessage=findElement(AssignmentPageObjects.codMessage).getText();
		String expectedCODMessage= testData.get("CODMessage").toString();
		Assert.assertEquals("Validate message for COD", expectedCODMessage, ActualCODMessage);
		findElement(AssignmentPageObjects.continueButton3).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnConfirmButton() {
		findElement(AssignmentPageObjects.confirmButton).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void validateSuccessfulOrder() {
		String orderplacedmsg = findElement(AssignmentPageObjects.orderPlacedMessage).getText();
		String orderNomsg = findElement(AssignmentPageObjects.orderNumberMessage).getText();
		System.out.println(orderNomsg.split(":")[1].trim());

	}

	public void logOut() {
		findElement(AssignmentPageObjects.logout).click();
	}
}
