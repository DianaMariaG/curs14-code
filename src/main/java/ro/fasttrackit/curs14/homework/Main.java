package ro.fasttrackit.curs14.homework;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        QuoteReaderFile reader = new QuoteReaderFile("dir1/dir2/quotes.txt");
        List<Quote> quotes = reader.getQuotesList();
        QuoteService quoteService = new QuoteService(quotes);

        System.out.println(quoteService.getAllQuotes());
    }
}
