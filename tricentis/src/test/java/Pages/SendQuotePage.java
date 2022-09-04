package Pages;

import org.openqa.selenium.WebDriver;

public class SendQuotePage {

private DSL dsl;
	
	public SendQuotePage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	public void setEmail(String email) {
		dsl.write("email", email);
	}
	
	public void setPhone(String phone) {
		dsl.write("phone", phone);
	}
	
	public void setUserName(String username) {
		dsl.write("username", username);
	}
	
	public void setPassword(String password) {
		dsl.write("password", password);
	}
	
	public void confirmPassword(String confirmpswd) {
		dsl.write("confirmpassword", confirmpswd);
	}
	
	public void sendComments(String comments) {
		dsl.write("Comments", comments);
	}
	
	public String getEmail() {
		return dsl.getValue("email");
	}
	
	public String getPhone() {
		return dsl.getValue("phone");
	}
	
	public String getUsername() {
		return dsl.getValue("username");
	}
	
	public String getPassword() {
		return dsl.getValue("password");
	}
	
	public String getPswdConfirm() {
		return dsl.getValue("confirmpassword");
	}
	
	public String getComments() {
		return dsl.getValue("Comments");
	}
	
	public void next() {
		dsl.next("sendemail");
	}
}
