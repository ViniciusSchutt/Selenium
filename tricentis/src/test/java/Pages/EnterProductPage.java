package Pages;

import org.openqa.selenium.WebDriver;

public class EnterProductPage {

private DSL dsl;
	
	public EnterProductPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	public void setStartDate(String startdate) {
		dsl.write("startdate", startdate);
	}
	
	public void selectInsuranceSum(String insum) {
		dsl.combo("insurancesum", insum);
	}
	
	public void selectMeritRating(String merit) {
		dsl.combo("meritrating", merit);
	}
	
	public void selectDamageInsurance(String damage) {
		dsl.combo("damageinsurance", damage);
	}
	
	public void chooseProtection(String protection) {
		dsl.clickRadio(protection);
	}
	
	public void selectCourtesycar(String courtesy) {
		dsl.combo("courtesycar", courtesy);
	}
	
	public String getStartDate() {
		return dsl.getValue("startdate");
	}
	
	public String getInsuranceSum() {
		return dsl.valCombo("insurancesum");
	}
	
	public String getMeritRating() {
		return dsl.valCombo("meritrating");
	}
	
	public String getDamageInsurance() {
		return dsl.valCombo("damageinsurance");
	}
	
	public String getCourtesyCar() {
		return dsl.valCombo("courtesycar");
	}
	
	public void next() {
		dsl.next("nextselectpriceoption");
	}
}
