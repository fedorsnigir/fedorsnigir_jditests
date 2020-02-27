package homework1.forms;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.Combobox;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.elements.common.Button;
import homework1.entities.MetalsColorsParameters;
import homework1.enums.metalsColors.ColorsEnum;
import homework1.enums.metalsColors.DropdownsEnum;
import homework1.enums.metalsColors.MetalsEnum;
import homework1.enums.metalsColors.VegetablesEnum;
import homework1.sections.SummarySection;

public class MetalsColorsForm extends Form<MetalsColorsParameters> {

    @FindBy(id = "summary-block")
    public SummarySection summary;

    @FindBy(css = "#elements-checklist input")
    public static Checklist elementsInput;

    @FindBy(css = "#elements-checklist p")
    public static Checklist elementsP;

    @FindBy(css = "#elements-checklist label")
    public static Checklist elementsLabel;

    @FindBy(css = ".colors")
    public Dropdown colors;

    @FindBy(css = "li")
    public Combobox metals;

    @FindBy(css = ".salad")
    public Dropdown vegetables;

    @FindBy(id = "submit-button")
    public Button submitButton;

    public void submit() {
        submitButton.click();
    }

    public void fill(MetalsColorsParameters parameters) {
//        summary.select(parameters.summary);
        System.out.println("HERE! elementsInput ---------- " + elementsInput.values());
        System.out.println("HERE! elementsP -------------- " + elementsP.values());
        System.out.println("HERE! elementsLabel ---------- " + elementsLabel.values());

        elementsInput.select("Wind");
//        elementsInput.check("Wind");


//        elements.select(parameters.elements.toArray(new ElementsEnum[0]).toString());
//        colors.select(parameters.color);
//        metals.select(parameters.metals);
//        vegetables.select(parameters.vegetables.get(0));
    }
//
//    public <T extends Enum> void selectDropdown(DropdownsEnum dropdown, T option) {
//        switch (dropdown) {
//            case COLORS:
//                colors.select((ColorsEnum) option);
//                break;
//            case METALS:
//                metals.select((MetalsEnum) option);
//                break;
//            case VEGETABLES:
//                vegetables.select((VegetablesEnum) option);
//                break;
//        }
//    }
}
