package Pages;

import org.openqa.selenium.WebDriver;

public class EnterInsurantPage {
	
private DSL dsl;
	
	public EnterInsurantPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	public void setFirstName(String firstname) {
		dsl.write("firstname", firstname);
	}

	public void setLasttName(String lasttname) {
		dsl.write("lastname", lasttname);
	}
	
	public void setBirthDate(String birthdate) {
		dsl.write("birthdate", birthdate);
	}
	
	public void chooseGender(String gender) {
		dsl.clickRadio(gender);
	}
	
	public void setStreetAddress(String address) {
		dsl.write("streetaddress", address);
	}
	
	public void selectCountry(String country) {
		dsl.combo("country", country);
	}
	
	public void setZipCode(String zip) {
		dsl.write("zipcode", zip);
	}
	
	public void setCity(String city) {
		dsl.write("city", city);
	}
	
	public void selectOccupation(String occ) {
		dsl.combo("occupation", occ);
	}
	
	public void chooseHobbie(String hobbie) {
		dsl.clickRadio(hobbie);
	}
	
	public void setWebSite(String site) {
		dsl.write("website", site);
	}
	
	public String getFirstName() {
		return dsl.getValue("firstname");
	}
	
	public String getLastName() {
		return dsl.getValue("lastname");
	}
	
	public String getBirthdate() {
		return dsl.getValue("birthdate");
	}
	
	public String getAddress() {
		return dsl.getValue("streetaddress");
	}
	
	public String getCountry() {
		return dsl.valCombo("country");
	}
	
	public String getZipCode() {
		return dsl.getValue("zipcode");
	}
	
	public String getCity() {
		return dsl.getValue("city");
	}
	
	public String getOccupation() {
		return dsl.valCombo("occupation");
	}
	
	public String getSite() {
		return dsl.getValue("website");
	}
	
	public void next() {
		dsl.next("nextenterproductdata");
	}
}
