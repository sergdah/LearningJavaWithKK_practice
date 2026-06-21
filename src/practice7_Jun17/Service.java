package practice7_Jun17;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public void auth (String login, String password)  {
        List<User> user = UserRepository.users;
        List<String> logins = new ArrayList<>();
        for (User u : user){
            logins.add(u.getLogin());
        }
        if(!logins.contains(login)){
            throw new UserNotFoundException();
        }
    }
}