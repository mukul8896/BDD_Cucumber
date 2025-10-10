├── .gitignore
├── driver
    └── chrome
    │   └── chromedriver.exe
├── pom.xml
└── src
    ├── main
        └── java
        │   └── org
        │       └── mks
        │           ├── actions
        │               ├── AssignmentActions.java
        │               ├── BaseActions.java
        │               └── GoogleSearchActions.java
        │           ├── applicationUtils
        │               ├── ProjectUtils.java
        │               ├── Reporting.java
        │               ├── Status.java
        │               └── WebDriverSession.java
        │           ├── pageObjects
        │               └── AssignmentPageObjects.java
        │           ├── runInitilization
        │               ├── DriverUtils.java
        │               └── Hooks.java
        │           ├── runner
        │               └── runner.java
        │           └── stepDef
        │               ├── AssignmentStepDef.java
        │               └── GoogleSearchStepDef.java
    └── test
        └── resource
            ├── config.properties
            ├── features
                ├── AssignmentTest.feature
                └── GoogleSearchTest.feature
            └── testData
                └── stage1
                    ├── AssignmentData.json
                    └── GoogleSearchData.json


/.gitignore:
--------------------------------------------------------------------------------
 1 | /reports
 2 | 
 3 | /target
 4 | 
 5 | .classpath
 6 | 
 7 | .idea
 8 | 
 9 | .settings
10 | 
11 | .vscode
12 | 
13 | .project


--------------------------------------------------------------------------------
/driver/chrome/chromedriver.exe:
--------------------------------------------------------------------------------
https://raw.githubusercontent.com/mukul8896/BDD_Cucumber/612948cc655f26509f38f62294f31c7d1f4abe71/driver/chrome/chromedriver.exe


--------------------------------------------------------------------------------
/pom.xml:
--------------------------------------------------------------------------------
  1 | <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  2 | 	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  3 | 	<modelVersion>4.0.0</modelVersion>
  4 | 
  5 | 	<groupId>org.mks</groupId>
  6 | 	<artifactId>base_ui</artifactId>
  7 | 	<version>0.0.1-SNAPSHOT</version>
  8 | 	<packaging>jar</packaging>
  9 | 
 10 | 	<name>base_ui</name>
 11 | 	<url>http://maven.apache.org</url>
 12 | 
 13 | 	<properties>
 14 | 		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
 15 | 		<property>env</property>
 16 | 		<property>browser</property>
 17 | 		<property>tag</property>
 18 | 	</properties>
 19 | 
 20 | 	<dependencies>
 21 | 		<dependency>
 22 | 			<groupId>org.seleniumhq.selenium</groupId>
 23 | 			<artifactId>selenium-java</artifactId>
 24 | 			<version>3.7.1</version>
 25 | 		</dependency>
 26 | 		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
 27 | 		<dependency>
 28 | 			<groupId>org.testng</groupId>
 29 | 			<artifactId>testng</artifactId>
 30 | 			<version>7.7.1</version>
 31 | 		</dependency>
 32 | 		<dependency>
 33 | 			<groupId>io.cucumber</groupId>
 34 | 			<artifactId>cucumber-core</artifactId>
 35 | 			<version>4.6.0</version>
 36 | 		</dependency>
 37 | 		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
 38 | 		<dependency>
 39 | 			<groupId>io.cucumber</groupId>
 40 | 			<artifactId>cucumber-junit</artifactId>
 41 | 			<version>4.6.0</version>
 42 | 			<scope>test</scope>
 43 | 		</dependency>
 44 | 		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
 45 | 		<dependency>
 46 | 			<groupId>io.cucumber</groupId>
 47 | 			<artifactId>cucumber-java</artifactId>
 48 | 			<version>4.6.0</version>
 49 | 		</dependency>
 50 | 
 51 | 		<dependency>
 52 | 			<groupId>com.vimalselvam</groupId>
 53 | 			<artifactId>cucumber-extentsreport</artifactId>
 54 | 			<version>3.0.2</version>
 55 | 		</dependency>
 56 | 		<dependency>
 57 | 			<groupId>com.aventstack</groupId>
 58 | 			<artifactId>extentreports</artifactId>
 59 | 			<version>3.1.2</version>
 60 | 		</dependency>
 61 | 
 62 | 		<!-- https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple -->
 63 | 		<dependency>
 64 | 			<groupId>com.googlecode.json-simple</groupId>
 65 | 			<artifactId>json-simple</artifactId>
 66 | 			<version>1.1.1</version>
 67 | 		</dependency>
 68 | 		<!-- https://mvnrepository.com/artifact/net.masterthought/cucumber-reporting -->
 69 | 		<dependency>
 70 | 			<groupId>net.masterthought</groupId>
 71 | 			<artifactId>cucumber-reporting</artifactId>
 72 | 			<version>4.11.2</version>
 73 | 		</dependency>
 74 | 		<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
 75 | 		<dependency>
 76 | 			<groupId>com.fasterxml.jackson.core</groupId>
 77 | 			<artifactId>jackson-databind</artifactId>
 78 | 			<version>2.12.7.1</version>
 79 | 		</dependency>
 80 | 
 81 | 
 82 | 	</dependencies>
 83 | 	<build>
 84 | 		<resources>
 85 |       		<resource>
 86 |         		<directory>src/test/resource</directory>
 87 |       		</resource>
 88 | 		</resources>
 89 | 		<plugins>
 90 | 			<plugin>
 91 | 				<groupId>net.masterthought</groupId>
 92 | 				<artifactId>maven-cucumber-reporting</artifactId>
 93 | 				<version>3.15.0</version>
 94 | 				<executions>
 95 | 					<execution>
 96 | 						<id>execution</id>
 97 | 						<phase>verify</phase>
 98 | 						<goals>
 99 | 							<goal>generate</goal>
