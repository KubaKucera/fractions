package pro1;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Path inputDir = Paths.get(System.getProperty("user.dir"), "input");
        Path outputDir = Paths.get(System.getProperty("user.dir"), "output");

        if (!Files.exists(outputDir)) Files.createDirectory(outputDir);
        if (!Files.exists(inputDir)) {
            System.out.println("Složka 'input' neexistuje!");
            return;
        }

        try (DirectoryStream<Path> files = Files.newDirectoryStream(inputDir, "*.csv")) {
            for (Path inputFile : files) {
                List<String> lines = Files.readAllLines(inputFile);
                List<ExamRecord> records = new ArrayList<>();

                for (String line : lines) {
                    line  = line.trim();
                    if (line.isEmpty()) continue;

                    String[] parts = line.split("\\s*[;=:]\\s*");
                    if (parts.length < 2) {
                        System.out.println("Chybný řádek, přeskočeno: " + line);
                        continue;
                    }

                    String name = parts[0].trim();
                    Fraction score = Fraction.parse(parts[1].trim());

                    records.add(new ExamRecord(name, score));
                }

                List<String> result = new ArrayList<>();
                for (ExamRecord r : records) {
                    result.add(r.getPersonId() + "," + r.getScore());
                }

                Path out = outputDir.resolve(inputFile.getFileName());
                Files.write(out, result);
            }
        }

        System.out.println("Hotovo");
    }
}
