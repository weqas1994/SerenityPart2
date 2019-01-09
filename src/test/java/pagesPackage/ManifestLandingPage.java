package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;

public class ManifestLandingPage extends BaseClass {

	public ManifestLandingPage() {
		PageFactory.initElements(driver, this);

	}

	public static By ManifestTab = (By.xpath("//a[@href='/manifests']"));
	// -----^^^^^This is the Manifest Tab in the global header^^^---------2

	@FindBy(xpath = "//span[@class='cbpBrand']")
	public static WebElement CBPGlobalHeaderForTradePortal;
	public static By CBPGlobalHeaderForTradePortalBy = (By.xpath("//span[@class='cbpBrand']"));
	// -------^^^^^This is the header for U.S. Customs&Border^^^^^^^ --------------

	@FindBy(xpath = "//span[@class='cbpSubBrand']")
	public static WebElement USDepartmentOfHomelandSecurity;
	public static By USDepartmentOfHomelandSecurityBy = (By.xpath("//span[@class='cbpSubBrand']"));
	// ------------Header US Department of Homeland Security text under customs and
	// border

	// ------------These are elements withinToggle Search Manifest
	// ----------------------------------
	@FindBy(xpath = "//button[@class='btn btn-info']")
	public static WebElement ToggleSearchManifestButton;
	public static By ToggleSearchManifestButtonBy = (By.xpath("//button[@class='btn btn-info']"));
	// --------This is the button for Toggle Search Manifest it will display
	// -------^^^^^^^the left search table^^^^^^^---------------

	@FindBy(xpath = "//label[contains (text(), 'SCAC Manifest')]/preceding::select")
	public static WebElement SCACManifestSelect;
	public static By ScacManifestSelect = (By.xpath("//label[contains (text(), 'SCAC Manifest')]/preceding::select"));
	// ^^^^ this is the select button for Scac manifest under Toggle Search Manifest

	public static By edit = (By.xpath("//input[@value='Edit']"));
	// ^^ill find out what this is for

//	@FindBy(xpath = "//input[@id='im1']")
//	public static WebElement ManifestNumber;
//	public static By maniNumber = (By.xpath("//input[@id='im1']"));
//	public static WebElement manifestNumber = driver.findElement(By.xpath("//input[@id='im1']"));
	// ^^Manifest Number text box under Toggle Search Manifest

	@FindBy(xpath = "//label[contains(.,'Trip Status')]/preceding-sibling::select")
	public static WebElement tripStatus;
	public static By TripStatus = (By.xpath("//label[contains(.,'Trip Status')]/preceding-sibling::select"));
	// ^^Trip Status Select drop down under Toggle Search Manifest

	@FindBy(xpath = "/input[@name='portArrivalChoice' and @value='option1']")
	public static WebElement ManifestedRadioButtonPortOfArrival;
	By ManifestedRadioButtonPortOfArrivalBy = (By.xpath("/input[@name='portArrivalChoice' and @value='option1']"));
	// This is Manifested Radio Button next to Port of Arrival under Toggle Search
	// Manifest

	@FindBy(xpath = "/input[@name='portArrivalChoice' and @value='option1']")
	public static WebElement ActualRadioButtonPortOfArrival;
	By ActualRadioButtonPortOfArrivalBy = (By.xpath("/input[@name='portArrivalChoice' and @value='option2']"));
	// This is Actual Radio Button next to Port of Arrival under Toggle Search
	// Manifest

	@FindBy(xpath = "//input[@name='optionsRadios' and @value='option2']")
	public static WebElement ToActualRadioButton;
	public static By ToActualRadioButtonBy = (By.xpath("//input[@name='optionsRadios' and @value='option2']"));
	// This is next to the calendar "To" its the Actual Radio Button under Toggle
	// Search Manifest

	@FindBy(xpath = "//input[@name='optionsRadios' and @value='option1']")
	public static WebElement ToManifestedRadioButton;
	public static By ToManifestedRadioButtonBy = (By.xpath("//input[@name='optionsRadios' and @value='option1']"));
	// This is next to the calendar "To" its the Manifested Radio Button under
	// Toggle Search Manifest

	@FindBy(xpath = "//label[contains(.,'Port of Arrival')]/preceding-sibling::input")
	public static WebElement PortOfArrivalTextBox;
	public static By PortOfArrivalTextBoxBy = (By
			.xpath("//label[contains(.,'Port of Arrival')]/preceding-sibling::input"));
	// This is for Port of Arrival text box under Toggle Search Manifest

	@FindBy(xpath = "//label[contains(.,'First Name')]/preceding-sibling::input")
	public static WebElement FirstNameTextBox;
	public static By FirstNameTextBoxBy = (By.xpath("//label[contains(.,'First Name')]/preceding-sibling::input"));
	// This is the First Name Text Box under Toggle Search Manifest

	@FindBy(xpath = "//label[contains(.,'Last Name')]/preceding-sibling::input")
	public static WebElement LastNameTextbox;
	public static By LastNameTextboxBy = (By.xpath("//label[contains(.,'Last Name')]/preceding-sibling::input"));
	// This is the Last Name Text Box under Toggle Search Manifest

	@FindBy(xpath = "//label[contains(.,'FAST #')]/preceding-sibling::input")
	public static WebElement FastCardNumber;
	public static By FastCardNumberBy = (By.xpath("//label[contains(.,'FAST #')]/preceding-sibling::input"));
	// This is the Fast #5 Text Box under Toggle Search Manifest

	@FindBy(xpath = "//label[contains(.,'Vehicle #')]/preceding-sibling::input")
	public static WebElement VehicleTextbox;
	public static By VehicleTextboxBy = (By.xpath("//label[contains(.,'Vehicle #')]/preceding-sibling::input"));
	// -------^^^^^^This is a text box for Vehicle # under Toggle Search Manifest
	// ^^^^^^^---------

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public static WebElement SearchManifestsButton;
	public static By SearchManifestsButtonBy = (By.xpath("//button[@class='btn btn-primary']"));
	// -------^^^^^This is for Search Manifests Button^^^^^-------------

	// ^^^^^ These are elements withinToggle Search
	// Manifest^^^^-------------------------

	public static String getTitleOfCurrentPage() {
		return driver.getTitle();
	}
}
