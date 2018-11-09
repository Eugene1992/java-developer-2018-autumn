package java_professional.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamInitMethodsTest {
    public static void main(String[] args) throws IOException {
        Stream.of("a", "b", "c").forEach(a -> System.out.println(a));

        Arrays.stream(new int[]{2, 5, 2, 42}).forEach(a -> System.out.println(a));

        Files.lines(Paths.get("C:\\Users\\Evgeniy\\Desktop\\Новая папка\\java-developer-2018-autumn\\src\\main\\java\\java_professional\\java8\\test"))
                .forEach(a -> System.out.println(a));

        "Hello world".chars()
                .forEach(a -> System.out.println(a));

        Stream.Builder<Object> a = Stream.builder()
                .add("a");

        System.out.println();
        System.out.println();
        System.out.println();

        a.add("b");

        a.build().forEach(x -> System.out.println(a));

        /*Stream.iterate(1, n -> n + 1)
                .forEach(x -> System.out.println(x));*/

        Stream.generate(() -> "a1")
                .forEach(x -> System.out.println(x));
    }
}