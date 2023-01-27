package org.mks.stepDef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.mks.actions.GoogleSearchActions;

public class GoogleSearchStepDef {
	@Given("Google search engine is open")
	public void google_search_engine_is_open() {
		GoogleSearchActions actions = new GoogleSearchActions();
		actions.openGooglePage();
	}

	@When("User search cars")
	public void user_search_cars() {
	    
	}

	@Then("User navigated to serach result page")
	public void user_navigated_to_serach_result_page() {

	}

	@When("User click on news tab")
	public void user_click_on_news_tab() {
	    
	}

	@Then("User navigated to news portal")
	public void user_navigated_to_news_portal() {
	    
	}


}