100 | 						</goals>
101 | 						<configuration>
102 | 							<projectName>bdd_cucumber</projectName>
103 | 							<outputDirectory>${project.build.directory}/cucumber-html-reports</outputDirectory>
104 | 							<cucumberOutput>${project.build.directory}/cucumber.json</cucumberOutput>
105 | 							<jsonFiles>
106 | 								<param>${project.build.directory}/cucumber.json</param>
107 | 							</jsonFiles>
108 | 							<buildNumber>42</buildNumber>
109 | 						</configuration>
110 | 					</execution>
111 | 				</executions>
112 | 			</plugin>
113 | 			<plugin>
114 | 				<groupId>org.codehaus.mojo</groupId>
115 | 				<artifactId>exec-maven-plugin</artifactId>
116 | 				<version>1.2.1</version>
117 | 				<executions>
118 | 					<execution>
119 | 						<phase>test</phase>
120 | 						<goals>
121 | 							<goal>java</goal>
122 | 						</goals>
123 | 					</execution>
124 | 				</executions>
125 | 				<configuration>
126 | 					<mainClass>org.mks.runner.runner</mainClass>
127 | 					<arguments>
128 | 						<argument>JenkinsRun</argument>
129 | 					</arguments>
130 | 				</configuration>
131 | 			</plugin>
132 | 			<plugin>
133 | 				<groupId>org.apache.maven.plugins</groupId>
134 | 				<artifactId>maven-compiler-plugin</artifactId>
135 | 				<version>3.8.1</version>
136 | 				<configuration>
137 | 					<source>11</source>
138 | 					<target>11</target>
139 | 				</configuration>
140 | 			</plugin>
141 | 		</plugins>
142 | 	</build>
143 | 
144 | </project>
145 | 


