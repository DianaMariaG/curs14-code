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
            allQuotes.add(element.getQuote());
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
            if (!allAuthors.contains(element.getAuthor())) {
                allAuthors.add(element.getAuthor());
            }
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
        Random random = new Random();
        int randomIdPosition = random.nextInt(quotes.size()); //nextInt e de la 0 la size()-1
        //intoarce prin get obiectul Quote de pe pozitia randomIdPosition
        return quotes.get(randomIdPosition).getQuote();
    }
}
