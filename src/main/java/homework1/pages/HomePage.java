package homework1.pages;

import com.epam.jdi.light.elements.complex.Menu;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.elements.common.Button;
import homework1.entities.User;
import homework1.forms.LoginForm;

public class HomePage extends WebPage {

    public LoginForm loginForm;

    @FindBy(xpath = "//*[contains(@class,'nav')]//a")
    public Menu headerMenu;

    @FindBy(css = ".profile-photo")
    public Button profilePhoto;

    @FindBy(id = "user-name")
    public Button username;

    public void login(User user) {
        profilePhoto.click();
        loginForm.loginAs(user);
    }

    public String getUserName() {
        return username.getText();
    }
}