--------------------------------------------------------------------------------
/src/main/java/org/mks/actions/AssignmentActions.java:
--------------------------------------------------------------------------------
  1 | package org.mks.actions;
  2 | 
  3 | import org.json.simple.JSONObject;
  4 | import org.mks.applicationUtils.Reporting;
  5 | import org.mks.applicationUtils.Status;
  6 | import org.mks.pageObjects.AssignmentPageObjects;
  7 | import org.mks.runInitilization.DriverUtils;
  8 | import org.openqa.selenium.By;
  9 | import org.openqa.selenium.WebElement;
 10 | import org.openqa.selenium.support.ui.Select;
 11 | 
 12 | 
 13 | import java.util.List;
 14 | 
 15 | public class AssignmentActions extends BaseActions {
 16 | 
 17 | 	JSONObject testData;
 18 | 	public AssignmentActions(){
 19 | 		this.testData = (JSONObject) DriverUtils.getPageData().get(this.getClass().getSimpleName());
 20 | 	}
 21 | 
 22 | 	public void openURL() throws InterruptedException {
 23 | 		System.out.println("-----Opening URL-----");
 24 | 		DriverUtils.getDriver().get("http://demowebshop.tricentis.com/");
 25 | 	}
 26 | 
 27 | 	public void clickButton() {
 28 | 		findElement(AssignmentPageObjects.login_link).click();
 29 | 		Reporting.addStepScreenShot("User clicked on login button");
 30 | 	}
 31 | 
 32 | 
 33 | 	public void loginByCredentials() {
 34 | 		String emailId = testData.get("emailId").toString();
 35 | 		String password = testData.get("password").toString();
 36 | 		findElement(AssignmentPageObjects.email_textbox).sendKeys(emailId);
 37 | 		findElement(AssignmentPageObjects.password_textbox).sendKeys(password);
 38 | 		Reporting.addStepScreenShot("User entered email and password");
 39 | 		findElement(AssignmentPageObjects.login_button).click();
 40 | 		Reporting.addStepLog("User click on login button");
 41 | 	}
 42 | 
 43 | 
 44 | 	public void validateAccountId() {
 45 | 		String emailId = testData.get("emailId").toString();
 46 | 		String expectedId=findElement(AssignmentPageObjects.accountId).getText();
 47 | 		if(expectedId.equals(emailId)){
 48 | 			Reporting.addHardStepWithScreenShot("Vaidated Account Id successfully",Status.PASS);
 49 | 		}else {
 50 | 			Reporting.addHardStepWithScreenShot("Vaidated Account Id successfully",Status.FAIL);
 51 | 		}
 52 | 	}
 53 | 
 54 | 	public void clearShoppingCart() {
 55 | 		String ExpectedCartEmptyText = testData.get("EmptyText").toString();
 56 | 		waitForPageLoadComplete();
 57 | 		waitForElementPresence(AssignmentPageObjects.ShoppingCart_itemcount_link);
 58 | 		WebElement cart_item = findElement(AssignmentPageObjects.ShoppingCart_itemcount_link);
 59 | 		//logic to check any number of items
 60 | 
 61 | 		if(!cart_item.getText().contains("0")){
 62 | 			Reporting.addStepLog("Removing items from cart");
 63 | 			findElement(AssignmentPageObjects.ShoppingCart_link).click();
 64 | 			waitForPageLoadComplete();
 65 | 			List<WebElement> remove_check_list = findElements(AssignmentPageObjects.remove_checkbox);
 66 | 			for (WebElement checkboxes: remove_check_list) {
 67 | 				checkboxes.click();
 68 | 			}
 69 | 			findElement(AssignmentPageObjects.updateShoppingCartbutton).click();
 70 | 			if(findElement(AssignmentPageObjects.ShoppingCartEmptyMessage).getText().equals(ExpectedCartEmptyText)){
 71 | 				Reporting.addStepScreenShot("Cart item is removed");
 72 | 			}else{
 73 | 				Reporting.addStepScreenShot("Cart item is not removed");
 74 | 			}
 75 | 		}else{
 76 | 			Reporting.addStepScreenShot("Cart is already empty");
 77 | 		}
 78 | 	}
 79 | 
 80 | 	public void mouseHover() {
 81 | 		moveToElement(findElement(AssignmentPageObjects.computers_link));
 82 | 		Reporting.addStepScreenShot("User move mouse to computers link");
 83 | 	}
 84 | 
 85 | 	public void selectProduct() {
 86 | 		waitForElementPresence(AssignmentPageObjects.desktop);
 87 | 		findElement(AssignmentPageObjects.desktop).click();
 88 | 		String desktopType = testData.get("desktopType").toString();
 89 | 		String price = DriverUtils.getDriver().findElement(By.xpath("//a[contains(text(),'"+desktopType+"')]//following::div[6]/span")).getText();
 90 | 		Reporting.addStepLog("Desktop type: "+ desktopType);
 91 | 		Reporting.addStepLog("Desktop price: "+ price);
 92 | 		testData.put("Price", price);
 93 | 		DriverUtils.getDriver().findElement(By.xpath("//a[contains(text(),'"+desktopType+"')]//following::div[7]/input")).click();
 94 | 		Reporting.addStepScreenShot("User selected product: " + desktopType);
 95 | 	}
 96 | 
 97 | 	public void selectQuantity() {
 98 | 		String quantity = testData.get("quantity").toString();
 99 | 		waitForPageLoadComplete();
100 | 		scrollToBotton();
101 | 		waitForElementPresence(AssignmentPageObjects.quantity_texbox);
102 | 		findElement(AssignmentPageObjects.quantity_texbox).clear();
103 | 		findElement(AssignmentPageObjects.quantity_texbox).sendKeys(quantity);
104 | 		Reporting.addStepScreenShot("User selected quantity");
105 | 	}
106 | 
107 | 	public void getPriceDetails() {
108 | 		String price = testData.get("Price").toString();
109 | 		Reporting.addStepLog("Price of Items: "+price);
110 | 	}
111 | 
112 | 	public void clickOnAddToCart() {
113 | 		waitForElementPresence(AssignmentPageObjects.addToCartButton);
114 | 		findElement(AssignmentPageObjects.addToCartButton).click();
115 | 		Reporting.addStepLog("User clicked on add to cart button");
116 | 	}
117 | 
118 | 	public void validateMessageForProductsAddition() {
119 | 		waitForElementPresence(AssignmentPageObjects.barNotification);
120 | 		waitForElementVisiblity(AssignmentPageObjects.barNotification);
121 | 		System.out.println(findElement(AssignmentPageObjects.barNotification).getText());
122 | 		String actual = findElement(AssignmentPageObjects.barNotification).getText();
123 | 		String expected = testData.get("productAdditionSuccessMsg").toString();
124 | 		if(actual.trim().equals(expected.trim())){
125 | 			Reporting.addHardStepWithScreenShot("Product addition text matches", Status.PASS);
126 | 		}else{
127 | 			Reporting.addHardStepWithScreenShot("Product addition text does not match", Status.FAIL);
128 | 		}
129 | 	}
130 | 
131 | 	public void validateSubTotalPrice() {
132 | 		waitForElementPresence(AssignmentPageObjects.ShoppingCart_link);
133 | 		scrollToTop();
134 | 		findElement(AssignmentPageObjects.ShoppingCart_link).click();
135 | 		int quantity= Integer.parseInt(testData.get("quantity").toString());
136 | 		String price = findElement(AssignmentPageObjects.checkoutprice).getText();
137 | 		String pr=price.substring(0, 3);
138 | 		int price1= Integer.parseInt(pr);
139 | 		int total = price1 * quantity;
140 | 		String subTotalAmount = String.valueOf(total);
141 | 		//testData.put("subTotal", subTotalAmount);
142 | 		if(subTotalAmount.equals(findElement(AssignmentPageObjects.subTotal).getText().substring(0,4))){
143 | 			Reporting.addHardStepWithScreenShot("Sub total is correct",Status.PASS);
144 | 		}else{
145 | 			Reporting.addHardStepWithScreenShot("Sub total is in-correct",Status.FAIL);
146 | 		}
147 | 	}
148 | 
149 | 	public void click_CheckOut() {
150 | 		waitForElementPresence(AssignmentPageObjects.termsCheckbox);
151 | 		waitForElementVisiblity(AssignmentPageObjects.termsCheckbox);
152 | 		findElement(AssignmentPageObjects.termsCheckbox).click();
153 | 		waitForElementVisiblity(AssignmentPageObjects.checkoutButton);
154 | 		findElement(AssignmentPageObjects.checkoutButton).click();
155 | 		Reporting.addStepLog("User click on check out button");
156 | 	}
157 | 
158 | 	public void selectBillingAddress() {
159 | 		waitForElementPresence(AssignmentPageObjects.billingAddressText);
160 | 		if(findElement(AssignmentPageObjects.billingAddressText).isDisplayed()) {
161 | 			Select select = new Select(findElement(AssignmentPageObjects.billingAddressDropdown));
162 | 			select.selectByIndex(1);
163 | 			Reporting.addHardStepWithScreenShot("Billing address is selected",Status.INFO);
164 | 		}else {
165 | 			Reporting.addHardStepWithScreenShot("Billing address select box is not displayed",Status.INFO);
166 | 		}
167 | 	}
168 | 
169 | 	public void clickContinue() {
170 | 		waitForElementPresence(AssignmentPageObjects.continueButton);
171 | 		findElement(AssignmentPageObjects.continueButton).click();
172 | 		Reporting.addStepLog("User click on continue button");
173 | 	}
174 | 
175 | 	public void selectShippingAddress() {
176 | 		waitForElementPresence(AssignmentPageObjects.pickupCheckbox);
177 | 		findElement(AssignmentPageObjects.pickupCheckbox).click();
178 | 		waitForElementPresence(AssignmentPageObjects.continueButton1);
179 | 		findElement(AssignmentPageObjects.continueButton1).click();
180 | 		Reporting.addStepScreenShot("User select shipping address and click contnue button");
181 | 	}
182 | 
183 | 	public void selectPaymentMethod() {
184 | 		String paymentMethod = testData.get("PaymentMethod").toString();
185 | 		String xpath = "//label[contains(text(),'"+paymentMethod+"')]//preceding-sibling::input";
186 | 		waitForElementPresence(xpath);
187 | 		findElement(xpath).click();
188 | 		waitForElementPresence(AssignmentPageObjects.continueButton2);
189 | 		findElement(AssignmentPageObjects.continueButton2).click();
190 | 		Reporting.addStepScreenShot("User select payment method and click on continue button");
191 | 	}
192 | 
193 | 	public void validateMessageForCOD() {
194 | 		waitForElementPresence(AssignmentPageObjects.codMessage);
195 | 		String ActualCODMessage=findElement(AssignmentPageObjects.codMessage).getText();
196 | 		String expectedCODMessage= testData.get("CODMessage").toString();
197 | 		if(expectedCODMessage.equals(ActualCODMessage)){
198 | 			Reporting.addHardStepWithScreenShot("PASSED---Validated message for COD",Status.PASS);
199 | 		}else{
200 | 			Reporting.addHardStepWithScreenShot("FAILED---Validated message for COD",Status.FAIL);
201 | 		}
202 | 		findElement(AssignmentPageObjects.continueButton3).click();
203 | 	}
204 | 
205 | 	public void clickOnConfirmButton() {
206 | 		waitForElementPresence(AssignmentPageObjects.confirmButton);
207 | 		scrollToBotton();
208 | 		waitForElementVisiblity(AssignmentPageObjects.confirmButton);
209 | 		findElement(AssignmentPageObjects.confirmButton).click();
210 | 		Reporting.addStepScreenShot("User click on confirm button");
211 | 	}
212 | 
213 | 	public void validateSuccessfulOrder() {
214 | 		waitForElementPresence(AssignmentPageObjects.orderPlacedMessage);
215 | 		waitForElementVisiblity(AssignmentPageObjects.orderPlacedMessage);
216 | 		String orderplacedmsg = findElement(AssignmentPageObjects.orderPlacedMessage).getText();
217 | 		System.out.println("Order place messgae:"+orderplacedmsg);
218 | 		String orderNomsg = findElement(AssignmentPageObjects.orderNumberMessage).getText();
219 | 		System.out.println(orderNomsg.split(":")[1].trim());
220 | 		Reporting.addStepLog("Order Placed successfully: "+orderNomsg.split(":")[1].trim());
221 | 	}
222 | 
223 | 	public void logOut() {
224 | 		waitForElementPresence(AssignmentPageObjects.logout);
225 | 		findElement(AssignmentPageObjects.logout).click();
226 | 		Reporting.addStepLog("User click on logout button");
227 | 	}
228 | }
229 | 


