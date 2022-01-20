package ro.fasttrackit.curs14.homework;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        QuoteReaderFile reader = new QuoteReaderFile("src/main/resources/quotes.txt");
        List<Quote> quotes = reader.getQuotesList();
        QuoteService quoteService = new QuoteService(quotes);

        System.out.println(quoteService.getAllQuotes());
    }
}
