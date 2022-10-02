package mikailov038.config;

import org.springframework.stereotype.Component;
import mikailov038.model.User;
import mikailov038.service.UserService;

import javax.annotation.PostConstruct;

@Component
public class Initializer {
    private final UserService userService;

    public Initializer(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    private void init() {
        User user = new User("Farxad", "Mikailov", 25, "Moscow", "mikailov038@mail.ru");
        userService.addUser(user);

        User user1 = new User("Petr", "ivanov", 20, "Maxachkala", "petrov@gmail.com");
        userService.addUser(user1);

        User user2 = new User("Katerina", "Gluxar", 28, "Kaluga", "gluxaya@mail.ru");
        userService.addUser(user2);

        User user3 = new User("Vovan", "Medvedev", 33, "Islamabad", "papap@yahoo.com");
        userService.addUser(user3);

        User user4 = new User("Usama", "Bin laden", 33, "Kabul", "boom@gmail.com");
        userService.addUser(user4);
    }
}