--------------------------------------------------------------------------------
/src/main/java/org/mks/actions/BaseActions.java:
--------------------------------------------------------------------------------
 1 | package org.mks.actions;
 2 | 
 3 | import org.mks.pageObjects.AssignmentPageObjects;
 4 | import org.mks.runInitilization.DriverUtils;
 5 | import org.openqa.selenium.By;
 6 | import org.openqa.selenium.JavascriptExecutor;
 7 | import org.openqa.selenium.WebElement;
 8 | import org.openqa.selenium.interactions.Actions;
 9 | import org.openqa.selenium.support.ui.ExpectedConditions;
10 | import org.openqa.selenium.support.ui.WebDriverWait;
11 | 
12 | import java.util.List;
13 | 
14 | public class BaseActions {
15 |     public WebElement findElement(String xpath){
16 |         return DriverUtils.getDriver().findElement(By.xpath(xpath));
17 |     }
18 | 
19 |     public List<WebElement> findElements(String xpath){
20 |         return DriverUtils.getDriver().findElements(By.xpath(xpath));
21 |     }
22 | 
23 |     public void waitForElement(WebElement element){
24 |         WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(),20000);
25 |         wait.until(ExpectedConditions.visibilityOf(element));
26 |     }
27 | 
28 |     public void waitForElementPresence(String element){
29 |         WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(),20000);
30 |         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
31 |     }
32 | 
33 | 
34 |     public void waitForElementVisiblity(String element){
35 |         WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(),20000);
36 |         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
37 |     }
38 | 
39 | 
40 |     public  void waitForPageLoadComplete(){
41 |         WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(),20000);
42 |         wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
43 |     }
44 | 
45 |     public void moveToElement(WebElement element){
46 |         Actions ac = new Actions(DriverUtils.getDriver());
47 |         ac.moveToElement(element).build().perform();
48 |     }
49 | 
50 |     public void scrollToBotton(){
51 |         JavascriptExecutor js = (JavascriptExecutor) DriverUtils.getDriver();
52 |         js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
53 |     }
54 | 
55 |     public void scrollToTop() {
56 |         JavascriptExecutor js = (JavascriptExecutor) DriverUtils.getDriver();
57 |         js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
58 |     }
59 | }
60 | 


--------------------------------------------------------------------------------
/src/main/java/org/mks/actions/GoogleSearchActions.java:
--------------------------------------------------------------------------------
 1 | package org.mks.actions;
 2 | 
 3 | import org.json.simple.JSONObject;
 4 | import org.mks.runInitilization.DriverUtils;
 5 | 
 6 | public class GoogleSearchActions extends BaseActions{
 7 |     JSONObject testData;
 8 |     public GoogleSearchActions(){
 9 |         this.testData = (JSONObject) DriverUtils.getPageData().get(this.getClass().getSimpleName());
10 |     }
11 | 
12 |     public void openGooglePage() {
13 |         System.out.println(testData.get("data1").toString());
14 |     }
15 | }
16 | 


--------------------------------------------------------------------------------
/src/main/java/org/mks/applicationUtils/ProjectUtils.java:
--------------------------------------------------------------------------------
 1 | package org.mks.applicationUtils;
 2 | 
 3 | 
 4 | import java.io.*;
 5 | import java.nio.file.Files;
 6 | import java.nio.file.Paths;
 7 | import java.util.Properties;
 8 | 
 9 | import io.cucumber.core.api.Scenario;
10 | import org.json.simple.JSONObject;
11 | import org.json.simple.parser.JSONParser;
12 | import org.json.simple.parser.ParseException;
13 | import org.mks.runInitilization.DriverUtils;
14 | import org.openqa.selenium.WebDriver;
15 | import org.openqa.selenium.chrome.ChromeDriver;
16 | import org.openqa.selenium.interactions.Actions;
17 | 
18 | public class ProjectUtils{
19 | 	public static void initializeDriver() {
20 | 		String browser=DriverUtils.getProperties().getProperty("browser").toLowerCase();
21 | 		WebDriver driver=null;
22 | 
23 | 		switch (browser){
24 | 			case "chrome" :
25 | 				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "driver" + File.separator + "chrome" + File.separator + "chromedriver.exe");
26 | 				
27 | 				//WebdriversSession logic here to implementt driver according to capablities needed
28 | 				
29 | 				driver=new ChromeDriver();
30 | 				driver.manage().window().maximize();
31 | 				break;
32 | 
33 | 			case "ie" :
34 | 				break;
35 | 				
36 | 			case "remote" :
37 | 				
38 | 				//can use grid or other tools eg: Browserstack,
39 | 				break;
40 | 				
41 | 		}
42 | 		
43 | 		DriverUtils.setDriver(driver);
44 | 	}
45 | 	
46 | 	public static void loadProperties() {
47 | 		try {
48 | 			InputStream input = Files.newInputStream(Paths.get(System.getProperty("user.dir") + "/src/test/resource/config.properties"));
49 |             Properties prop = new Properties();
50 |             prop.load(input);
51 |             DriverUtils.setProperties(prop);
52 | 			input.close();
53 |         } catch (IOException ex) {
54 |             ex.printStackTrace();
55 |         }
56 | 	}
57 | 	
58 | 	public static void initializeData() {
59 | 		String scenarioName = DriverUtils.getScenario().getName();
60 | 		String featureName = DriverUtils.getScenario().getId().split(":")[1];
61 | 	
62 | 		String testDataFileName = featureName.replace("Test","Data").replace("feature","json");
63 | 		String env = DriverUtils.getProperties().getProperty("env");
64 | 		System.out.println("Env: "+ env);
65 | 		try {
66 | 			JSONParser parser = new JSONParser();
67 | 			JSONObject pageData = (JSONObject) parser.parse(new FileReader(System.getProperty("user.dir")+ File.separator + "src" + File.separator +"test" + File.separator + "resource" + File.separator + "testData" + File.separator + env + File.separator + testDataFileName));
68 | 			DriverUtils.setPageData((JSONObject) pageData.get(scenarioName));
69 | 		} catch (ParseException | IOException e) {
70 | 			System.out.println("Error: Could not initialize test data file");
71 | 			e.printStackTrace();
72 | 		}
73 | 	}
74 | 
75 | 
76 | }
77 | 


