package java_professional.stream_methods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainAnalyser {
    private static List<LineTrafficUsing> trafficList = new ArrayList<>();
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("D:\\Java\\IdeaProjects\\java-developer-2018-autumn\\Ingwar\\src\\main\\java\\java_professional\\stream_methods\\traffic_data.txt"))
                    .forEach(line -> createTrafficLine(Arrays.stream(line.split("\\s"))));
            //.peek(line -> createTrafficLine(Arrays.stream(line.split("\\s"))));
            //.collect(Collectors.toList());
            trafficList.stream()
                    .sorted(Comparator.comparing(line -> line.getDateLine()))
                    .forEach(line -> System.out.println(line.toString()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createTrafficLine(Stream<String> line) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String[] wordLine = line
                .filter(word -> word.matches("[0-9-.:]+"))
                .toArray(String[]::new);
        Date lineDate = null;
        try {
            lineDate = format.parse(wordLine[0]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        trafficList.add(new LineTrafficUsing(lineDate, Double.parseDouble(wordLine[2]), Double.parseDouble(wordLine[3]),
                Double.parseDouble(wordLine[4]), Double.parseDouble(wordLine[5]), Double.parseDouble(wordLine[6]),
                Double.parseDouble(wordLine[7])));
    }
}
