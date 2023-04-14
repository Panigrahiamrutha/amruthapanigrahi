
package testScripts;



import org.junit.Assert;

import Pages.LandinPage;
import Pages.PlaceOrderPage;
import Pages.checkoutPage;
import Pages.itemsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
  //private WebDriver driver

 
public class orderBiryanistepdef  {
	@Given("a user is on the home of Swiggy")
	public void a_user_is_on_the_home_of_swiggy() {
		Assert.assertTrue(Driverclass.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));    
	}

	@Given("he Enters location as {string}")
	public void he_enters_location_as(String string) {
	    LandinPage landinPage = new LandinPage(null);
		// Write code here that turns the phrase above into concrete actions
		landinPage.enterLocation(string);
	}
	

	@When("he selects first location from suggested location in suggestion-box")
	public void he_selects_first_location_from_suggested_location_in_suggestion_box() {
		LandinPage landinPage = new LandinPage(null);
		landinPage.selectLocation(); 
		
	}

	
	@When("he redirects to ItemPage")
	public void he_redirects_to_item_page() {
		
	System.out.println("test casse"); 
		
	    
	}

	@When("he hover over search icon")
	public void he_hover_over_search_icon() {
		itemsPage itemsPage = new itemsPage(null);
		itemsPage.hoverOverSerch();
	}

	@When("He Enters Item as {string}")
	public void he_enters_item_as(String string) {
		
	    itemsPage itemsPage = new itemsPage(null);
		itemsPage.enterItem(string);
		itemsPage.searchItem();
	}

	@When("he select first suggested Item in pizza cateogory")
	public void he_select_first_suggested_item_in_pizza_cateogory() {
		itemsPage itemsPage = new itemsPage(null);
		itemsPage.selectFirstItem();
	}

	@When("he searchs resturant and select first restaurant")
	public void he_searchs_resturant_and_select_first_restaurant() {
		PlaceOrderPage placeOrderPage = new PlaceOrderPage(null);
		placeOrderPage.addItem();
	}

	@When("he redirects to orderPage")
	public void he_redirects_to_order_page() {
		PlaceOrderPage placeOrderPage = new PlaceOrderPage(null);
		placeOrderPage.continueorder();
	}

	@When("he adds first item to cart")
	public void he_adds_first_item_to_cart() {
		PlaceOrderPage placeOrderPage = new PlaceOrderPage(null);
		placeOrderPage.moveToCart();
	}

	@When("he click on checkout button")
	public void he_click_on_checkout_button() {
		PlaceOrderPage placeOrderPage = new PlaceOrderPage(null);
		placeOrderPage.checkoutAction();
	    
	}

	@Then("he should be able to order a pizza suscessfully")
	public void he_should_be_able_to_order_a_pizza_suscessfully() {
		String expectedErrMsg = "SECURE CHECKOUT";
		String actualErrMsg = new String();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
	    
	}
	
	

}


