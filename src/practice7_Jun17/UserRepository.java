package practice7_Jun17;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static List<User> users;

   static{
     users = new ArrayList<>();
     users.add(new User("sirozha","SyrVsa34", "Сирожа","ЛастНэйм"));
     users.add(new User("vasia","SyrVsa34", "Дима","Продиджи"));
     users.add(new User("olya","SyrVsa34", "Оля","Гуд"));
   }

}
