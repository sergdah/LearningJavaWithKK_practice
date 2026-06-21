package practice7_Jun17;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "перв");
        map.put(1, "второй");
        map.put(2, "третий");
        map.put(3, "четверты");
        map.put(4, "пяты");
        map.put(5, "шесты");
        map.put(6, "сёмы");
        map.put(7, "восьмы");
        map.put(8, "девяты");
        map.put(9, "дзесяты");
        List<String> newList = new ArrayList<>();
        for (Map.Entry<Integer, String> thing : map.entrySet()) {
            if (thing.getKey() > 5) {
                newList.add(thing.getValue());
            }
        }
        int key = 1;
        Set<Integer> keyList = map.keySet();
        for(Integer e: keyList){
            String value = map.get(e);
            if (value.length() > 5){
                key = key * e;
            }
        }
        System.out.println("перемноженные ключи = " + key);

    }
}
