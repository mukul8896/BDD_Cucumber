package org.mks.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.mks.actions.AssignmentActions;

public class AssignmentStepDef {
	@Given("^Navigate to the URL$")
	public void navigate_to_URL() throws InterruptedException {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.openURL();
	}

	@When("User Click on login button")
	public void user_Click_on_login_button() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.clickButton();
	}

	@When("User login with credentials")
	public void user_login_with_credentials() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.loginByCredentials();
	}

	@Then("validate the user account id")
	public void validate_the_user_account_id() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.validateAccountId();
	}
	
	@Then("User clear shoppingcart")
	public void user_clear_shoppingcart() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.clearShoppingCart();
	}
	
	@When("mousehover on the given category")
	public void mousehover_on_the_category() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.mouseHover();
	}

	@When("User selects a computer from the list")
	public void user_selects_a_computer_from_the_list() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.selectProduct();
	}

	@When("User enters quantity of product")
	public void user_enters_quantity_of_product() throws InterruptedException {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.selectQuantity();
	}
	

	@When("User get the price details")
	public void user_get_the_price_details() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.getPriceDetails();
	}

	@When("User click on Add to cart")
	public void user_click_on_Add_to_cart() throws InterruptedException {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.clickOnAddToCart();
	}

	@Then("validate the success message of product has been added")
	public void validate_the_success_message_of_product_has_been_added() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.validateMessageForProductsAddition();
	}

	@Then("validate subTotal price")
	public void validate_subTotal_price() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.validateSubTotalPrice();
	}

	@When("User clicks on checkout")
	public void user_clicks_on_checkout() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.click_CheckOut();
	}

	@Then("User select billing address")
	public void user_select_billing_address() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.selectBillingAddress();
	}

	@Then("User clicks on continue")
	public void user_clicks_on_continue() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.clickContinue();
	}

	@Then("User selects the shipping address")
	public void user_selects_the_shipping_address() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.selectShippingAddress();
	}

//	@Then("User selects shipping method")
//	public void user_selects_shipping_method() {
//		AssignmentActions assignmentActions = new AssignmentActions();
//		assignmentActions.selectShippingMethod();
//	}

	@When("User choose the payment method as COD")
	public void user_choose_the_payment_method_as_COD() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.selectPaymentMethod();
	}

	@Then("user validate message for COD confirmation")
	public void user_validate_message_for_COD_confirmation() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.validateMessageForCOD();
	}

	@When("User clicks on confirm button")
	public void user_clicks_on_confirm_button() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.clickOnConfirmButton();
	}

	@Then("validate the message for successful order")
	public void validate_the_message_for_successful_order() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.validateSuccessfulOrder();
	}

	@Then("User logout from the application")
	public void user_logout_from_the_application() {
		AssignmentActions assignmentActions = new AssignmentActions();
		assignmentActions.logOut();
	}
}