--------------------------------------------------------------------------------
/src/main/java/org/mks/applicationUtils/Reporting.java:
--------------------------------------------------------------------------------
 1 | package org.mks.applicationUtils;
 2 | 
 3 | import org.mks.runInitilization.DriverUtils;
 4 | import org.openqa.selenium.OutputType;
 5 | import org.openqa.selenium.TakesScreenshot;
 6 | import org.openqa.selenium.WebDriverException;
 7 | import org.testng.Assert;
 8 | import org.testng.asserts.SoftAssert;
 9 | 
10 | public class Reporting {
11 | 
12 |     public static void addStepLog(String message){
13 |         DriverUtils.getScenario().write(message);
14 |     }
15 | 
16 |     public static void addStepScreenShot(String message){
17 |         takeScreenShot(message);
18 |     }
19 | 
20 |     public static void addHardStep(String message,Status status){
21 |         if(status == Status.FAIL){
22 |             DriverUtils.getScenario().write(message);
23 |             Assert.fail();
24 |         } else if (status == Status.PASS) {
25 |             DriverUtils.getScenario().write(message);
26 |             Assert.assertTrue(true);
27 |         } else if (status == Status.INFO) {
28 |             DriverUtils.getScenario().write(message);
29 |         }
30 |     }
31 | 
32 |     public static void addHardStepWithScreenShot(String message,Status status){
33 |         if(status == Status.FAIL){
34 |             takeScreenShot(message);
35 |             Assert.fail();
36 |         } else if (status == Status.PASS) {
37 |             takeScreenShot(message);
38 |             Assert.assertTrue(true);
39 |         } else if (status == Status.INFO) {
40 |             takeScreenShot(message);
41 |             DriverUtils.getScenario().write(message);
42 |         }
43 |     }
44 | 
45 |     public static void addSoftStep(String message,Status status){
46 |         SoftAssert softAssert = new SoftAssert();
47 |         if(status == Status.FAIL){
48 |             DriverUtils.getScenario().write(message);
49 |             softAssert.fail();
50 |         } else if (status == Status.PASS) {
51 |             DriverUtils.getScenario().write(message);
52 |             softAssert.assertTrue(true);
53 |         } else if (status == Status.INFO) {
54 |             DriverUtils.getScenario().write(message);
55 |         }
56 |     }
57 | 
58 |     public static void addSoftStepWithScreenShot(String message,Status status){
59 |         SoftAssert softAssert = new SoftAssert();
60 |         if(status == Status.FAIL){
61 |             takeScreenShot();
62 |             softAssert.fail();
63 |         } else if (status == Status.PASS) {
64 |             takeScreenShot(message);
65 |             softAssert.assertTrue(true);
66 |         } else if (status == Status.INFO) {
67 |             takeScreenShot(message);
68 |         }
69 |     }
70 | 
71 |     private static void takeScreenShot(){
72 |         try {
73 |             byte[] screenshot = ((TakesScreenshot) DriverUtils.getDriver()).getScreenshotAs(OutputType.BYTES);
74 |             DriverUtils.getScenario().embed(screenshot, "image/png");
75 |         } catch (WebDriverException somePlatformsDontSupportScreenshots) {
76 |             System.err.println(somePlatformsDontSupportScreenshots.getMessage());
77 |         }
78 |     }
79 | 
80 |     private static void takeScreenShot(String name){
81 |         try {
82 |             byte[] screenshot = ((TakesScreenshot) DriverUtils.getDriver()).getScreenshotAs(OutputType.BYTES);
83 |             DriverUtils.getScenario().embed(screenshot, "image/png",name);
84 |         } catch (WebDriverException somePlatformsDontSupportScreenshots) {
85 |             System.err.println(somePlatformsDontSupportScreenshots.getMessage());
86 |         }
87 |     }
88 | 
89 | }
90 | 


--------------------------------------------------------------------------------
/src/main/java/org/mks/applicationUtils/Status.java:
--------------------------------------------------------------------------------
1 | package org.mks.applicationUtils;
2 | 
3 | public enum Status {
4 |     FAIL,
5 |     PASS,
6 |     INFO
7 | }
8 | 


--------------------------------------------------------------------------------
/src/main/java/org/mks/applicationUtils/WebDriverSession.java:
--------------------------------------------------------------------------------
1 | package org.mks.applicationUtils;
2 | 
3 | public class WebDriverSession {
4 | 
5 | }
6 | 


