package java_professional.answers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SubCounterImpl {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("C:\\Users\\Evgeniy\\Desktop\\Новая папка\\java-developer-2018-autumn\\src\\main\\java\\java_professional\\answers\\Game.of.Thrones.-.03x02.txt"))
                .flatMap(line -> Arrays.stream(line.split(" |'")))
                .filter(word -> word.matches("[a-zA-Z']{3,}"))
                .map(s -> s.toLowerCase()) // .map(String::toLowerCase)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((o1, o2) -> (int)(o2.getValue() - o1.getValue()))
                .forEach(System.out::println);
    }
}
