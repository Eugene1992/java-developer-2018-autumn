package java_essential.singletone;

public class Test {
    public static void main(String[] args) {
//        Connection connection = new Connection("");
        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();

        System.out.println(connection1 == connection2);
    }
}
