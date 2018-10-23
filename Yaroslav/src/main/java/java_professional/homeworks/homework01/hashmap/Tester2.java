package java_professional.homeworks.homework01.hashmap;


import java.util.Map;

public class Tester2 {

    public static void main(String[] args) {
        Map<Integer, String> map = new MyHashMap<>();
        System.out.println("HashMap - " + map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("HashMap пустая? - " + map.isEmpty());
        fillMapWithElements(map);
        System.out.println("HashMap пустая? - " + map.isEmpty());
        System.out.println("\n\n");


        int key = 4;
        String value = "Сатания";
        System.out.println("Добавляем значение " + value + " в HashMap по ключу " + key + ", который уже есть");
        map.put(key, "Сатания");
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");


        key = 145;
        System.out.println("Удаляем элемент по ключу " + key + " со значением " + map.remove(key));
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        key = 144;
        System.out.println("Удаляем элемент по ключу " + key + " со значением " + map.remove(key));
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        key = 4;
        System.out.println("Удаляем элемент по ключу " + key + " со значением " + map.remove(key));
        System.out.println(map.toString());
        System.out.println("Размер - " + map.size());
        System.out.println("\n\n");

    }


    /**
     * Метод для заполнения HashMap данными из масива строк с
     * подсчитаными по формуле ключами
     */
    public static void fillMapWithElements(Map<Integer,String> map){
        for (int i = 0; i < Constants.names.length; i++) {
            int key = (i * 5 + 2) * 2;
            String value = Constants.names[i];
            System.out.println("\t\t\t\tДобавление элемента: " + key + " = " + value);
            map.put(key, value);
            System.out.println("HashMap - " + map.toString());
            System.out.println("Размер - " + map.size());
            System.out.println("\n");
        }
    }
}
