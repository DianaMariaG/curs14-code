package ro.fasttrackit.curs14.homework;

import java.util.List;
import java.util.Objects;

import static ro.fasttrackit.curs14.homework.StringUtils.*;

public class Quote {
    private final int id;
    private final String author;
    private final String quote;
    private boolean favourite; //are setter => nu e final

    public Quote (int id, String author, String quote, boolean favourite) {
        this.id = validID(id);
        this.author = ensureNotEmpty(author);
        this.quote = ensureNotEmpty(quote);
        this.favourite = favourite;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote1 = (Quote) o;
        return id == quote1.id && favourite == quote1.favourite && Objects.equals(author, quote1.author) && Objects.equals(quote, quote1.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, quote, favourite);
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", quote='" + quote + '\'' +
                ", favourite=" + favourite +
                '}';
    }
    public void addQuote(String quote) {

    }
}

