package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {

	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}
	
	public void goToAutoMobile(String id_campo) {
		driver.findElement(By.id(id_campo)).click();
	}
	
	public boolean isDisplayed(String id) {
		return driver.findElement(By.id(id)).isDisplayed();
	}
	
	public void write(String id_campo, String valor) {
		driver.findElement(By.id(id_campo)).sendKeys(valor);
	}
	
	public void combo(String id, String valor) {
		WebElement combo = driver.findElement(By.id(id));
		Select comboButton = new Select(combo);
		comboButton.selectByValue(valor);
	}
	
	public String valCombo(String id) {
		WebElement vcombo = driver.findElement(By.id(id));
		Select vcomboButton = new Select(vcombo);
		return vcomboButton.getFirstSelectedOption().getText();
	}
	
	public String getValue(String id_campo) {
		return driver.findElement(By.id(id_campo)).getAttribute("value");
	}
	
	public void next(String id_campo) {
		driver.findElement(By.id(id_campo)).click();
	}
	
	public void clickRadio(String xpath_radio) {
		driver.findElement(By.xpath(xpath_radio)).click();
	}
	
	public boolean isSelected(String id_radio) {
		return driver.findElement(By.id(id_radio)).isSelected();
	}
	
	public boolean successMessageDisplayed(String xpath) {
		return driver.findElement(By.xpath(xpath)).isDisplayed();
	}
	
	public String verifyMensage(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public void ok(String classe) {
		driver.findElement(By.className(classe)).click();
	}
	
}
