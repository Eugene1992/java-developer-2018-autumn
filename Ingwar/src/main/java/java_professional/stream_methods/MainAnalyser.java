package java_professional.stream_methods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainAnalyser {
    public static void main(String[] args) {
        try {
            List<Object> trafficList =
                    Files.lines(Paths.get("D:\\Java\\IdeaProjects\\java-developer-2018-autumn\\Ingwar\\src\\main\\java\\java_professional\\stream_methods\\traffic_data.txt"))
                            .map(line -> Arrays.stream(line.split(" ")))
                            .peek(line -> createTrafficLine(line))
                            //.forEach(line Arrays.stream(line.split(" "))
                            //.filter(word -> word.matches("[0-9-.:]+"))
                            //.forEach(System.out::println);

                            .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createTrafficLine(Stream<String> line) {
        //Object[] wordLine =
        line.filter(word -> word.matches("[0-9-.:]+"))

                //.toArray();
                .forEach(System.out::println);
        System.out.println("line printed");
    }
}
