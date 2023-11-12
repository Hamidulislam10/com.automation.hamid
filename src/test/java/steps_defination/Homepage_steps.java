package steps_defination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.Homepage;

public class Homepage_steps {
	
	Homepage page = new Homepage();
	
	@Given("user launch the URL")
	public void user_launch_the_url() {
		page.user_launch_the_url();
	}

	@And("user click on table data")
	public void user_click_on_table_data() {
	    page.user_click_on_table_data();
	}

	@And("user update the input text box with new data")
	public void user_update_the_input_text_box_with_new_data() {
	    page.user_update_the_input_text_box_with_new_data();
	}

	@And("user click on refresh table button")
	public void user_click_on_refresh_table_button() {
		page.user_click_on_refresh_table_button();
	     
	}

	@Then("data table is update as per expectation")
	public void data_table_is_update_as_per_expectation() {
		page.data_table_is_update_as_per_expectation();
	    
	}

}
