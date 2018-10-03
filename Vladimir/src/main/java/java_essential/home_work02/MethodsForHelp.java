package java_essential.home_work02;

public class MethodsForHelp {
    public static int getRundomNumber(int a, int b) {
        int number = (int) (Math.random() * (b - a)) + a;
        return number;
    }

    static String[] nameForComp = {"Теодор", "Солмир", "Серена", "Халон", "Даремиф", "Астрал", "Пигуедрам", "Торосар"};

    public static String getCompRandomName() {
        String compRandomName = nameForComp[MethodsForHelp.getRundomNumber(0, (nameForComp.length - 1))];
        return compRandomName;
    }
}
