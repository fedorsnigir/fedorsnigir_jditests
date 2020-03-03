package homework1.sections;

import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import homework1.entities.MetalsColorsParameters;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class ResultSection extends Section {

    @Css(".results li") public WebList resultsSection;

    public void check(MetalsColorsParameters parameters) {
        List<String> resultsList = resultsSection.getValuesFast();

        if (parameters.summary != null) {
            int sum = 0;
            for (int i: parameters.summary) {
                sum += i;
            }
            assertTrue(resultsList.contains("Summary: " + sum), "Summary not valid");
        }

        if (parameters.elements != null) {
            for (String i : resultsList) {
                if (i.contains("Elements")) {
                    for (String k : parameters.elements) {
                        assertTrue(i.contains(k), "Elements not valid: " + k);
                    }
                }
            }
        }

        if (parameters.color != null) {
            assertTrue(resultsList.contains("Color: " + parameters.color), "Color not valid");
        }

        if (parameters.metals != null) {
            assertTrue(resultsList.contains("Metal: " + parameters.metals), "Metal not valid");
        }

        if (parameters.vegetables != null) {
            for (String i : resultsList) {
                if (i.contains("Vegetables")) {
                    for (String k : parameters.vegetables) {
                        assertTrue(i.contains(k), "Vegetables not valid: " + k);
                    }
                }
            }
        }
    }
}