--------------------------------------------------------------------------------
/src/main/java/org/mks/pageObjects/AssignmentPageObjects.java:
--------------------------------------------------------------------------------
 1 | package org.mks.pageObjects;
 2 | 
 3 | public class AssignmentPageObjects {
 4 | 	public static String login_link = "//a[text()='Log in']";
 5 | 	public static String email_textbox = "//input[@id='Email']";
 6 | 	public static String password_textbox = "//input[@id='Password']";
 7 | 	public static String login_button = "//input[@value='Log in']";
 8 | 	public static String accountId = "(//a[@class='account'])[1]";
 9 | 	public static String ShoppingCart_link = "//span[text()='Shopping cart']";
10 | 
11 | 	public static String ShoppingCart_itemcount_link = "//span[text()='Shopping cart']/ancestor::a/span[2]";
12 | 
13 | 	public static String remove_checkbox = "//input[@name='removefromcart']";
14 | 	public static String updateShoppingCartbutton = "//input[@value='Update shopping cart']";
15 | 	public static String ShoppingCartEmptyMessage = "//*[contains(text(),'Your Shopping Cart')]";
16 | 	public static String computers_link = "//a[contains(text(),'Computers')]";
17 | 	public static String desktop = "//a[contains(text(),'Desktop')]";
18 | 	public static String desktopType = "//a[contains(text(),'Build your own cheap')]";
19 | 	public static String quantity_texbox = "//input[@id='addtocart_72_EnteredQuantity']";
20 | 	public static String addToCartButton = "//input[@id='add-to-cart-button-72']";
21 | 	public static String barNotification = "//div[@id='bar-notification']";
22 | 	public static String checkoutprice = "//td[@class='product']//following::td[1]/span[2]";
23 | 	public static String subTotal = "//span[@class='product-price']";
24 | 	public static String termsCheckbox = "//input[@id='termsofservice']";
25 | 	public static String checkoutButton = "//button[@id='checkout']";
26 | 	public static String billingAddressDropdown = "//select[@id='billing-address-select']";
27 | 	public static String billingAddressText = "//label[contains(text(),'billing')]";
28 | 	public static String continueButton = "(//input[@value='Continue'])[1]";
29 | 	public static String pickupCheckbox = "//input[@id='PickUpInStore']";
30 | 	public static String continueButton1 = "(//input[@value='Continue'])[2]";
31 | 	public static String continueButton2 = "(//input[@value='Continue'])[4]";
32 | 	public static String continueButton3 = "(//input[@value='Continue'])[5]";
33 | 	public static String codMessage = "//p[text()='You will pay by COD']";
34 | 	public static String confirmButton = "//input[@value='Confirm']";
35 | 	public static String orderPlacedMessage = "//Strong[text()='Your order has been successfully processed!']";
36 | 	public static String orderNumberMessage = "//li[contains(text(),'Order')]";
37 | 	public static String logout = "//a[text()='Log out']";
38 | 
39 | }
40 | 


--------------------------------------------------------------------------------
/src/main/java/org/mks/runInitilization/DriverUtils.java:
--------------------------------------------------------------------------------
 1 | package org.mks.runInitilization;
 2 | 
 3 | 
 4 | import java.util.Properties;
 5 | 
 6 | import io.cucumber.core.api.Scenario;
 7 | import org.json.simple.JSONObject;
 8 | import org.openqa.selenium.WebDriver;
 9 | 
10 | public class DriverUtils {
11 | 	private static ThreadLocal<WebDriver> driver;
12 | 	private static ThreadLocal<Properties> properties;
13 | 	private static ThreadLocal<JSONObject> pageData;
14 | 	private static ThreadLocal<Scenario> scenario;
15 | 
16 | 	public static Scenario getScenario() {
17 | 		return scenario.get();
18 | 	}
19 | 
20 | 	public static void setScenario(Scenario value) {
21 | 		scenario = new ThreadLocal<>();
22 | 		DriverUtils.scenario.set(value);
23 | 	}
24 | 
25 | 	public static WebDriver getDriver() {
26 | 		return driver.get();
27 | 	}
28 | 
29 | 	public static void setDriver(WebDriver value) {
30 | 		driver = new ThreadLocal<>();
31 | 		DriverUtils.driver.set(value);
32 | 	}
33 | 	public static Properties getProperties() {
34 | 		return properties.get();
35 | 	}
36 | 
37 | 	public static void setProperties(Properties value) {
38 | 		properties = new ThreadLocal<>();
39 | 		properties.set(value);
40 | 	}
41 | 
42 | 	public static JSONObject getPageData() {
43 | 		return pageData.get();
44 | 	}
45 | 
46 | 	public static void setPageData(JSONObject value) {
47 | 		pageData = new ThreadLocal<>();
48 | 		pageData.set(value);
49 | 	}
50 | 
51 | }
52 | 


--------------------------------------------------------------------------------
/src/main/java/org/mks/runInitilization/Hooks.java:
--------------------------------------------------------------------------------
 1 | package org.mks.runInitilization;
 2 | 
 3 | import java.io.File;
 4 | import java.util.ArrayList;
 5 | import java.util.Calendar;
 6 | import java.util.List;
 7 | 
 8 | import io.cucumber.core.api.Scenario;
 9 | import io.cucumber.java.After;
10 | import io.cucumber.java.Before;
11 | import net.masterthought.cucumber.Configuration;
12 | import net.masterthought.cucumber.ReportBuilder;
13 | import org.json.simple.parser.ParseException;
14 | import org.mks.applicationUtils.ProjectUtils;
15 | 
16 | public class Hooks{
17 | 	public static boolean isLocalReportRun=false;
18 | 	
19 | 	@Before(order = 0)
20 | 	public void beforeAll() {
21 | 		if(isLocalReportRun){
22 | 			Runtime.getRuntime().addShutdownHook(new Thread(()->{
23 | 				Calendar date=Calendar.getInstance();
24 | 				String reportFolder=date.get(Calendar.DAY_OF_MONTH)+"_"+date.get(Calendar.MONTH)+"_"+date.get(Calendar.HOUR)+"_"+date.get(Calendar.MINUTE)+"_"+date.get(Calendar.SECOND);
25 | 				File outputDirectory=new File(System.getProperty("user.dir")+"/reports/"+reportFolder);
26 | 				if(!outputDirectory.exists())
27 | 					outputDirectory.mkdir();
28 | 				List<String> jsonFiles=new ArrayList<>();
29 | 				jsonFiles.add(System.getProperty("user.dir")+"/target/cucumber.json");
30 | 				Configuration config=new Configuration(outputDirectory, "bdd_cucumber");
31 | 				ReportBuilder builder=new ReportBuilder(jsonFiles, config);
32 | 				builder.generateReports();
33 | 			}));
34 | 			isLocalReportRun=false;
35 | 		}	
36 | 	}
37 | 	
38 | 	@Before(order = 0)
39 | 	public void beforeScenario(Scenario scenario) {
40 | 		DriverUtils.setScenario(scenario);
41 | 		ProjectUtils.loadProperties();
42 | 		ProjectUtils.initializeData();
43 | 		ProjectUtils.initializeDriver();
44 | 	}
45 | 	
46 | 	@After
47 | 	public void AfterScenario() {
48 | 		System.out.println("closing driver");
49 | 		if(DriverUtils.getDriver()!=null){
50 | 			DriverUtils.getDriver().quit();
51 | 		}
52 | 	}
53 | 	
54 | }
55 | 


