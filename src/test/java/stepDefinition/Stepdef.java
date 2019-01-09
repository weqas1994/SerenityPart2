package stepDefinition;



import basePackage.BaseClass;
import commonMethods.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pagesPackage.ManifestLandingPage;



public class Stepdef extends BaseClass{

	@Steps static CommonMethods methods;

	@Given("^I Open A Browser$")
	public static void i_Open_A_Browser() {
		methods.setUp();
	}

	
	@Given("^I go to Google$")
	public static void i_go_to_Google() {
		methods.clickMethodBy(ManifestLandingPage.ManifestTab);
	}

	@When("^I Input Text$")
	public static void i_Input_Text() {
		methods.selectMethodtextByVisableText(ManifestLandingPage.ScacManifestSelect, "Mexi");
	}

	@When("^some other action$")
	public static void some_other_action() {
		methods.selectMethodtextByVisableText(ManifestLandingPage.TripStatus, "Held");
	}

	@When("^yet another action$")
	public static void yet_another_action() {
	    
	}

	@Then("^I validate the outcomes$")
	public static void i_validate_the_outcomes() {
	   
	}
}
