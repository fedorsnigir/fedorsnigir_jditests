package homework2;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.init.PageFactory;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import homework1.JDISite;
import homework1.entities.MetalsColorsParameters;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import static homework1.JDISite.homePage;
import static homework1.JDISite.metalsColorsPage;
import static homework1.entities.User.PITER;
import static homework1.enums.PagesEnum.METALS_COLORS;

public class JDITests {

    public static final String JSON_PATH = "src/test/resources/JDI_ex8_metalsColorsDataSet.json";

    @DataProvider(name = "dataFromJson")
    public static Object[] provideDataFromJson() throws FileNotFoundException {
        File file = new File(JSON_PATH);
        FileReader fileReader = new FileReader(file);
        JsonElement jsonElement = new JsonParser().parse(fileReader);
        JsonObject jsonObject = jsonElement.getAsJsonObject();

        HashMap<String, MetalsColorsParameters> testData = new Gson().fromJson(jsonObject,
                new TypeToken<HashMap<String, MetalsColorsParameters>>() {}.getType());

        return testData.values().toArray();
    }

    @BeforeTest(alwaysRun = true)
    public void initialize() {
        PageFactory.initSite(JDISite.class);
        homePage.open();

        //1 Login on JDI site as User
        homePage.login(PITER);

        //2 Open Metals & Colors page by Header menu
        homePage.headerMenu.select(METALS_COLORS);
    }

    @AfterTest(alwaysRun = true)
    public void cleanUp() {
        WebDriverUtils.killAllSeleniumDrivers();
    }

    @AfterMethod(alwaysRun = true)
    public void cleanPage() {
        WebPage.refresh();
    }

    @Test(dataProvider = "dataFromJson")
    public void testMetalsColors(MetalsColorsParameters parameters) {

        //3 Fill form Metals & Colors by test data
        metalsColorsPage.fill(parameters);

        //4 Submit form Metals & Colors
        metalsColorsPage.submit();

        //5 Result sections should contains data below:
        metalsColorsPage.checkResults(parameters);
    }
}
