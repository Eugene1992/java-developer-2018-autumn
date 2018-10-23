package java_professional.homeworks.homework01.hashmap;


import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        Map<Integer, String> map = new MyHashMap<>();
        System.out.println("HashMap - " + map.toString());
        System.out.println("Размер - " + map.size());



        map.put(11, "Сатана");
        System.out.println("HashMap - " + map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

        map.put(22, "Люцифер");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

        map.put(33, "Самаєль");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

        map.put(44, "Астарта");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

        map.put(55, "Аввесалом");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

        map.put(66, "Баал");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

        map.put(77, "Набериус");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

        map.put(88, "Азазель");        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

        map.put(99, "Вельзевул");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

        map.put(100, "Астарот");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

        map.put(110, "Мефистофель");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

        map.put(120, "Асмодей");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

        map.put(130, "Бельфегор");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

        map.put(140, "Лилит");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

        map.put(150, "Аббадон");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

        map.put(160, "Белиал");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

        map.put(170, "Маммон");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");


        System.out.println("");
        map.put(11, "САТАНА");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());


        System.out.println(map.remove(140));

        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());

        //System.out.println(((MyHashMap<Integer, String>) map).table[7]);
        //System.out.println(((MyHashMap<Integer, String>) map).table[4]);
        //System.out.println(((MyHashMap<Integer, String>) map).table[6]);
        //System.out.println(((MyHashMap<Integer, String>) map).table[9]);
        //System.out.println(((MyHashMap<Integer, String>) map).table[13]);

        /*System.out.println(map.get(17));
        System.out.println(map.get(12));
        System.out.println(map.get(1));
        map.clear();
        System.out.println(map.toString());*/
    }




    public static void fillMapWithElements(Map<Integer,String> map){
        for (int i = 0; i < Constants.names.length; i++) {
            int key = (i * 11 - 2) * 3;
            map.put(key, Constants.names[i]);
        }
    }
}