--------------------------------------------------------------------------------
/src/main/java/org/mks/runner/runner.java:
--------------------------------------------------------------------------------
 1 | package org.mks.runner;
 2 | 
 3 | import java.util.List;
 4 | 
 5 | import org.junit.runner.RunWith;
 6 | import org.mks.runInitilization.Hooks;
 7 | import io.cucumber.core.cli.Main;
 8 | 
 9 | public class runner
10 | {
11 | 	public static void runTest(){
12 | 		String tags="@planitassignment";
13 | 		
14 | 		String features=System.getProperty("user.dir")+"/src/test/resource/features/";
15 | 		String stepdef="classpath:org/mks/stepDef";
16 | 		String hooks="classpath:org/mks/runInitilization";
17 | 
18 | 		Main.main(new String[]{features,"-g", stepdef,"-g",hooks,
19 | 				 "-p","html:target/cucumber-reports","-p","json:target/cucumber.json",
20 | 				 "-t",tags});
21 |     }
22 | 	
23 |     public static void main(String[] args)
24 |     {
25 |     	// JenkinsRun / local
26 |     	String run_mode="";
27 |     	if(args.length>0)
28 |     		run_mode=args[0];
29 | 
30 |     	if(!run_mode.equals("JenkinsRun")){
31 |     		Hooks.isLocalReportRun=true;
32 |     		runTest();
33 |     	}else{
34 |     		runTest();
35 |     	}
36 |     }
37 | }
38 | 


--------------------------------------------------------------------------------
/src/main/java/org/mks/stepDef/AssignmentStepDef.java:
--------------------------------------------------------------------------------
  1 | package org.mks.stepDef;
  2 | 
  3 | import io.cucumber.java.en.Given;
  4 | import io.cucumber.java.en.Then;
  5 | import io.cucumber.java.en.When;
  6 | import org.mks.actions.AssignmentActions;
  7 | 
  8 | public class AssignmentStepDef {
  9 | 	@Given("^Navigate to the URL
quot;)
 10 | 	public void navigate_to_URL() throws InterruptedException {
 11 | 		AssignmentActions assignmentActions = new AssignmentActions();
 12 | 		assignmentActions.openURL();
 13 | 	}
 14 | 
 15 | 	@When("User Click on login button")
 16 | 	public void user_Click_on_login_button() {
 17 | 		AssignmentActions assignmentActions = new AssignmentActions();
 18 | 		assignmentActions.clickButton();
 19 | 	}
 20 | 
 21 | 	@When("User login with credentials")
 22 | 	public void user_login_with_credentials() {
 23 | 		AssignmentActions assignmentActions = new AssignmentActions();
 24 | 		assignmentActions.loginByCredentials();
 25 | 	}
 26 | 
 27 | 	@Then("validate the user account id")
 28 | 	public void validate_the_user_account_id() {
 29 | 		AssignmentActions assignmentActions = new AssignmentActions();
 30 | 		assignmentActions.validateAccountId();
 31 | 	}
 32 | 	
 33 | 	@Then("User clear shoppingcart")
 34 | 	public void user_clear_shoppingcart() {
 35 | 		AssignmentActions assignmentActions = new AssignmentActions();
 36 | 		assignmentActions.clearShoppingCart();
 37 | 	}
 38 | 	
 39 | 	@When("mousehover on the given category")
 40 | 	public void mousehover_on_the_category() {
 41 | 		AssignmentActions assignmentActions = new AssignmentActions();
 42 | 		assignmentActions.mouseHover();
 43 | 	}
 44 | 
 45 | 	@When("User selects a computer from the list")
 46 | 	public void user_selects_a_computer_from_the_list() {
 47 | 		AssignmentActions assignmentActions = new AssignmentActions();
 48 | 		assignmentActions.selectProduct();
 49 | 	}
 50 | 
 51 | 	@When("User enters quantity of product")
 52 | 	public void user_enters_quantity_of_product() throws InterruptedException {
 53 | 		AssignmentActions assignmentActions = new AssignmentActions();
 54 | 		assignmentActions.selectQuantity();
 55 | 	}
 56 | 	
 57 | 
 58 | 	@When("User get the price details")
 59 | 	public void user_get_the_price_details() {
 60 | 		AssignmentActions assignmentActions = new AssignmentActions();
 61 | 		assignmentActions.getPriceDetails();
 62 | 	}
 63 | 
 64 | 	@When("User click on Add to cart")
 65 | 	public void user_click_on_Add_to_cart() throws InterruptedException {
 66 | 		AssignmentActions assignmentActions = new AssignmentActions();
 67 | 		assignmentActions.clickOnAddToCart();
 68 | 	}
 69 | 
 70 | 	@Then("validate the success message of product has been added")
 71 | 	public void validate_the_success_message_of_product_has_been_added() {
 72 | 		AssignmentActions assignmentActions = new AssignmentActions();
 73 | 		assignmentActions.validateMessageForProductsAddition();
 74 | 	}
 75 | 
 76 | 	@Then("validate subTotal price")
 77 | 	public void validate_subTotal_price() {
 78 | 		AssignmentActions assignmentActions = new AssignmentActions();
 79 | 		assignmentActions.validateSubTotalPrice();
 80 | 	}
 81 | 
 82 | 	@When("User clicks on checkout")
 83 | 	public void user_clicks_on_checkout() {
 84 | 		AssignmentActions assignmentActions = new AssignmentActions();
 85 | 		assignmentActions.click_CheckOut();
 86 | 	}
 87 | 
 88 | 	@Then("User select billing address")
 89 | 	public void user_select_billing_address() {
 90 | 		AssignmentActions assignmentActions = new AssignmentActions();
 91 | 		assignmentActions.selectBillingAddress();
 92 | 	}
 93 | 
 94 | 	@Then("User clicks on continue")
 95 | 	public void user_clicks_on_continue() {
 96 | 		AssignmentActions assignmentActions = new AssignmentActions();
 97 | 		assignmentActions.clickContinue();
 98 | 	}
 99 | 
100 | 	@Then("User selects the shipping address")
101 | 	public void user_selects_the_shipping_address() {
102 | 		AssignmentActions assignmentActions = new AssignmentActions();
103 | 		assignmentActions.selectShippingAddress();
104 | 	}
105 | 
106 | //	@Then("User selects shipping method")
107 | //	public void user_selects_shipping_method() {
108 | //		AssignmentActions assignmentActions = new AssignmentActions();
109 | //		assignmentActions.selectShippingMethod();
110 | //	}
111 | 
112 | 	@When("User choose the payment method as COD")
113 | 	public void user_choose_the_payment_method_as_COD() {
114 | 		AssignmentActions assignmentActions = new AssignmentActions();
115 | 		assignmentActions.selectPaymentMethod();
116 | 	}
117 | 
118 | 	@Then("user validate message for COD confirmation")
119 | 	public void user_validate_message_for_COD_confirmation() {
120 | 		AssignmentActions assignmentActions = new AssignmentActions();
121 | 		assignmentActions.validateMessageForCOD();
122 | 	}
123 | 
124 | 	@When("User clicks on confirm button")
125 | 	public void user_clicks_on_confirm_button() {
126 | 		AssignmentActions assignmentActions = new AssignmentActions();
127 | 		assignmentActions.clickOnConfirmButton();
128 | 	}
129 | 
130 | 	@Then("validate the message for successful order")
131 | 	public void validate_the_message_for_successful_order() {
132 | 		AssignmentActions assignmentActions = new AssignmentActions();
133 | 		assignmentActions.validateSuccessfulOrder();
134 | 	}
135 | 
136 | 	@Then("User logout from the application")
137 | 	public void user_logout_from_the_application() {
138 | 		AssignmentActions assignmentActions = new AssignmentActions();
139 | 		assignmentActions.logOut();
140 | 	}
141 | }
142 | 


