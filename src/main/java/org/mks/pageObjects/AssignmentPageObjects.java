package org.mks.pageObjects;

public class AssignmentPageObjects {
	public static String login_link = "//a[text()='Log in']";
	public static String email_textbox = "//input[@id='Email']";
	public static String password_textbox = "//input[@id='Password']";
	public static String login_button = "//input[@value='Log in']";
	public static String accountId = "(//a[@class='account'])[1]";
	public static String ShoppingCart_link = "//span[text()='Shopping cart']";

	public static String ShoppingCart_itemcount_link = "//span[text()='Shopping cart']/ancestor::a/span[2]";

	public static String remove_checkbox = "//input[@name='removefromcart']";
	public static String updateShoppingCartbutton = "//input[@value='Update shopping cart']";
	public static String ShoppingCartEmptyMessage = "//*[contains(text(),'Your Shopping Cart')]";
	public static String computers_link = "//a[contains(text(),'Computers')]";
	public static String desktop = "//a[contains(text(),'Desktop')]";
	public static String desktopType = "//a[contains(text(),'Build your own cheap')]";
	public static String quantity_texbox = "//input[@id='addtocart_72_EnteredQuantity']";
	public static String addToCartButton = "//input[@id='add-to-cart-button-72']";
	public static String barNotification = "//div[@id='bar-notification']";
	public static String checkoutprice = "//td[@class='product']//following::td[1]/span[2]";
	public static String subTotal = "//span[@class='product-price']";
	public static String termsCheckbox = "//input[@id='termsofservice']";
	public static String checkoutButton = "//button[@id='checkout']";
	public static String billingAddressDropdown = "//select[@id='billing-address-select']";
	public static String billingAddressText = "//label[contains(text(),'billing')]";
	public static String continueButton = "(//input[@value='Continue'])[1]";
	public static String pickupCheckbox = "//input[@id='PickUpInStore']";
	public static String continueButton1 = "(//input[@value='Continue'])[2]";
	public static String continueButton2 = "(//input[@value='Continue'])[4]";
	public static String continueButton3 = "(//input[@value='Continue'])[5]";
	public static String codMessage = "//p[text()='You will pay by COD']";
	public static String confirmButton = "//input[@value='Confirm']";
	public static String orderPlacedMessage = "//Strong[text()='Your order has been successfully processed!']";
	public static String orderNumberMessage = "//li[contains(text(),'Order')]";
	public static String logout = "//a[text()='Log out']";

}
