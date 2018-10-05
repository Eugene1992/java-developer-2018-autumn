package java_essential.enums;

public class Test {
    public static void main(String[] args) {
//        System.out.println(RaceName.DWARF);

        calculate("Dwarff");
//        calculateWithRaceName(RaceName.DWARF);

        RaceName[] values = RaceName.values();
        for (RaceName value : values) {
            System.out.println(value);
        }

        RaceName dwarf = RaceName.valueOf("DWARF");

//        Country country = new Country();
    }


    public static void calculate(String raceName) {

    }

    public static void calculateWithRaceName(RaceName raceName) {
        System.out.println(raceName.name());
    }
}
