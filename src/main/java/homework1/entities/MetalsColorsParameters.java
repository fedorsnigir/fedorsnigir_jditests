package homework1.entities;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static homework1.enums.metalsColors.ColorsEnum.RED;
import static homework1.enums.metalsColors.ElementsEnum.WATER;
import static homework1.enums.metalsColors.ElementsEnum.WIND;
import static homework1.enums.metalsColors.MetalsEnum.SELEN;
import static homework1.enums.metalsColors.VegetablesEnum.CUCUMBER;
import static homework1.enums.metalsColors.VegetablesEnum.TOMATO;

@AllArgsConstructor
public class MetalsColorsParameters {

    public static final MetalsColorsParameters TEST_PARAM = new MetalsColorsParameters(
            new ArrayList<Integer>() {{
                add(3);
                add(8);
            }},
            new ArrayList<String>() {{
                add(WATER.value);
                add(WIND.value);
            }},
            RED.value,
            SELEN.value,
            new ArrayList<String>() {{
                add(CUCUMBER.value);
                add(TOMATO.value);
            }});

    public List<Integer> summary;
    public List<String> elements;
    public String color;
    public String metals;
    public List<String> vegetables;
}
