package projecteuler.problem022;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileOperation
{
    public String readFile(String fileName)
    {
        List<String> list = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            list = stream
                        .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return list.get(0); //it is for all names are just in one line
    }
}
