package ro.fasttrackit.curs14.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class QuoteReaderFile {
    private final String filePath;

    public QuoteReaderFile (String filepath) {
        this.filePath = filepath;
    }

    public List<Quote> getQuotesList() throws Exception {
        int count=0;
        List<Quote> result = new ArrayList<>();
        try(BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                result.add(readLine(++count, line));
            }
        }
        return result;
    }

    private static Quote readLine(int id, String line) {
        String[] tokens = line.split(Pattern.quote("~"));
        return new Quote(id,tokens[0],tokens[1],false);

    }
}
