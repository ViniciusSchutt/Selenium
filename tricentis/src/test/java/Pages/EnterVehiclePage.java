package Pages;

import org.openqa.selenium.WebDriver;

public class EnterVehiclePage {
	
	private DSL dsl;
	
	public EnterVehiclePage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	public void selectMake(String make) {
		dsl.combo("make", make);
	}
	
	public void setEngine(String engine) {
		dsl.write("engineperformance", engine);
	}
	
	public void setDateOfManufacture(String dateofmanu) {
		dsl.write("dateofmanufacture", dateofmanu);
	}
	
	public void selectNumberOfSeats(String seats) {
		dsl.combo("numberofseats", seats);
	}
	
	public void selectFuel(String fuel) {
		dsl.combo("fuel", fuel);
	}
	
	public void setListPrice(String price) {
		dsl.write("listprice", price);
	}
	
	public void setPlateNumber(String plate) {
		dsl.write("licenseplatenumber", plate);
	}
	
	public void setAnnualMileage(String mileage) {
		dsl.write("annualmileage", mileage);
	}
	
	public String getMake() {
		return dsl.valCombo("make");
	}
	
	public String getEngine() {
		return dsl.getValue("engineperformance");
	}
	
	public String getDate() {
		return dsl.getValue("dateofmanufacture");
	}
	
	public String getSeats() {
		return dsl.valCombo("numberofseats");
	}
	
	public String getGas() {
		return dsl.valCombo("fuel");
	}
	
	public String getListPrice() {
		return dsl.getValue("listprice");
	}
	
	public String getPlaneNumber() {
		return dsl.getValue("licenseplatenumber");
	}
	
	public String getMileage() {
		return dsl.getValue("annualmileage");
	}
	
	public void next() {
		dsl.next("nextenterinsurantdata");
	}
	
	
	
}
