package homework1.enums;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
public enum PagesEnum {

    HOME("Home"),
    CONTACT_FORM("Contact Form"),
    SERVICE("Service"),
    METALS_COLORS("Metals & Colors");

    public String value;
}