--------------------------------------------------------------------------------
/src/main/java/org/mks/stepDef/GoogleSearchStepDef.java:
--------------------------------------------------------------------------------
 1 | package org.mks.stepDef;
 2 | 
 3 | 
 4 | import io.cucumber.java.en.Given;
 5 | import io.cucumber.java.en.Then;
 6 | import io.cucumber.java.en.When;
 7 | import org.mks.actions.GoogleSearchActions;
 8 | 
 9 | public class GoogleSearchStepDef {
10 | 	@Given("Google search engine is open")
11 | 	public void google_search_engine_is_open() {
12 | 		GoogleSearchActions actions = new GoogleSearchActions();
13 | 		actions.openGooglePage();
14 | 	}
15 | 
16 | 	@When("User search cars")
17 | 	public void user_search_cars() {
18 | 	    
19 | 	}
20 | 
21 | 	@Then("User navigated to serach result page")
22 | 	public void user_navigated_to_serach_result_page() {
23 | 
24 | 	}
25 | 
26 | 	@When("User click on news tab")
27 | 	public void user_click_on_news_tab() {
28 | 	    
29 | 	}
30 | 
31 | 	@Then("User navigated to news portal")
32 | 	public void user_navigated_to_news_portal() {
33 | 	    
34 | 	}
35 | 
36 | 
37 | }


--------------------------------------------------------------------------------
/src/test/resource/config.properties:
--------------------------------------------------------------------------------
1 | browser: Chrome
2 | env: stage1


--------------------------------------------------------------------------------
/src/test/resource/features/AssignmentTest.feature:
--------------------------------------------------------------------------------
 1 | Feature: Planit Assigmnet
 2 | 
 3 |   Background:
 4 |     Given Navigate to the URL
 5 |     When User Click on login button
 6 |     When User login with credentials
 7 | 
 8 |   @planitassignment
 9 |   Scenario: Automate Tricentis webpage
10 |     Then validate the user account id
11 |     Then User clear shoppingcart
12 |     When mousehover on the given category
13 |     And User selects a computer from the list
14 |     And User get the price details
15 |     And User enters quantity of product
16 |     When User click on Add to cart
17 |     Then validate the success message of product has been added
18 |     Then validate subTotal price 
19 |     When User clicks on checkout
20 |     Then User select billing address
21 |     And User clicks on continue
22 |     And User selects the shipping address
23 |     #And User clicks on continue
24 |     #And User selects shipping method
25 |     #And User clicks on continue
26 |     When User choose the payment method as COD
27 |     #And User clicks on continue
28 |     Then user validate message for COD confirmation
29 |     #And User clicks on continue
30 |     When User clicks on confirm button
31 |     Then validate the message for successful order
32 |     And User clicks on continue
33 |     Then User logout from the application
34 |     
35 |      
36 |     


--------------------------------------------------------------------------------
/src/test/resource/features/GoogleSearchTest.feature:
--------------------------------------------------------------------------------
 1 | Feature: some feature
 2 | 
 3 |   Background:
 4 |     Given Google search engine is open
 5 | 
 6 |   @regression
 7 |   @googlesearch
 8 |   Scenario: Search Car in Google
 9 |     When User search cars
10 |   #Then User navigated to serach result page
11 | 
12 |   Scenario: Search Car in Google
13 |     When User search cars
14 |   #Then User navigated to serach result page


--------------------------------------------------------------------------------
/src/test/resource/testData/stage1/AssignmentData.json:
--------------------------------------------------------------------------------
 1 | {
 2 |   "Automate Tricentis webpage": {
 3 |     "AssignmentActions": {
 4 | 
 5 |       "emailId" : "planittest78@gmail.com",
 6 |       "password" : "123456",
 7 |       "EmptyText" : "Your Shopping Cart is empty!",
 8 |       "desktopType" : "Build your own cheap",
 9 |       "quantity" : "2",
10 |       "PaymentMethod" : "Cash On Delivery",
11 |       "CODMessage" : "You will pay by COD",
12 |       "productAdditionSuccessMsg": "The product has been added to your shopping cart"
13 |     }
14 |   }
15 | }


--------------------------------------------------------------------------------
/src/test/resource/testData/stage1/GoogleSearchData.json:
--------------------------------------------------------------------------------
1 | {
2 |   "Search Car in Google": {
3 |     "GoogleSearchActions": {
4 |       "data1": "value1",
5 |       "data2": "value2"
6 |     }
7 |   }
8 | }


--------------------------------------------------------------------------------
