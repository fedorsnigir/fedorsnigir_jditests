package homework1;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.init.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static homework1.JDISite.homePage;
import static homework1.JDISite.metalsColorsPage;
import static homework1.entities.MetalsColorsParameters.TEST_PARAM;
import static homework1.entities.User.PITER;
import static homework1.enums.PagesEnum.METALS_COLORS;

public class JDITests{

    @BeforeTest(alwaysRun = true)
    public void initialize() {
        PageFactory.initSite(JDISite.class);
    }

    @Test
    public void testJDISite() throws InterruptedException {

        homePage.open();

        //1 Login on JDI site as User
        homePage.login(PITER);

        //2 Open Metals & Colors page by Header menu
        homePage.headerMenu.select(METALS_COLORS);

        //3 Fill form Metals & Colors by test data
        metalsColorsPage.fill(TEST_PARAM);

        //4 Submit form Metals & Colors
        metalsColorsPage.submit();

        //5 Result sections should contains data below:
        metalsColorsPage.checkResults(TEST_PARAM);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterTest(alwaysRun = true)
    public void cleanUp() {
        WebDriverUtils.killAllSeleniumDrivers();
    }
}
