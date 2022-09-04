package tricentis;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import Pages.DSL;
import Pages.EnterVehiclePage;
import Pages.EnterInsurantPage;
import Pages.EnterProductPage;
import Pages.PriceOptionPage;
import Pages.SendQuotePage;

public class DesafioAccenture {
	String url;
	private WebDriver driver;
	private DSL g;
	private EnterVehiclePage vehiclePage;
	private EnterInsurantPage insurantPage;
	private EnterProductPage productPage;
	private PriceOptionPage pricePage;
	private SendQuotePage quotePage;
	
	@Before
	public void start() {
		url = "http://sampleapp.tricentis.com/101/app.php";
		System.setProperty("webdriver.chrome.driver", "/Users/viniciusalmeida/Documents/webdrivers/chrome/101/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		g = new DSL(driver);
		vehiclePage = new EnterVehiclePage(driver);
		insurantPage = new EnterInsurantPage(driver);
		productPage = new EnterProductPage(driver);
		pricePage = new PriceOptionPage(driver);
		quotePage = new SendQuotePage(driver);
	}
	
	@After
	public void close() {
		driver.quit();
	}
	
	@Given("^the user access Tricentis SampleApp web page and click in the 'Automobile' option$")
	public void the_user_access_Tricentis_SampleApp_web_page_and_is_in_the_Enter_Vehicle_Data_tab() throws Throwable {
	    driver.get(url);
	    g.goToAutoMobile("nav_automobile");
	}
	
	@Given("^fill the form on tab 'Enter Vehicle Data' and press 'Next'$")
	public void fill_the_form_on_tab_Enter_Vehicle_Data_and_press_Next() throws Throwable {
	
		Assert.assertEquals(true, g.isDisplayed("make"));
		
		vehiclePage.selectMake("Audi");
		Assert.assertEquals("Audi", vehiclePage.getMake());
		
		vehiclePage.setEngine("100");
		Assert.assertEquals("100", vehiclePage.getEngine());
		
		vehiclePage.setDateOfManufacture("02/05/2000");
		Assert.assertEquals("02/05/2000", vehiclePage.getDate());
		
		vehiclePage.selectNumberOfSeats("4");
		Assert.assertEquals("4", vehiclePage.getSeats());
		
		vehiclePage.selectFuel("Gas");
		Assert.assertEquals("Gas", vehiclePage.getGas());
		
		vehiclePage.setListPrice("50000");
		Assert.assertEquals("50000", vehiclePage.getListPrice());
	
		vehiclePage.setPlateNumber("PLN1234");
		Assert.assertEquals("PLN1234", vehiclePage.getPlaneNumber());
		
		vehiclePage.setAnnualMileage("10000");
		Assert.assertEquals("10000", vehiclePage.getMileage());
		
		vehiclePage.next();
	}

	@Given("^fill the form on tab 'Enter Insurant Data' and press 'Next'$")
	public void fill_the_form_on_tab_Enter_Insurant_Data_and_press_Next() throws Throwable {
		
		Assert.assertEquals(true, g.isDisplayed("firstname"));
		
		insurantPage.setFirstName("Vinicius");
		Assert.assertEquals("Vinicius", insurantPage.getFirstName());
		
		insurantPage.setLasttName("Schutt");
		Assert.assertEquals("Schutt", insurantPage.getLastName());
		
		insurantPage.setBirthDate("05/02/1992");
		Assert.assertEquals("05/02/1992", insurantPage.getBirthdate());

		insurantPage.chooseGender("//*[text()='Male']");
		Assert.assertEquals(true, g.isSelected("gendermale"));
		
		insurantPage.setStreetAddress("Rua Alexandre Dumas 2051");
		Assert.assertEquals("Rua Alexandre Dumas 2051", insurantPage.getAddress());
		
		insurantPage.selectCountry("Brazil");
		Assert.assertEquals("Brazil", insurantPage.getCountry());
		
		insurantPage.setZipCode("18305005");
		Assert.assertEquals("18305005", insurantPage.getZipCode());
		
		insurantPage.setCity("Itapetininga");
		Assert.assertEquals("Itapetininga", insurantPage.getCity());
		
		insurantPage.selectOccupation("Employee");
		Assert.assertEquals("Employee", insurantPage.getOccupation());
		
		insurantPage.chooseHobbie("//*[text()=' Bungee Jumping']");
		Assert.assertEquals(true, g.isSelected("bungeejumping"));
		
		insurantPage.setWebSite("https://github.com/ViniciusSchutt");
		Assert.assertEquals("https://github.com/ViniciusSchutt", insurantPage.getSite());
		
		insurantPage.next();
	}

	@Given("^fill the form on tab 'Enter Product Data' and press 'Next'$")
	public void fill_the_form_on_tab_Enter_Product_Data_and_press_Next() throws Throwable {
		
		Assert.assertEquals(true, g.isDisplayed("startdate"));
		
		productPage.setStartDate("06/27/2022");
		Assert.assertEquals("06/27/2022", productPage.getStartDate());
		
		productPage.selectInsuranceSum("5000000");
		Assert.assertEquals("5.000.000,00", productPage.getInsuranceSum());
		
		productPage.selectMeritRating("Bonus 8");
		Assert.assertEquals("Bonus 8", productPage.getMeritRating());
		
		productPage.selectDamageInsurance("Partial Coverage");
		Assert.assertEquals("Partial Coverage", productPage.getDamageInsurance());
		
		productPage.chooseProtection("//*[text()='Euro Protection']");
		Assert.assertEquals(true, g.isSelected("EuroProtection"));
		
		productPage.selectCourtesycar("Yes");
		Assert.assertEquals("Yes", productPage.getCourtesyCar());
		
		productPage.next();
	}

	@Given("^fill the form on tab 'Select Price Option' and press 'Next'$")
	public void fill_the_form_on_tab_Select_Price_Option_and_press_Next() throws Throwable {
		
		pricePage.choosePriceOption("//th[@colspan='4']");
		Assert.assertEquals(true, g.isSelected("selectplatinum"));
		
		pricePage.next();
	}
	
	@When("^he fills the form on tab 'Send Quote' and press 'Send'$")
	public void he_fills_the_form_on_tab_Send_Quote_and_press_Send() throws Throwable {
		
		Assert.assertEquals(true, g.isDisplayed("email"));
		
		quotePage.setEmail("viniciuschutt@gmail.com");
		Assert.assertEquals("viniciuschutt@gmail.com", quotePage.getEmail());
		
		quotePage.setPhone("15996140870");
		Assert.assertEquals("15996140870", quotePage.getPhone());
		
		quotePage.setUserName("vschutt");
		Assert.assertEquals("vschutt", quotePage.getUsername());
		
		quotePage.setPassword("1Chance!");
		Assert.assertEquals("1Chance!", quotePage.getPassword());
		
		quotePage.confirmPassword("1Chance!");
		Assert.assertEquals("1Chance!", quotePage.getPswdConfirm());
		
		quotePage.sendComments("Agradeço a oportunidade!");
		Assert.assertEquals("Agradeço a oportunidade!", quotePage.getComments());
		
		quotePage.next();
	}

	@Then("^the message 'Sending e-mail success!' should appear on screen$")
	public void the_message_Sending_e_mail_success_should_appear_on_screen() throws Throwable {
		
		g.successMessageDisplayed("//h2");
		Assert.assertEquals("Sending e-mail success!", g.verifyMensage("//h2"));
		g.ok("confirm");
	}

}
