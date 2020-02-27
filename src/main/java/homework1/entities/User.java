package homework1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {

    public static final User PITER = new User(
            "epam",
            "1234",
            "PITER CHAILOVSKII");

    private final String login;
    private final String password;
    private final String userName;
}
