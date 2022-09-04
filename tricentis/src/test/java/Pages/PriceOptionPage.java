package Pages;

import org.openqa.selenium.WebDriver;

public class PriceOptionPage {

private DSL dsl;
	
	public PriceOptionPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	public void choosePriceOption(String option) {
		dsl.clickRadio(option);
	}
	
	public void next() {
		dsl.next("nextsendquote");
	}
}
