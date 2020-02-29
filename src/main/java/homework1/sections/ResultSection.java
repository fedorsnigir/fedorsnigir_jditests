package homework1.sections;

import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import homework1.entities.MetalsColorsParameters;
import homework1.enums.metalsColors.ElementsEnum;
import homework1.enums.metalsColors.VegetablesEnum;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class ResultSection extends Section {

    @Css(".results li") public WebList resultsSection;

    public void check(MetalsColorsParameters parameters) {

        List<String> resultsList = resultsSection.getValuesFast();

        int sum = 0;
        for (int i: parameters.summary) { sum += i; }
        assertTrue(resultsList.contains("Summary: " + sum), "Summary not valid");

        for (String i: resultsList) {
            if (i.contains("Elements")) {
                for (ElementsEnum k: parameters.elements) {
                    assertTrue(i.contains(k.value), "Elements not valid: " + k);
                }
            }
        }

        assertTrue(resultsList.contains("Color: " + parameters.color), "Color not valid");
        assertTrue(resultsList.contains("Metal: " + parameters.metal), "Metal not valid");

        for (String i: resultsList) {
            if (i.contains("Vegetables")) {
                for (VegetablesEnum k: parameters.vegetables) {
                    assertTrue(i.contains(k.value), "Vegetables not valid: " + k);
                }
            }
        }
    }
}