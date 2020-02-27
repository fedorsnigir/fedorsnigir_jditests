package homework1.entities;

import homework1.enums.metalsColors.ElementsEnum;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

import static homework1.enums.metalsColors.ColorsEnum.RED;
import static homework1.enums.metalsColors.ElementsEnum.WATER;
import static homework1.enums.metalsColors.ElementsEnum.WIND;
import static homework1.enums.metalsColors.MetalsEnum.SELEN;
import static homework1.enums.metalsColors.VegetablesEnum.CUCUMBER;
import static homework1.enums.metalsColors.VegetablesEnum.TOMATO;

@AllArgsConstructor
@NoArgsConstructor
public class MetalsColorsParameters {

    public static final MetalsColorsParameters TEST_FORM = new MetalsColorsParameters(
                    new ArrayList<Integer>() {{
                        add(3);
                        add(8);
                    }},
                    new ArrayList<ElementsEnum>() {{
                        add(WATER);
                        add(WIND);
                    }},
                    RED.value,
                    SELEN.value,
                    new ArrayList<String>() {{
                        add(CUCUMBER.value);
                        add(TOMATO.value);
                    }}
            );

    public ArrayList<Integer> summary;
    public ArrayList<ElementsEnum> elements;
    public String color;
    public String metals;
    public ArrayList<String> vegetables;
}
