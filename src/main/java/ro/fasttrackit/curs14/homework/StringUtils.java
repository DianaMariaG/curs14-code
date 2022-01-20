package ro.fasttrackit.curs14.homework;

public class StringUtils {

    public static String ensureNotEmpty(String word) {
        return word == null || "".equalsIgnoreCase(word.trim()) ? "n/a" : word;
    }
    public static int validID (int id) {
        return Math.max(id, 1);
    }
}
