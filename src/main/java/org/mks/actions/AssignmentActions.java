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
		System.out.println("-----Opening URL-----");
		DriverUtils.getDriver().get("http://demowebshop.tricentis.com/");
	}

	public void clickButton() {
		findElement(AssignmentPageObjects.login_link).click();
		Reporting.addStepScreenShot("User clicked on login button");
	}


	public void loginByCredentials() {
		String emailId = testData.get("emailId").toString();
		String password = testData.get("password").toString();
		findElement(AssignmentPageObjects.email_textbox).sendKeys(emailId);
		findElement(AssignmentPageObjects.password_textbox).sendKeys(password);
		Reporting.addStepScreenShot("User entered email and password");
		findElement(AssignmentPageObjects.login_button).click();
		Reporting.addStepLog("User click on login button");
	}


	public void validateAccountId() {
		String emailId = testData.get("emailId").toString();
		String expectedId=findElement(AssignmentPageObjects.accountId).getText();
		if(expectedId.equals(emailId)){
			Reporting.addHardStepWithScreenShot("Vaidated Account Id successfully",Status.PASS);
		}else {
			Reporting.addHardStepWithScreenShot("Vaidated Account Id successfully",Status.FAIL);
		}
	}

	public void clearShoppingCart() {
		String ExpectedCartEmptyText = testData.get("EmptyText").toString();
		waitForPageLoadComplete();
		waitForElementPresence(AssignmentPageObjects.ShoppingCart_itemcount_link);
		WebElement cart_item = findElement(AssignmentPageObjects.ShoppingCart_itemcount_link);
		if(!cart_item.getText().contains("0")){
			Reporting.addStepLog("Removing items from cart");
			findElement(AssignmentPageObjects.ShoppingCart_link).click();
			waitForPageLoadComplete();
			List<WebElement> remove_check_list = findElements(AssignmentPageObjects.remove_checkbox);
			for (WebElement checkboxes: remove_check_list) {
				checkboxes.click();
			}
			findElement(AssignmentPageObjects.updateShoppingCartbutton).click();
			if(findElement(AssignmentPageObjects.ShoppingCartEmptyMessage).getText().equals(ExpectedCartEmptyText)){
				Reporting.addStepScreenShot("Cart item is removed");
			}else{
				Reporting.addStepScreenShot("Cart item is not removed");
			}
		}else{
			Reporting.addStepScreenShot("Cart is already empty");
		}
	}

	public void mouseHover() {
		moveToElement(findElement(AssignmentPageObjects.computers_link));
		Reporting.addStepScreenShot("User move mouse to computers link");
	}

	public void selectProduct() {
		waitForElementPresence(AssignmentPageObjects.desktop);
		findElement(AssignmentPageObjects.desktop).click();
		String desktopType = testData.get("desktopType").toString();
		String price = DriverUtils.getDriver().findElement(By.xpath("//a[contains(text(),'"+desktopType+"')]//following::div[6]/span")).getText();
		Reporting.addStepLog("Desktop type: "+ desktopType);
		Reporting.addStepLog("Desktop price: "+ price);
		testData.put("Price", price);
		DriverUtils.getDriver().findElement(By.xpath("//a[contains(text(),'"+desktopType+"')]//following::div[7]/input")).click();
		Reporting.addStepScreenShot("User selected product: " + desktopType);
	}

	public void selectQuantity() {
		String quantity = testData.get("quantity").toString();
		waitForPageLoadComplete();
		scrollToBotton();
		waitForElementPresence(AssignmentPageObjects.quantity_texbox);
		findElement(AssignmentPageObjects.quantity_texbox).clear();
		findElement(AssignmentPageObjects.quantity_texbox).sendKeys(quantity);
		Reporting.addStepScreenShot("User selected quantity");
	}

	public void getPriceDetails() {
		String price = testData.get("Price").toString();
		Reporting.addStepLog("Price of Items: "+price);
	}

	public void clickOnAddToCart() {
		waitForElementPresence(AssignmentPageObjects.addToCartButton);
		findElement(AssignmentPageObjects.addToCartButton).click();
		Reporting.addStepLog("User clicked on add to cart button");
	}

	public void validateMessageForProductsAddition() {
		waitForElementPresence(AssignmentPageObjects.barNotification);
		waitForElementVisiblity(AssignmentPageObjects.barNotification);
		System.out.println(findElement(AssignmentPageObjects.barNotification).getText());
		String actual = findElement(AssignmentPageObjects.barNotification).getText();
		String expected = testData.get("productAdditionSuccessMsg").toString();
		if(actual.trim().equals(expected.trim())){
			Reporting.addHardStepWithScreenShot("Product addition text matches", Status.PASS);
		}else{
			Reporting.addHardStepWithScreenShot("Product addition text does not match", Status.FAIL);
		}
	}

	public void validateSubTotalPrice() {
		waitForElementPresence(AssignmentPageObjects.ShoppingCart_link);
		scrollToTop();
		findElement(AssignmentPageObjects.ShoppingCart_link).click();
		int quantity= Integer.parseInt(testData.get("quantity").toString());
		String price = findElement(AssignmentPageObjects.checkoutprice).getText();
		String pr=price.substring(0, 3);
		int price1= Integer.parseInt(pr);
		int total = price1 * quantity;
		String subTotalAmount = String.valueOf(total);
		//testData.put("subTotal", subTotalAmount);
		if(subTotalAmount.equals(findElement(AssignmentPageObjects.subTotal).getText().substring(0,4))){
			Reporting.addHardStepWithScreenShot("Sub total is correct",Status.PASS);
		}else{
			Reporting.addHardStepWithScreenShot("Sub total is correct",Status.FAIL);
		}
	}

	public void click_CheckOut() {
		waitForElementPresence(AssignmentPageObjects.termsCheckbox);
		waitForElementVisiblity(AssignmentPageObjects.termsCheckbox);
		findElement(AssignmentPageObjects.termsCheckbox).click();
		waitForElementVisiblity(AssignmentPageObjects.checkoutButton);
		findElement(AssignmentPageObjects.checkoutButton).click();
		Reporting.addStepLog("User click on check out button");
	}

	public void selectBillingAddress() {
		waitForElementPresence(AssignmentPageObjects.billingAddressText);
		if(findElement(AssignmentPageObjects.billingAddressText).isDisplayed()) {
			Select select = new Select(findElement(AssignmentPageObjects.billingAddressDropdown));
			select.selectByIndex(1);
			Reporting.addHardStepWithScreenShot("Billing address is selected",Status.INFO);
		}else {
			Reporting.addHardStepWithScreenShot("Billing address select box is not displayed",Status.INFO);
		}
	}

	public void clickContinue() {
		waitForElementPresence(AssignmentPageObjects.continueButton);
		findElement(AssignmentPageObjects.continueButton).click();
		Reporting.addStepLog("User click on continue button");
	}

	public void selectShippingAddress() {
		waitForElementPresence(AssignmentPageObjects.pickupCheckbox);
		findElement(AssignmentPageObjects.pickupCheckbox).click();
		waitForElementPresence(AssignmentPageObjects.continueButton1);
		findElement(AssignmentPageObjects.continueButton1).click();
		Reporting.addStepScreenShot("User select shipping address and click contnue button");
	}

	public void selectPaymentMethod() {
		String paymentMethod = testData.get("PaymentMethod").toString();
		String xpath = "//label[contains(text(),'"+paymentMethod+"')]//preceding-sibling::input";
		waitForElementPresence(xpath);
		findElement(xpath).click();
		waitForElementPresence(AssignmentPageObjects.continueButton2);
		findElement(AssignmentPageObjects.continueButton2).click();
		Reporting.addStepScreenShot("User select payment method and click on continue button");
	}

	public void validateMessageForCOD() {
		waitForElementPresence(AssignmentPageObjects.codMessage);
		String ActualCODMessage=findElement(AssignmentPageObjects.codMessage).getText();
		String expectedCODMessage= testData.get("CODMessage").toString();
		if(expectedCODMessage.equals(ActualCODMessage)){
			Reporting.addHardStepWithScreenShot("PASSED---Validated message for COD",Status.PASS);
		}else{
			Reporting.addHardStepWithScreenShot("FAILED---Validated message for COD",Status.FAIL);
		}
		findElement(AssignmentPageObjects.continueButton3).click();
	}

	public void clickOnConfirmButton() {
		waitForElementPresence(AssignmentPageObjects.confirmButton);
		scrollToBotton();
		waitForElementVisiblity(AssignmentPageObjects.confirmButton);
		findElement(AssignmentPageObjects.confirmButton).click();
		Reporting.addStepScreenShot("User click on confirm button");
	}

	public void validateSuccessfulOrder() {
		waitForElementPresence(AssignmentPageObjects.orderPlacedMessage);
		waitForElementVisiblity(AssignmentPageObjects.orderPlacedMessage);
		String orderplacedmsg = findElement(AssignmentPageObjects.orderPlacedMessage).getText();
		System.out.println("Order place messgae:"+orderplacedmsg);
		String orderNomsg = findElement(AssignmentPageObjects.orderNumberMessage).getText();
		System.out.println(orderNomsg.split(":")[1].trim());
		Reporting.addStepLog("Order Placed successfully: "+orderNomsg.split(":")[1].trim());
	}

	public void logOut() {
		waitForElementPresence(AssignmentPageObjects.logout);
		findElement(AssignmentPageObjects.logout).click();
		Reporting.addStepLog("User click on logout button");
	}
}
