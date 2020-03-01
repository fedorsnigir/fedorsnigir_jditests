package homework1.entities;

import homework1.enums.metalsColors.ColorsEnum;
import homework1.enums.metalsColors.ElementsEnum;
import homework1.enums.metalsColors.MetalsEnum;
import homework1.enums.metalsColors.VegetablesEnum;
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
                    new ArrayList<ElementsEnum>() {{
                        add(WATER);
                        add(WIND);
                    }},
                    RED,
                    SELEN,
                    new ArrayList<VegetablesEnum>() {{
                        add(CUCUMBER);
                        add(TOMATO);
                    }});

    public List<Integer> summary;
    public List<ElementsEnum> elements;
    public ColorsEnum color;
    public MetalsEnum metal;
    public List<VegetablesEnum> vegetables;
}
