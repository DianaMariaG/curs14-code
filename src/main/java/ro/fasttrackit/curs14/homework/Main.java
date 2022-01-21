package ro.fasttrackit.curs14.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        QuoteReaderFile reader = new QuoteReaderFile("src/main/resources/quotes.txt");
        List<Quote> quotes = reader.getQuotesList();
        QuoteService quoteService = new QuoteService(quotes);

        System.out.println(quoteService.getAllQuotes());

        System.out.println(quoteService.getAuthors());

        System.out.println(quoteService.getQuotesForAuthor("coco chanel"));

        quoteService.setFavouriteQuote(1);
        quoteService.setFavouriteQuote(15);
        quoteService.setFavouriteQuote(77);
        System.out.println(quoteService.getFavourites());

        System.out.println(quoteService.getRandomQuote());

        // TEST PENTRU RANDOM
//        Quote myQuote = new Quote(13,"Ana","Life is good",false);
//        List<Quote> myList = new ArrayList<>();
//        myList.add(myQuote);
//        QuoteService test = new QuoteService(myList);
//        for(int i = 0; i < 100; i++) {
//             System.out.println(test.getRandomQuote());
//         }
        }
    }

