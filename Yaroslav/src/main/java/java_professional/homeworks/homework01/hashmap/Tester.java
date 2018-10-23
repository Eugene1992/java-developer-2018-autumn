package java_professional.homeworks.homework01.hashmap;


import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        Map<Integer, String> map = new MyHashMap<>();
        map.put(1, "Сатана");
        map.put(2, "Люцифер");
        map.put(3, "Самаєль");
        map.put(4, "Астарта");
        map.put(5, "Аввесалом");
        map.put(6, "Баал");
        map.put(7, "Набериус");
        map.put(8, "Азазель");
        map.put(9, "Вельзевул");
        map.put(10, "Астарот");
        map.put(11, "Мефистофель");
        map.put(12, "Асмодей");
        map.put(13, "Бельфегор");
        map.put(14, "Лилит");
        map.put(15, "Аббадон");
        map.put(16, "Белиал");
        map.put(17, "Маммон");

        //System.out.println(((MyHashMap<Integer, String>) map).table[7]);
        //System.out.println(((MyHashMap<Integer, String>) map).table[4]);
        //System.out.println(((MyHashMap<Integer, String>) map).table[6]);
        //System.out.println(((MyHashMap<Integer, String>) map).table[9]);
        //System.out.println(((MyHashMap<Integer, String>) map).table[13]);
        System.out.println(map.toString());
    }
}
