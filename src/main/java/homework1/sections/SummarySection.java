package homework1.sections;

import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;

import java.util.HashMap;
import java.util.List;

public class SummarySection extends Section {

    @FindBy(css = "p")
    public RadioButtons radioButtons;

    HashMap<Integer, Integer> map;
    {
        map = new HashMap<>();
        for (int i=1; i<9; i++) {
            if (i < 5) {
                map.put(2*i-1, i);
            } else {
                map.put(2*i-8, i);
          }
        }
    }

    public void select(List<Integer> numbers) {
        for (int number : numbers) {
            radioButtons.select(map.get(number));
        }
    }
}
