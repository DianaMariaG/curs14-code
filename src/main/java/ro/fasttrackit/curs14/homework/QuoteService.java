package ro.fasttrackit.curs14.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteService {
    private final List<Quote> quotes;

    public QuoteService(List<Quote> quotes) {
        this.quotes = quotes == null
                ? new ArrayList<>()
                : new ArrayList<>(quotes);
    }

    public List<String> getAllQuotes() {
        List<String> allQuotes = new ArrayList<>();
        for (Quote element : quotes) { //am scris "element" in loc de "quote" ca sa nu se confunde obiectul cu state-ul quote
            allQuotes.add(element.getQuote()); //mai trebuie sa fac metoda add in clasa Quote??
        }
        return allQuotes;
    }

    public List<Quote> getQuotesForAuthor (String author) {
        List<Quote> quotesForAuthor = new ArrayList<>();
        if (author != null) {
            for (Quote element : quotes) {
                if (element.getAuthor().equalsIgnoreCase(author)) {
                    quotesForAuthor.add(element);
                }
            }
        }
        return quotesForAuthor;
    }

    public List<String> getAuthors() {
        List<String> allAuthors = new ArrayList<>();
        for (Quote element : quotes) {
            allAuthors.add(element.getAuthor());
        }
        return allAuthors;
    }

    public void setFavouriteQuote (int id) { //id nu poate fi null pt ca e Integer
       for (Quote element : quotes) {
           if (element.getId() == id) {
               element.setFavourite(true);
           }
       }
    }
    public List<Quote> getFavourites() {
        List<Quote> allFavouriteQuotes = new ArrayList<>();
        for (Quote element : quotes) {
            if (element.isFavourite()) {
                allFavouriteQuotes.add(element);
            }
        }
        return allFavouriteQuotes;
    }

    public String getRandomQuote() {
        String foundQuote = "";
        System.out.println("Introduce the id of the quote: ");
        Random random = new Random();
        int userId = random.nextInt();
        for (Quote element : quotes) {
            if (userId == element.getId()) {
                foundQuote = "" + element.getQuote();
            }
        }
        return foundQuote;
    }

    public int findId(Quote givenQuote) {
        int foundID = 0;
        for (int i = 1; i< quotes.size(); i++) {
            if (givenQuote == quotes.get(i)){
                foundID = i;
            }
        }
        return foundID;
    }
}
